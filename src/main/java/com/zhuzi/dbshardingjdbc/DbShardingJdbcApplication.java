package com.zhuzi.dbshardingjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class DbShardingJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbShardingJdbcApplication.class, args);
    }

}
