/**
 * This is class DAOFactory Which is used create instance of all the concreate class .
 * according to there respective data resources.
 *  
 * version 1.0
 * since 17-02-2017
 * */

package com.bizruntime.task3.task3dao;


public class DAOFactory{
	/**
	 * Implimentation of Singleton design pattern.
	 * Implementation of Lazy Instantialtion with double locking mechanism.
	 * */
	private static DAOFactory instance;
	private DAOFactory(){
		
	}
	
	public static DAOFactory getInstance (){
		if (instance == null) {
			synchronized (DAOFactory.class) {
				if (instance == null) {
					instance = new DAOFactory();
				}
			}
		}
		
		return instance;
	}
	/**
	 * Defination of getUserDAO whose return type is IUserDAO Interface. 
	 * */
	public IUserDAO getUserDAO(String dataprovide){
		if (dataprovide.equalsIgnoreCase(null)) {
			return null;
		}else if (dataprovide.equalsIgnoreCase("csv")) {
			return new CSVUserDAOImpl();
		}else if (dataprovide.equalsIgnoreCase("DATABASE")) {
			return new DBUserDAOImpl();
		}		
		return null;		
	}
	/**
	 * Defination of getProductDAO whose return type is IProductDAO Interface.
	 * 
	 * */
	public IProductDAO getProductDAO(String dataprovide){
		
		if (dataprovide.equalsIgnoreCase(null)) {
			return null;
		}else if (dataprovide.equalsIgnoreCase("csv")) {
			return new CSVProductImpl();
		}else if (dataprovide.equalsIgnoreCase("DATABASE")) {
			return new DBProductDAOImpl();
		}
		return null;		
	}
}
