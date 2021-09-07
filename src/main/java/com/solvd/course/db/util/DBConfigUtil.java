package com.solvd.course.db.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.Properties;

public class DBConfigUtil {
    private final static Logger log = LogManager.getLogger(DBConfigUtil.class);

    private static Properties props = new Properties();

    static {
        try {
            props.load(new FileReader("db.properties"));
        } catch (FileNotFoundException e) {
            log.error("File was not found", e);
        } catch (IOException e) {
            log.error("Exception while loading properties file", e);
        }
    }

    private DBConfigUtil() {

    }

    public static Properties getProps() {
        return props;
    }
}
