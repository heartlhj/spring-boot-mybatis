
package com.lhj.gogo.web.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ServletComponentScan
@SpringBootApplication
@MapperScan("com.lhj.gogo.**.dao")
@PropertySource(value = { "classpath:env.properties","classpath:httpclient.properties" })
@ImportResource({"classpath:dubbo-consumer.xml"})
@ComponentScan(basePackages = "com.lhj.gogo")
public class SampleWebFreeMarkerApplication  extends SpringBootServletInitializer{


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SampleWebFreeMarkerApplication.class);
    }
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SampleWebFreeMarkerApplication.class, args);
	}

}
