package com.zk.api.com.zk.api.impl;

import com.zk.api.RedisAdapter;
import com.zk.prop.RedisProperties;
import org.springframework.beans.factory.annotation.Autowired;

public class RedisSimpleAdapter implements RedisAdapter {

  @Autowired
  private RedisProperties redisProperties;

  public String getHost() {
    return redisProperties.getHost();
  }
}
