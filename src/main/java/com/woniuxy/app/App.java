package com.woniuxy.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages =  {"com.woniuxy"})
@EnableTransactionManagement // 启动声明式事务
@MapperScan("com.woniuxy.dao") //扫包扫子配置
public class App {
	public static void main(String[] args) {
		
		SpringApplication.run(App.class, args);
	
	}
}
