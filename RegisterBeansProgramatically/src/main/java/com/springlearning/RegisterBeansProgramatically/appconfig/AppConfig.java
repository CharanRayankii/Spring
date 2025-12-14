package com.springlearning.RegisterBeansProgramatically.appconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration
@ComponentScan(basePackages = "com.springlearning.RegisterBeansProgramatically.models")
public class AppConfig {

}
