package com.hyperion.spring4.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.hyperion.spring4")
//@Import(H2DBInfrastructureConfig.class)
@Import(MySQLDBInfrastructureConfig.class)
public class JPAConfig {

}
