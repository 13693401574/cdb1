package org.myitems.cdb1.landladymag.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.myitems.cdb1.beans.PredetermineCarportBean;
import org.myitems.cdb1.landladymag.dao.IPredetermineCarportDao;
import org.myitems.cdb1.landladymag.mapper.PredetermineCarportMapper;
import org.springframework.stereotype.Repository;


/**
 * 包租婆车位预约信息持久层实现类
 * @author Administrator
 *
 */
@Repository
public class PredetermineCarportDaoImpl implements IPredetermineCarportDao {

	@Resource
	private SessionFactory sf;
	@Resource
	private PredetermineCarportMapper pcm;
	
	
	public int updatePredetermineCarportById(Long id) {
		// TODO Auto-generated method stub
		return pcm.updatePredetermineCarportById(id);
	}

	public int getCountPredetermineCarportListByItems(Map map) {
		// TODO Auto-generated method stub
		return pcm.getCountPredetermineCarportListByItems(map);
	}

	public List<PredetermineCarportBean> getPredetermineCarportListByItems(Map map) {
		// TODO Auto-generated method stub
		return pcm.getPredetermineCarportListByItems(map);
	}

	@Override
	public int updatePredetermineCarportByFkCorportIssueId(Long fkCorportIssueId) {
		// TODO Auto-generated method stub
		return pcm.updatePredetermineCarportByFkCorportIssueId(fkCorportIssueId);
	}

	@Override
	public void savePredetermineCarport(PredetermineCarportBean predetermineCarport) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().save(predetermineCarport);
	}

	@Override
	public PredetermineCarportBean getPredetermineCarportById(Long id) {
		// TODO Auto-generated method stub
		return pcm.getPredetermineCarportById(id);
	}

}
