package com.zngcloudcms.utils.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zngcloudcms.utils.StringUtil;
import com.zngcloudcms.utils.redis.MyStringRedisTemplate;

@Component
public class RedisUtil {

	@Autowired
	private MyStringRedisTemplate template;

	public void set(String key, String value) {
		template.opsForValue().set(key, value);
	}
	public String get(String key) {
		String temp = template.opsForValue().get(key);
		return temp;
				
	}
	
	public void delete(String key) {
		template.opsForValue().getOperations().delete(key);
	}
	
	public void expireAt(String key, long millis) {
		template.opsForValue().getOperations().expireAt(key, StringUtil.addMillis(millis));
	}
	
}
