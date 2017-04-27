package com.bizruntime.jta.testjtatransaction;

import javax.transaction.xa.Xid;

/**
 * Hello world!
 *
 */
public class App implements Xid 
{
    public static void main( String[] args )
    {
    	
    
        System.out.println( "Hello World!" );
    }

	public byte[] getBranchQualifier() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getFormatId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public byte[] getGlobalTransactionId() {
		// TODO Auto-generated method stub
		return null;
	}
}
