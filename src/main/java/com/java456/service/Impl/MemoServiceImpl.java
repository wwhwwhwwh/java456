package com.java456.service.Impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java456.dao.LinkDao;
import com.java456.dao.MemoDao;
import com.java456.entity.Memo;
import com.java456.service.MemoService;



@Service("memoService")
public class MemoServiceImpl implements MemoService {
	

	@Resource
	private MemoDao memoDao;
	
	@Override
	public Integer add(Memo memo) {
		// TODO Auto-generated method stub
		return memoDao.add(memo);
	}

	@Override
	public Integer update(Memo memo) {
		// TODO Auto-generated method stub
		return memoDao.update(memo);
	}

	@Override
	public List<Memo> list(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return memoDao.list(map);
	}

	@Override
	public Integer getTotal(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return memoDao.getTotal(map);
	}

	@Override
	public Memo findById(Integer id) {
		// TODO Auto-generated method stub
		return memoDao.findById(id);
	}

	@Override
	public Integer delete(Integer id) {
		// TODO Auto-generated method stub
		return memoDao.delete(id);
	}
	
}
