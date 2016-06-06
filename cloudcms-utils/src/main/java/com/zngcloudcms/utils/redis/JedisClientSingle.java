package com.zngcloudcms.utils.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class JedisClientSingle {

	public void setRedisClient(JedisPool redisClient) {
		this.redisClient = redisClient;
	}

	private JedisPool redisClient;

	public String get(String key) {
		Jedis jedis = redisClient.getResource();
		String str = jedis.get(key);
		jedis.close();
		return str;
	}

	public String set(String key, String value) {
		Jedis jedis = redisClient.getResource();
		String str = jedis.set(key, value);
		jedis.close();
		return str;
	}

	public String hget(String hkey, String key) {
		Jedis jedis = redisClient.getResource();
		String str = jedis.hget(hkey, key);
		jedis.close();
		return str;
	}

	public Long hset(String hkey, String key, String value) {
		Jedis jedis = redisClient.getResource();
		Long result = jedis.hset(hkey, key, value);
		jedis.close();
		return result;
	}

	public long incr(String key) {
		Jedis jedis = redisClient.getResource();
		Long result = jedis.incr(key);
		jedis.close();
		return result;
	}

	public long expire(String key, int seconds) {
		Jedis jedis = redisClient.getResource();
		Long result = jedis.expire(key, seconds);
		jedis.close();
		return result;
	}

	public long ttl(String key) {
		Jedis jedis = redisClient.getResource();
		Long result = jedis.ttl(key);
		return result;
	}

	public long del(String key) {
		Jedis jedis = redisClient.getResource();
		Long result = jedis.del(key);
		return result;
	}

	public long hdel(String hkey, String key) {
		Jedis jedis = redisClient.getResource();
		Long result = jedis.hdel(hkey, key);
		return result;
	}
}
