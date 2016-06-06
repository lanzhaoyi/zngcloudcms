package com.zngcloudcms.dao;


public class MultipleDataSourceAspectAdvice {
	
	/*@Pointcut("execution(* com.zngcloudcms.dao.mysql.*.*(..))")
	public void doMySql() {
	}
	
	@Pointcut("execution(* com.zngcloudcms.dao.mssql..*(..))")
	public void doMsSql(){}
	
	@Pointcut("execution(* com.zngcloudcms.dao.oracle..*(..))")
	public void doOracle(){}

	@Before("doMySql()")
	public void doMySqlBefore(JoinPoint joinPoint) {		
		MultipleDataSource.setDataSourceKey("mySqlDataSource");
	}

	@After("doMySql()")
	public void doMySqlAfter(JoinPoint joinPoint) {
		MultipleDataSource.setDataSourceKey("mySqlDataSource");
	}
	
	
	
	@Before("doMsSql()")
	public void doMsSqlBefore(JoinPoint joinPoint) {
		MultipleDataSource.setDataSourceKey("MsSqlDataSource");
	}
	
	@After("doMsSql()")
	public void doMsSqlAfter(JoinPoint joinPoint) {
		MultipleDataSource.setDataSourceKey("mySqlDataSource");
	}
*/
}
