package net.ivancl4udio.templates.webapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(
                "/build/**",
                "/images/**",
                "/vendors/**")
                .addResourceLocations(
                        "classpath:static/build/",
                        "classpath:/static/images/",
                        "classpath:/static/vendors/");
    }
}
