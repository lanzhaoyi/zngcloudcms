package com.zngcloudcms.utils.cache;

public abstract class AbstractCache<K, V, T> implements Cache<K, V, T> {
	
	public abstract void expired(String key, Long millis);

}
