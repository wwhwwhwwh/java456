package com.java456.service.Impl;


import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.java456.dao.DownDao;
import com.java456.entity.Down;
import com.java456.service.DownService;


@Service("downService")
public class DownServiceImpl implements DownService {
	
	@Resource
	private DownDao  downDao;
	
	@Override
	public Integer add(Down down) {
		// TODO Auto-generated method stub
		return downDao.add(down);
	}
	
	@Override
	public Integer update(Down down) {
		// TODO Auto-generated method stub
		return downDao.update(down);
	}

	@Override
	public List<Down> list(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return downDao.list(map);
	}

	@Override
	public Integer getTotal(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return downDao.getTotal(map);
	}

	@Override
	public Down findById(Integer id) {
		// TODO Auto-generated method stub
		return downDao.findById(id);
	}

	@Override
	public Integer delete(Integer id) {
		// TODO Auto-generated method stub
		return downDao.delete(id);
	}

}
