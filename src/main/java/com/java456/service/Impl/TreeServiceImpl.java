package com.java456.service.Impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

import com.java456.dao.TreeDao;
import com.java456.entity.Tree;
import com.java456.service.TreeService;

import javax.annotation.Resource;



@Service("treeService")
public class TreeServiceImpl implements TreeService {
	
	@Resource
	private TreeDao  treeDao;
	
	public Tree findById(Integer id) {
		return treeDao.findById(id);
	}
	
	public List<Tree> getTreesByFatherOrIds(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return treeDao.getTreesByFatherOrIds(map);
	}
 
	


	 
}
