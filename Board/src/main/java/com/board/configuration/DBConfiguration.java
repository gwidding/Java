package com.board.configuration;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

// 여기에 설정을 할 거라고 알려줌
@Configuration
// 해당 클래스에서 참조할 properties 파일 위치 지정
@PropertySource("classpath:/application.properties")
public class DBConfiguration {
	
	//Bean 낱개로 만든 객체를 한 곳에 모아두는 역할
	@Autowired
	private ApplicationContext applicationContext;
	// ApplicationContext는 스프링 컨테이너. Bean의 생명주기 관리
	
	// 객체
	@Bean
	// 접두사(prefix) 지정
	// spring.datasource.hikari로 시작하는 설정을 메서드에 매핑
	@ConfigurationProperties(prefix="spring.datasource.hikari")
	public HikariConfig hikariConfig() {
		return new HikariConfig();
	}
	// hikariConfig는 Connection Pool 라이브러리
	
	
	// 데이터 소스 객체 생성
	// 순수 JDBC 실행하는 것보다 리소스 절약
	@Bean
	public DataSource dataSource() {
		return new HikariDataSource(hikariConfig());
	}
	
	// 데이터베이스 커넥션과 SQL 실행을 제어하는 객체 생성
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception{
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource());
//		factoryBean.getObject();
		factoryBean.setMapperLocations(applicationContext.getResources("classpath:/mappers/**/*Mapper.xml"));
		factoryBean.setTypeAliasesPackage("com.board.domain");
		factoryBean.setConfiguration(mybatisConfg());
		return factoryBean.getObject();

	}
	
	@Bean
	public SqlSessionTemplate sqlSession() throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory());
	}
	
	@Bean
	@ConfigurationProperties(prefix = "mybatis.configuration")
	public org.apache.ibatis.session.Configuration mybatisConfg() {
		return new org.apache.ibatis.session.Configuration();
	}
	

}
