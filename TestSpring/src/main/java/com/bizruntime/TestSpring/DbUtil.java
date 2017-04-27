package com.bizruntime.TestSpring;

import javax.sql.DataSource;

public class DbUtil {
	
	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	
	
}
