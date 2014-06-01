package com.makeasoup.edashboard;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.makeasoup.edashboard.web.config.ThymeleafConfig;

@Configuration 
@ComponentScan(basePackages = {"com.makeasoup.edashboard"})
@EnableWebMvc
@Import({ThymeleafConfig.class})
public class ApplicationContext extends WebMvcConfigurerAdapter {
	
		
}
