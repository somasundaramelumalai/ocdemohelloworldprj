package org.leidos.helloworld;

import org.apache.log4j.Logger;

public class HelloWorldAction {
	final static Logger logger = Logger.getLogger(HelloWorldAction.class);
	
	private String dbUserName;  
	
	public String  execute()
	{
		if(logger.isDebugEnabled()){
			logger.debug("Debug Mode  : " );
		}
		if(logger.isInfoEnabled()){
			logger.info("Info Mode : " );
		}
		
		logger.warn("This is warn : " );
		logger.error("This is error : " );
		logger.fatal("This is fatal : " );

		dbUserName = new String("Test");
		
		logger.info("dbUser before: " + dbUserName);
		
		dbUserName = System.getenv("dbUserName");
		
		logger.info("dbUser after : " + dbUserName);
		
		return "SUCCESS";
	}

	public String getDbUserName() {
		return dbUserName;
	}

	public void setDbUserName(String dbUserName) {
		this.dbUserName = dbUserName;
	}
	
}

