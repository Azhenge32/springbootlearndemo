package com.azhne.springbootlearndemo.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.net.UnknownHostException;

/**
 * @author Azhen
 * @date 2017/12/26
 */
@Configuration
@EnableMongoRepositories
public class MongodbConfig {

    @Bean
    public MongoClient client() throws UnknownHostException {
        MongoClient client = new MongoClient(new ServerAddress("127.0.0.1", 27017));
        return client;
    }

    @Bean
    public MongoDbFactory mongoDbFactory() throws Exception {
        String datebase = new MongoClientURI("mongodb://localhost/test").getDatabase();
        return new SimpleMongoDbFactory(client(), datebase);
    }

    @Bean
    public MongoTemplate mongoTemplate(MongoDbFactory mongoDbFactory) throws UnknownHostException {
        return new MongoTemplate(mongoDbFactory);
    }
}
