

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.bizruntime.stocktrade.ClientCallingInMaven;


public class TestStockTrade {
	
	public static final Logger LOGGER = Logger.getLogger(TestStockTrade.class);
	@Test
	public void testCallerMethod() throws Exception {
		ClientCallingInMaven callingInMaven = new ClientCallingInMaven();
		callingInMaven.CallerMethod();
		LOGGER.info("Done");
	}
}
