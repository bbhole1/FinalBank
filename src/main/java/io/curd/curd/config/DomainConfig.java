package io.curd.curd.config;

import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EntityScan("io.curd.curd")
@EnableJpaRepositories("io.curd.curd")
@EnableTransactionManagement
public class DomainConfig {
}
