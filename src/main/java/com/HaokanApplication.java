package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@EnableTransactionManagement//开启事务管理
@MapperScan("com.mapper")//将项目中对应的mapper类的路径加进来就可以了
public class HaokanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HaokanApplication.class, args);
	}
}
