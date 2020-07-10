package com.gmail.joohyoung;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//설정 파일을 읽어오는 코드
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class UsersTest {
	
	//데이터베이스 연결을 테스트
	@Autowired
	private DataSource dataSource;

	//데이터베이스 연결을 테스트
	@Test
	public void connectTest() {
		try {
			GenericXmlApplicationContext context = 
					new GenericXmlApplicationContext(
						"root-context.xml");
			//하버네이트 설정 확인
			SessionFactory sessionFactory = context.getBean(SessionFactory.class);
			System.out.println(sessionFactory);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
}
