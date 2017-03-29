/**
 * This is class DAOFactory Which is used create instance of all the concreate class .
 * according to there respective data resources.
 *  
 * version 1.0
 * since 17-02-2017
 * */

package com.bizruntime.UserProductRestEasy;


public class DAOFactory{

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
