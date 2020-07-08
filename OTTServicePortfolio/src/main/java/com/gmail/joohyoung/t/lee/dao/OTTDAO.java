package com.gmail.joohyoung.t.lee.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OTTDAO {

	//Hibernate는 세션 팩토리
	@Autowired
	private SessionFactory sessionFactory;
}
