package com.offcn.service.impl;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.dao.MDao;
import com.offcn.po.Mobile;
import com.offcn.service.MService;
@Service
public class MServiceImpl implements MService {
@Autowired
MDao dao;
	@Override
	public Mobile find(String number) {
		if(number.length()>7){
			number=number.substring(0, 7);
		}
		return dao.find(number);
	}

}
