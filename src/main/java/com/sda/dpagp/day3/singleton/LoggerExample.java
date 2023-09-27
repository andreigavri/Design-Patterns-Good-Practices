package com.sda.dpagp.day3.singleton;

import java.util.Properties;

public class LoggerExample {

    public static void main(String[] args) {
        Logger theLogger = Logger.getInstance();

        theLogger.debug("Inainte de a face un apel la System.getProperties()");

        Properties systemProperties = System.getProperties();

        theLogger.debug(systemProperties.toString());
        theLogger.error("La final de program!");
    }
}
