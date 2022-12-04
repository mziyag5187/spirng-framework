package com.symund.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.symund")
@ComponentScan(basePackages = {"com.symund.proxy","com.symund.service","com.symund.repository"})
public class ProjectConfig {
}
