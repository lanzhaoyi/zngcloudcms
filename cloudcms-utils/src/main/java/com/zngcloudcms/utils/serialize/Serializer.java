package com.zngcloudcms.utils.serialize;

public interface Serializer<T> {
	
	byte[] serialize(T t) throws SerializationException ;
	
	T deserialize(byte[] bytes) throws SerializationException;
}
