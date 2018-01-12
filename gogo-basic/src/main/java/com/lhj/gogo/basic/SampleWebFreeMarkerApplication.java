/*
 * Copyright 2012-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lhj.gogo.basic;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.jolbox.bonecp.BoneCPDataSource;
@Configuration
@SpringBootApplication
@PropertySource(value = { "classpath:jdbc.properties", "classpath:env.properties",
"classpath:httpclient.properties" })
@MapperScan("com.lhj.gogo.basic.dao")
@ComponentScan(basePackages = "com.lhj.gogo.basic")
public class SampleWebFreeMarkerApplication  extends SpringBootServletInitializer{

	    @Value("${jdbc.url}")
	    private String jdbcUrl;

	    @Value("${jdbc.driverClassName}")
	    private String jdbcDriverClassName;

	    @Value("${jdbc.username}")
	    private String jdbcUsername;

	    @Value("${jdbc.password}")
	    private String jdbcPassword;

	    @Bean("dataSource")
	    public DataSource dataSource() {
	        BoneCPDataSource boneCPDataSource = new BoneCPDataSource();
	        // 数据库驱动
	        boneCPDataSource.setDriverClass(jdbcDriverClassName);
	        // 相应驱动的jdbcUrl
	        boneCPDataSource.setJdbcUrl(jdbcUrl);
	        // 数据库的用户名
	        boneCPDataSource.setUsername(jdbcUsername);
	        // 数据库的密码
	        boneCPDataSource.setPassword(jdbcUsername);
	        // 检查数据库连接池中空闲连接的间隔时间，单位是分，默认值：240，如果要取消则设置为0
	        boneCPDataSource.setIdleConnectionTestPeriodInMinutes(60);
	        // 连接池中未使用的链接最大存活时间，单位是分，默认值：60，如果要永远存活设置为0
	        boneCPDataSource.setIdleMaxAgeInMinutes(30);
	        // 每个分区最大的连接数
	        boneCPDataSource.setMaxConnectionsPerPartition(100);
	        // 每个分区最小的连接数
	        boneCPDataSource.setMinConnectionsPerPartition(5);
	        return boneCPDataSource;
	    }

	    @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	        return builder.sources(SampleWebFreeMarkerApplication.class);
	    }

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SampleWebFreeMarkerApplication.class, args);
	}

}
