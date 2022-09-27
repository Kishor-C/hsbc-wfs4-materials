package com.hsbc;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.hsbc.model.beans.User;
import com.hsbc.model.dao.TestDaoImpl;
import com.hsbc.model.service.UserService;

/*
 * Takes care of auto-configuration based on the libraries in your classpath
 * Configures web environment set up like component-scan, dependency
 * Injection, Server set up when you have spring-boot-starter-web
 * Configures database resources set up when you add 
 * spring-boot-starter-data library like creating DMDS and JdbcTemplate
 * objects and supplying the dependencies wherever required
 */
@SpringBootApplication
public class AppBoot {

	public static void main(String[] args) {
		SpringApplication.run(AppBoot.class, args);
	}
	// a method with @Bean is called by spring container automatically
	/*
	 * @Bean public CommandLineRunner load(ApplicationContext ctx) { return (args)
	 * -> { UserService service = ctx.getBean(UserService.class); List<User> users =
	 * service.fetchUsers(); users.forEach(item -> System.out.println(item));
	 * System.out.println("_________________"); }; }
	 */
}
