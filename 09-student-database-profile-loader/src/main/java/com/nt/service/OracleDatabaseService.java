package com.nt.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Service
@Profile("oracle")
@ConfigurationProperties(prefix="database")
public class OracleDatabaseService implements StudentDatabaseService {
	@Value("${database.url}")
	private String databaseUrl;

	@Value("${database.username}")
	private String username;

	@Value("${database.name}")
	private String databaseName;
	@Override
	public void connectDatabase() {
		IO.println(databaseName+" Database connected Successfull...");
	}

	@Override
	public void displayDatabaseInfo() {
		IO.println("Database URL: "+databaseUrl);
		IO.println("Username: "+username);
		IO.print("Database Name: "+databaseName);

	}


}
