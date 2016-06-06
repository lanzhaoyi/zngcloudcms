package com.zngcloudcms.dao;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MultipleDataSource extends AbstractRoutingDataSource {
	private static final ThreadLocal<String> dataSourceKey = new InheritableThreadLocal<String>();

	public static void setDataSourceKey(String dataSource) {
		dataSourceKey.set(dataSource);
	}

	public static String dataSourceName() {
		return dataSourceKey.get();
	}

	@Override
	protected Object determineCurrentLookupKey() {
		return dataSourceKey.get();
	}

}
