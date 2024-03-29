package com.example.wiki_helen;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
@MapperScan("com.example.wiki_helen.mapper")
public class WikiHelenApplication {

    private static final Logger LOG = LoggerFactory.getLogger(WikiHelenApplication.class);

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(WikiHelenApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("run application successful");
        LOG.info("ip: \thttp://127.0.0.1:{}", env.getProperty("server.port"));

    }

}
