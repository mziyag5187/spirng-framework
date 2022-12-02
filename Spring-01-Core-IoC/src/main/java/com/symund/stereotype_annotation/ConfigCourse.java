package com.symund.stereotype_annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan // go to above package and find the classes with @component inside and generate beans from them
@ComponentScan(basePackages = "com.symund")
public class ConfigCourse {

}
