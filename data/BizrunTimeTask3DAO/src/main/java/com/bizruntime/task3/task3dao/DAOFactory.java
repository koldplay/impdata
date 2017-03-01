/**
 * This is class DAOFactory Which is used create instance of all the concreate class .
 * according to there respective data resources.
 *  
 * version 1.0
 * since 17-02-2017
 * */

package com.bizruntime.task3.task3dao;


public class DAOFactory {
	
	
	/**
	 * Defination of getUserDAO whose return type is IUserDAO Interface. 
	 * */
	public IUserDAO getUserDAO(String dataprovide){
		
		if (dataprovide == "csv") {
			return new CSVUserDAOImpl();
		}else if (dataprovide == "DATABASE") {
			return new DBUserDAOImpl();
		}		
		return null;		
	}
	/**
	 * Defination of getProductDAO whose return type is IProductDAO Interface.
	 * 
	 * */
	public IProductDAO getProductDAO(String dataprovide){
		
		if (dataprovide == "csv") {
			return new CSVProductImpl();
		}else if (dataprovide == "DATABASE") {
			return new DBProductDAOImpl();
		}
		return null;		
	}
}
