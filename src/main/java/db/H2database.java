package db;

import java.sql.Connection;
import java.sql.DriverManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class H2database {
	
	private static final String DB_DRIVER     = "org.h2.Driver";
	private static final String DB_CONNECTION = "jdbc:h2:~/dbTest";
	private static final String DB_USER       = "arossif";
	private static final String DB_PASSWORD   = "arossif";
	
	//Logger
static final Logger logger = LogManager.getLogger();
		
	
	public static void testH2database() {

		try {

			Class.forName(DB_DRIVER);
			Connection con = DriverManager.getConnection(DB_CONNECTION);
			
			logger.debug("Database created for Driver "+DB_DRIVER+" and connection "+DB_CONNECTION+".");
			
			
			
			//Close the connection
			con.close();
			logger.debug("Database closed.");

		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
	}

}
