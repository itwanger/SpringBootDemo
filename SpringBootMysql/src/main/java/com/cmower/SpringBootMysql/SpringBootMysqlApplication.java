package com.cmower.SpringBootMysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.UUID;

@SpringBootApplication
@RestController
public class SpringBootMysqlApplication {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMysqlApplication.class, args);
	}

	@RequestMapping("insert")
	public String insert() {
		String id = UUID.randomUUID().toString();
		String sql = "insert into mysql_datasource (id,name) values ('"+id+"','沉默王二')";
		jdbcTemplate.execute(sql);
		return "插入完毕";
	}


}
