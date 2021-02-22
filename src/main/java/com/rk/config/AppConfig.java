package com.rk.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.rk")
public class AppConfig {
	@Bean
	public DataSource ds() {
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dmds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dmds.setUsername("System");
		dmds.setPassword("system");
		return dmds;
	}

	@Bean
	public JdbcTemplate jt() {
		return new JdbcTemplate(ds());
	}

}
