/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package old.api;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author wsuetholz
 */
public class Demo1 {

    public Date getCurrentDateTime() {
	Date currentDate = new Date();

	return currentDate;
    }
    
    public Date getCalendarDateTime() {
	Calendar calendar = Calendar.getInstance();

	return calendar.getTime();
    }
    
    public Calendar getCurrentCalendar() {
	Calendar calendar = Calendar.getInstance();

	return calendar;
    }
    
    public Date getSpecificDateTime() {
	Date currentDate = new Date(115, 0, 1);
	return currentDate;
    }

}
