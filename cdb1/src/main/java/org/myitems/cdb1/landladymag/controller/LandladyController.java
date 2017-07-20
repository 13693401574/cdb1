package org.myitems.cdb1.landladymag.controller;


import javax.annotation.Resource;

import org.myitems.cdb1.beans.Pager;
import org.myitems.cdb1.beans.PublicMap;
import org.myitems.cdb1.landladymag.service.ICarportIssueService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/landladys")
@Controller
public class LandladyController {

	@Resource
	private ICarportIssueService carportIssueServiceImpl;
	
	@RequestMapping(value="/id",method=RequestMethod.POST,produces="application/json;charset=utf-8")
	public @ResponseBody Pager getCarportIssue(@RequestBody PublicMap publicMap){
		Pager p=new Pager();
		p.setPage(Integer.parseInt(publicMap.getPage()));
		p.setRows(Integer.parseInt(publicMap.getRows()));
		carportIssueServiceImpl.getCarportIssueListByItems(publicMap.getMap(), p);
		System.out.println(p);
		return p;
	}
}
