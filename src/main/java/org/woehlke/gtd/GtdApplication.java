package org.woehlke.gtd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling
@SpringBootApplication
/*
@EnableConfigurationProperties({
		BackendProperties.class,
		FrontendProperties.class,
		TestdataProperties.class
})
*/
@EnableSpringDataWebSupport
@ImportResource("classpath:integration.xml")
public class GtdApplication {

	public static void main(String[] args) {
		SpringApplication.run(GtdApplication.class, args);
	}
}
