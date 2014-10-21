/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author wsuetholz
 */
public class DateTimeHelper {

    private static long MILLIS_IN_SECOND = 1000;
    private static long SECS_IN_MINUTE = 60;
    private static long MINS_IN_HOUR = 60;
    private static long HOURS_IN_DAY = 24;

    public static String convertDateToString(String format, Date date) {
	if (format == null || format.isEmpty()) {
	    throw new IllegalArgumentException("Date Format String Missing!");
	}
	if (date == null) {
	    throw new IllegalArgumentException("Date Missing!");
	}

	SimpleDateFormat dateFormat = new SimpleDateFormat(format);

	return (dateFormat.format(date));
    }

    public static String convertCalendarToString(String format, Calendar calendar) {
	if (format == null || format.isEmpty()) {
	    throw new IllegalArgumentException("Date Format String Missing!");
	}
	if (calendar == null) {
	    throw new IllegalArgumentException("Date Missing!");
	}

	SimpleDateFormat dateFormat = new SimpleDateFormat(format);

	return (dateFormat.format(calendar.getTime()));
    }

    public static Date convertStringToDate(String dateString, String format) throws ParseException {
	if (dateString == null || dateString.isEmpty()) {
	    throw new IllegalArgumentException("Date String Missing!");
	}
	if (format == null || format.isEmpty()) {
	    throw new IllegalArgumentException("Date Format String Missing!");
	}

	SimpleDateFormat dateFormat = new SimpleDateFormat(format);

	return (dateFormat.parse(dateString));
    }

    public static Calendar convertStringToCalendar(String dateString, String format) throws ParseException {
	if (dateString == null || dateString.isEmpty()) {
	    throw new IllegalArgumentException("Date String Missing!");
	}
	if (format == null || format.isEmpty()) {
	    throw new IllegalArgumentException("Date Format String Missing!");
	}

	SimpleDateFormat dateFormat = new SimpleDateFormat(format);

	Calendar calendar = Calendar.getInstance();
	calendar.setTime(dateFormat.parse(dateString));

	return calendar;
    }

    public static String calculateDiffInHHMM(String format, String endTimeStr, String startTimeStr) {
	if (endTimeStr == null || endTimeStr.isEmpty()) {
	    throw new IllegalArgumentException("End Date String Missing!");
	}
	if (startTimeStr == null || startTimeStr.isEmpty()) {
	    throw new IllegalArgumentException("Start Date String Missing!");
	}
	if (format == null || format.isEmpty()) {
	    throw new IllegalArgumentException("Date Format String Missing!");
	}
	Calendar startTime;
	Calendar endTime;
	try {
	    startTime = DateTimeHelper.convertStringToCalendar(startTimeStr, format);
	} catch (ParseException pe) {
	    throw new IllegalArgumentException ("Start Date Parse Exception", pe);
	}
	try {
	    endTime = DateTimeHelper.convertStringToCalendar(endTimeStr, format);
	} catch (ParseException pe) {
	    throw new IllegalArgumentException ("End Date Parse Exception", pe);
	}
	
	return calculateDiffInHHMM(endTime, startTime);
    }

    public static String calculateDiffInHHMM(Calendar endTime, Calendar startTime) {
	if (endTime == null) {
	    throw new IllegalArgumentException("End Date Missing!");
	}
	if (startTime == null) {
	    throw new IllegalArgumentException("Start Date Missing!");
	}

	String ret = "00:00";

	long timeCompare = endTime.compareTo(startTime);
	if (timeCompare < 0) {
	    throw new IllegalArgumentException("Start Date after End Date!");
	} else if (timeCompare == 0) {
	    return ret;
	}

	long diffMs = endTime.getTimeInMillis() - startTime.getTimeInMillis();
	long diffMins = diffMs / MILLIS_IN_SECOND / SECS_IN_MINUTE;
	long diffHr = diffMins / MINS_IN_HOUR;
	long diffMn = diffMins % MINS_IN_HOUR;
	ret = Long.toString(diffHr);
	if (diffMn > 9) {
	    ret = ret + ":" + Long.toString(diffMn);
	} else {
	    ret = ret + ":0" + Long.toString(diffMn);
	}

	return ret;
    }
}
