package Sort;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class TestLog4j {
	private Logger logger;
	
	public void testLogCreate() {
		Logger log = Logger.getLogger("MyFirstLogger");
		log.info("hello");
	}

	public static void testLogAddAppender() {
		Logger logger = Logger.getLogger("MyLogger");
		logger.removeAllAppenders();
		logger.addAppender(new ConsoleAppender(new PatternLayout("%p %t %m%n"), 
				ConsoleAppender.SYSTEM_OUT));
//		ConsoleAppender appender = new ConsoleAppender();
//		logger.addAppender(appender);
		logger.info("hello");
	}

	public void init() {
	logger = logger.getLogger("logger");
	logger.removeAllAppenders();
	Logger.getRootLogger().removeAllAppenders();
	}
	
	public void basicLogger() {
		BasicConfigurator.configure();
		logger.info("basicLogger");
	}
	
	public void addAppenderWithStrream() {
		logger = logger.getLogger("logger");
		logger.addAppender(new ConsoleAppender(new PatternLayout("%p %t %m%n"), ConsoleAppender.SYSTEM_OUT));
		logger.info("addAppenderWithStream");
	}
	
	public void addAppenderWithoutStrream() {
		logger = logger.getLogger("logger");
		logger.addAppender(new ConsoleAppender(new PatternLayout("%p %t %m%n")));
		logger.info("addAppenderWithoutStream");
	}
	
	public static void main(String[] args) {

//		testLogCreate();
//		testLogAddAppender();
		TestLog4j test = new TestLog4j();
		test.addAppenderWithoutStrream();
//		test.testLogAddAppender();
	}

}
