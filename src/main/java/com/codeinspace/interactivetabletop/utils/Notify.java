package com.codeinspace.interactivetabletop.utils;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;

/**
 * Takes the nuances out of setting up a logger and more or less mimic logging in Javascript.
 * @author Brian Blankenship
 * @since 1.0.0
 * @version 1.0.0
 */
public class Notify {
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void info(String msg) {
        LOGGER.log(Level.INFO, msg);
    }

    public static void info(String msg, Object obj) {
        LOGGER.log(Level.INFO, msg, obj);
    }

    public static void warn(String msg) {
        LOGGER.log(Level.WARNING, msg);
    }

    public static void warn(String msg, Object obj) {
        LOGGER.log(Level.WARNING, msg, obj);
    }

    public static void severe(String msg) {
        LOGGER.log(Level.SEVERE, msg);
    }

    public static void severe(String msg, Object obj) {
        LOGGER.log(Level.SEVERE, msg, obj);
    }

    public static void config(String msg) {
        LOGGER.log(Level.CONFIG, msg);
    }

    public static void config(String msg, Object obj) {
        LOGGER.log(Level.CONFIG, msg, obj);
    }

    public static void fine(String msg) {
        LOGGER.log(Level.FINE, msg);
    }

    public static void fine(String msg, Object obj) {
        LOGGER.log(Level.FINE, msg, obj);
    }

    public static void finer(String msg) {
        LOGGER.log(Level.FINER, msg);
    }

    public static void finer(String msg, Object obj) {
        LOGGER.log(Level.FINER, msg, obj);
    }

    public static void finest(String msg) {
        LOGGER.log(Level.FINEST, msg);
    }

    public static void finest(String msg, Object obj) {
        LOGGER.log(Level.FINEST, msg, obj);
    }

    public static LogManager manager() {
        return LogManager.getLogManager();
    }
}
