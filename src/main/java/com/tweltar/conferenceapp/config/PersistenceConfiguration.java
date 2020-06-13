package com.tweltar.conferenceapp.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceConfiguration {
	@Bean
	public DataSource dataSource() {
		DataSourceBuilder builder = DataSourceBuilder.create();
		builder.url("jdbc:mysql://localhost:3306/conference_app");
		System.out.println("My custom datasource bean has been initialized and set");
		return builder.build();
	}
}
