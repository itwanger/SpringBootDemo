package com.cmower.HikariCPDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;
import java.sql.Connection;

@SpringBootApplication
public class HikariCpDemoApplication implements CommandLineRunner {
	@Autowired
	private DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(HikariCpDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Connection conn = dataSource.getConnection();
		conn.close();
	}
}
