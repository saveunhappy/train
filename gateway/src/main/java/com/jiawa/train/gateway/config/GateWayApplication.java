package com.jiawa.train.gateway.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@SpringBootApplication
@ComponentScan("com.jiawa")
public class GateWayApplication {
	private static final Logger logger = LoggerFactory.getLogger(GateWayApplication.class);
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(GateWayApplication.class);
		Environment env = app.run(args).getEnvironment();
		logger.info("启动成功！！");
		logger.info("网关地址: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
	}

}
