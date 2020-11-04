package com.zk.config;

import com.zk.api.RedisAdapter;
import com.zk.api.com.zk.api.impl.RedisSimpleAdapter;
import com.zk.prop.RedisProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(RedisProperties.class)
@ConditionalOnClass(RedisSimpleAdapter.class)
@ConditionalOnProperty(prefix = "com.zk", value = "enabled", matchIfMissing = true)
public class RedisAutoConfiguration {

  @Bean
  public RedisAdapter getRedisAdapter(){
    return new RedisSimpleAdapter();
  }

}
