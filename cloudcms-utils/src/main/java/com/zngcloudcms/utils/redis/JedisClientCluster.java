package com.zngcloudcms.utils.redis;

import redis.clients.jedis.JedisCluster;

public class JedisClientCluster {
	public void setJedisCluster(JedisCluster jedisCluster) {
		this.jedisCluster = jedisCluster;
	}

	private JedisCluster jedisCluster;

	public String get(String key) {
		String str = jedisCluster.get(key);
		return str;
	}

	public String set(String key, String value) {
		String str = jedisCluster.set(key, value);
		return str;
	}

	public String hget(String hkey, String key) {
		return jedisCluster.hget(hkey, key);
	}

	public Long hset(String hkey, String key, String value) {
		return jedisCluster.hset(hkey, key, value);
	}

	public long incr(String key) {
		return jedisCluster.incr(key);
	}

	public long expire(String key, int seconds) {
		return jedisCluster.expire(key, seconds);
	}

	public long ttl(String key) {
		return jedisCluster.ttl(key);
	}

	public long del(String key) {
		return jedisCluster.del(key);
	}

	public long hdel(String hkey, String key) {
		return jedisCluster.hdel(hkey, key);
	}
}
