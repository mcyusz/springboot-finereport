package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tianwenyuan
 * Date: 2020/3/22
 * Time: 11:46 上午
 */
@SpringBootApplication
public class FineReportApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(FineReportApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(FineReportApplication.class, args);
    }

}
