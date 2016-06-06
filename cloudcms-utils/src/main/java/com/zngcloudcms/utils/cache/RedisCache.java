package com.zngcloudcms.utils.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RedisCache extends AbstractCache<String, String, CACHE_ENUM> {

	@Autowired
	private RedisUtil rdbc;
	
	public final static String USERNAME_PREFIX = "username:";//username:sid,username
	public final static String USER_PREFIX = "user:";		 //user:username,user
	public final static String PROJECTS_PREFIX = "projects:";//projects:username,projects
	
	@Override
	public void save(com.zngcloudcms.utils.cache.Cache.Entry<String, String> entry) {
		rdbc.set(entry.getKey(), entry.getValue());
	}

	@Override
	public void delete(String key) {
		rdbc.delete(key);
	}
	@Override
	public void expired(String key, Long millis){
		rdbc.expireAt(key, millis);
	}
	@Override
	public String get(String key) {
		return rdbc.get(key);
	}
	@Override
	public Entry createEntry(CACHE_ENUM type) {
		return createEntry(type , "");
	}
	/**
	 * "username:sid",  "username"
	 * "user:username",  "user"
	 * "projects:username",  "projects"
	 * 
	 * @param type
	 * @param suffix
	 * @return Entry
	 */
	public Entry createEntry(CACHE_ENUM type, String suffix) {
		try{
			if(type==CACHE_ENUM.USERNAME) {
				Entry entry1 = new Entry();
				entry1.putPrefixKey(USERNAME_PREFIX);
				entry1.putSuffixKey(suffix);
				return entry1;
			} else if(type==CACHE_ENUM.USER){
				Entry entry2 = new Entry();
				entry2.putPrefixKey(USER_PREFIX);
				entry2.putSuffixKey(suffix);
				return entry2;
			} else if(type==CACHE_ENUM.PROJECTS){
				Entry entry3 = new Entry();
				entry3.putPrefixKey(PROJECTS_PREFIX);
				entry3.putSuffixKey(suffix);
				return entry3;
			}
		} catch(Exception e ) {
			e.printStackTrace();
		}
		return null;
	}
	
	public class Entry implements Cache.Entry<String, String> {
		String key;
		String value;
		Entry() {
			key = value = "";
		}
		@Override
		public String getKey() {
			return key;
		}
		public Entry setKey(String key) {
			putPrefixKey(key);
			return this;
		}
		public Entry putPrefixKey(String prefix) {
			if(key.indexOf(":")<0) 
				this.key = prefix+":";
			this.key = prefix;
			return this;
		}
		public Entry putSuffixKey(String suffix) throws Exception {
			if(key.indexOf(":")<0) 
				throw new Exception ("设置后缀出错：没有设置‘：’号");
			key = key.substring(0, key.indexOf(":")+1);
			key += suffix;
			return this;
		}
		public String getValue() {
			return value;
		}
		public Entry setValue(String val) {
			value = val;
			return this;
		}
		public Entry save() {
			RedisCache.this.save(this);
			return this;
		}
		public void delete() {
			RedisCache.this.delete(this.getKey());
		}
		public String get() {
			return RedisCache.this.get(this.getKey());
		}
		public void expired(Long millis) {
			RedisCache.this.expired(this.getKey(), millis);
		}
	}

}
