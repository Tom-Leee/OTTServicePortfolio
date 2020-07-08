package com.gmail.joohyoung.t.lee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmail.joohyoung.t.lee.dao.OTTDAO;

@Service
public class ContentsServiceImpl implements OTTService {
	@Autowired
	private OTTDAO ottDao;
}
