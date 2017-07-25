package org.myitems.cdb1.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.myitems.cdb1.beans.BackStatus;
import org.myitems.cdb1.beans.CompanyUserBean;
import org.myitems.cdb1.beans.Pager;
import org.myitems.cdb1.usermag.service.ICompanyService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/company")
@Controller
public class AddCompanyUserController {
	@Resource
	private ICompanyService companyServiceImpl;

	@RequestMapping(value="/add",method=RequestMethod.POST,produces={"application/json;charset=UTF-8"})		
	
	public @ResponseBody BackStatus addCompanyUser(@RequestBody CompanyUserBean com ){		
		Long rows=companyServiceImpl.addCompanyUser(com);
		if(rows!=null){
			return new BackStatus(true,"添加成功");
		}
		return new BackStatus(false,"添加失败");
		
	}
	//刷新页面
	@RequestMapping(value="/all",method=RequestMethod.POST,produces={"application/json;charset=UTF-8"})		
	public  @ResponseBody Pager findAll(@RequestBody Map map){

		List<CompanyUserBean> company= companyServiceImpl.findCompanyUser(map);
		//得到总数
		int count=	companyServiceImpl.findCount();
		System.out.println(count);
		//将数据添加到分页对象中
		Pager p=new Pager();		
		p.setPage((int)map.get("page"));
		p.setDatas(company);
		p.setTotalRows(count);
		p.setTotalPage((int) Math.ceil((double)count/(int)map.get("rows")));
		return p;
	}
	
	/**
	 *根据iD查看企业员工信息
	 * @return
	 */
	@RequestMapping(value="/select",method=RequestMethod.POST)	
	@ResponseBody
	public CompanyUserBean selectCompanyUser(HttpServletRequest request){
		
		String id=request.getParameter("id");	
		Long Id=Long.parseLong(id);//string转换成long
		System.out.println(Id);	
		
		CompanyUserBean com=companyServiceImpl.selectCompanyUser(Id);
		//返回到页面
		request.getSession().setAttribute("com",com);
		return com;
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.POST)	
	public @ResponseBody BackStatus deleteCompanyUser(HttpServletRequest request){
		String  id=request.getParameter("id");
		Long Id=Long.parseLong(id);//string转换成long
		System.out.println(Id);	
		CompanyUserBean com=companyServiceImpl.selectCompanyUser(Id);
		int rows=companyServiceImpl.deleteCompanyUser(com);
		if(rows==1){
			return new BackStatus(true,"删除成功");
		}
		return  new BackStatus(false,"删除失败");
		
	}

	
	
}
