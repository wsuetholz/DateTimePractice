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
import javax.swing.UIManager;

/**
 *
 * @author wsuetholz
 */
public class Startup {

    public static void main(String[] args) throws ParseException {
//	Demo1 demo1 = new Demo1();
//	SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy hh:mm a");
//	SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy hh:mm a z");
//	// Study SimpleDateFormat API and show what all codes mean..
//	// 
//
//	Date date = demo1.getCalendarDateTime();
//	System.out.println(sdf.format(date));
//
//	Calendar calendar = demo1.getCurrentCalendar();
//	System.out.println(sdf1.format(calendar.getTime()));
//
//	// Createing GUI asking entry of date and time
//	// How do you convert Text into a date object..
//	// How do you display the date object to the GUI.
//	String timestamp = "10/20/2014 6:19 PM";
//
//	Date date2;
//	date2 = sdf.parse(timestamp);
//
//	System.out.println("Parsed Date: " + sdf1.format(date2));
//	
//	Calendar cal2 = Calendar.getInstance();
//	cal2.setTime(date2);
//	System.out.println("Parsed Calendar: " + sdf1.format(cal2.getTime()));
//	
	try {
	    // Set System L&F
	    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	} catch (Exception e) {
	    // do nothing, this can safely be ignored because
	    // it will fall back to the basic metal L&F if something
	    // goes wrong. This is also a rare example of a scenario
	    // where the catch clause could be safely eliminated.
	}

	/* 
	 Create and display the form  on a separate thread using
	 JDK 7 or earlier syntax, which rquires an anonymous inner class
	 */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    @Override
	    public void run() {
		new DateTimeGui().setVisible(true);
//                Window3 w3 = new Window3();
//                w3.setVisible(true);
//                new Window2(w3).setVisible(true);
	    }
	});

//	Calendar startDate = Calendar.getInstance();
//	startDate.set(2014, Calendar.JANUARY, 1);
//	Calendar endDate = Calendar.getInstance();
//	endDate.set(2014, Calendar.JANUARY, 15);
//	
//	long startMs = startDate.getTimeInMillis();
//	long endMs = endDate.getTimeInMillis();
//	
//	long diffMs = endMs - startMs;
//	Calendar diffCal = Calendar.getInstance();
//	diffCal.setTimeInMillis(diffMs);
//	
//	long days = diffMs / 1000 / 60 / 60 / 24;
//	
//	System.out.println("Days between dates: " + days);
//	
	// Do Lab #2
    }
}
