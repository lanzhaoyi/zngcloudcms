package com.zngcloudcms.model;

public class RetInfo {
	public RetInfo() {
		this.setRetCode(0);
	}

	private int retCode;

	private String retDescript;

	private Object ExtendObj;

	public int getRetCode() {
		return retCode;
	}

	public void setRetCode(int retCode) {
		this.retCode = retCode;
	}

	public String getRetDescript() {
		return retDescript;
	}

	public void setRetDescript(String retDescript) {
		this.retDescript = retDescript;
	}

	public Object getExtendObj() {
		return ExtendObj;
	}

	public void setExtendObj(Object extendObj) {
		ExtendObj = extendObj;
	}
}
