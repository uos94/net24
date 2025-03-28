package kr.co.kcs.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Configuration
public class Config {

    @Bean
    ViewResolver viewResolver(InternalResourceViewResolver resolver) {
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

	@Bean
	MappingJackson2JsonView jsonView() {
		return new JsonView();

	}

}
