package com.crunchify;
/**
 * @author Crunchify.com
 */
import org.apache.log4j.Logger;
public class Log4JCrunchifyTest {
    static Logger log = Logger.getLogger(Log4JCrunchifyTest.class);
    public static void main(String[] args) {
        log.info("This is Logger Info");
    }
}
