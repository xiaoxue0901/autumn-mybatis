package com.kkb.mybatis.framework.config;

import javax.sql.DataSource;

public class Configuration {

	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	
}
