package com.cotx;

import com.cotx.props.SystemProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@MapperScan(basePackages = "com.cotx.*.dao")
@EnableConfigurationProperties(SystemProperties.class)
public class SpringbootErrorHandle {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootErrorHandle.class, args);
    }
}
