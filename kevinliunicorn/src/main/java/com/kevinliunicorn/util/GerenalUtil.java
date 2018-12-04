package com.kevinliunicorn.util;

import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;

public class GerenalUtil {

	private static final Logger log = Logger.getLogger(GerenalUtil.class);
	
	/**
     * Set the source date value time to 00:00:00.
     *
     * @param theDate the new to date start
     */
    public static void setToDateStart(Date theDate) {
    	log.debug("enter method GerenalUtil.setToDateStart()");
        if (theDate != null) {
            theDate.setTime(getDateStart(theDate).getTime());
        }
    }

    /**
     * Set the source date value time to 23:59:59.
     *
     * @param theDate the new to date end
     */
    public static void setToDateEnd(Date theDate) {
        if (theDate != null) {
            theDate.setTime(getDateEnd(theDate).getTime());
        }
    }
    
    /**
     * Get the source date value time with 00:00:00. Source obj value will not
     * changed.
     *
     * @param theDate the the date
     * @return the date start
     */
    public static Date getDateStart(Date theDate) {
        if (theDate != null) {
            Calendar newTime = null;
            newTime = Calendar.getInstance();
            newTime.setTime(theDate);
            return getDateStart(newTime);
        } else {
            return null;
        }
    }

    /**
     * Gets the date start.
     *
     * @param theDate the the date
     * @return the date start
     */
    public static Date getDateStart(Calendar theDate) {
        if (theDate == null) {
            return null;
        }
        theDate.set(Calendar.HOUR_OF_DAY, 0);
        theDate.set(Calendar.MINUTE, 0);
        theDate.set(Calendar.SECOND, 0);
        theDate.set(Calendar.MILLISECOND, 0);
        return theDate.getTime();
    }

    /**
     * Get the source date value time with 23:59:59. Source obj value will not
     * changed.
     *
     * @param theDate the the date
     * @return the date end
     */
    public static Date getDateEnd(Date theDate) {
        if (theDate != null) {
            Calendar newTime = null;
            newTime = Calendar.getInstance();
            newTime.setTime(theDate);
            return getDateEnd(newTime);
        } else {
            return null;
        }
    }

    /**
     * Gets the date end.
     *
     * @param theDate the the date
     * @return the date end
     */
    public static Date getDateEnd(Calendar theDate) {
        if (theDate == null) {
            return null;
        }
        theDate.set(Calendar.HOUR_OF_DAY, 23);
        theDate.set(Calendar.MINUTE, 59);
        theDate.set(Calendar.SECOND, 59);
        theDate.set(Calendar.MILLISECOND, 999);
        return theDate.getTime();
    }
}
