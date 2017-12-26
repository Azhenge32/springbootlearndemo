package com.azhne.springbootlearndemo.jpa;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

/**
 * @author Azhen
 * @date 2017/12/25
 */

@Configuration
@EnableJpaRepositories("com.azhne.springbootlearndemo.jpa.repository")
public class JpaConfiguration {
    @Bean
    public EntityManagerFactory entityManagerFactory() {
        return null;
    }

    @Bean
    public DataSource dataSource() {
        return null;
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnBean(DataSource.class)
    public PlatformTransactionManager transactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setDataSource(dataSource());
        return transactionManager;
    }
}
