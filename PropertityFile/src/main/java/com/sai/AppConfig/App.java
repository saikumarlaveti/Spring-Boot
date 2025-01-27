package com.sai.AppConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("com.sai")
@PropertySource("classpath:information.properties")
public class App {

}
