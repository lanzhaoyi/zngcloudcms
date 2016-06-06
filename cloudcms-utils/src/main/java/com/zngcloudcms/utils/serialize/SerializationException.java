package com.zngcloudcms.utils.serialize;

public class SerializationException extends RuntimeException {
	
	public SerializationException(String msg, Throwable cause) {
		super(msg, cause);
	}
	
	public SerializationException(String msg) {
		super(msg);
	}
}
