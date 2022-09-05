package com.zj.springboot;

import com.zj.springboot.utils.StartUpUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication( exclude = {DataSourceAutoConfiguration.class})
public class SpringbootApplication {

	public static void main(String[] args) {
		//熔断器接口配置
		System.setProperty("csp.sentinel.dashboard.server","0.0.0.0:8081");
		//熔断器应用名配置
		System.setProperty("project.name","sentinel-demo");
		SpringApplication.run(SpringbootApplication.class, args);
		//启动jar包工具类(或者单独运行sentinel的jar包)
		//StartUpUtil.start("sentinel-dashboard-1.8.1.jar",null,true);
	}

}
