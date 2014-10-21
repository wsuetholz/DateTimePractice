/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package old.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author wsuetholz
 */
public class Order {
    private Date orderDate;

    public String getFormattedDate(String format) {
	SimpleDateFormat dateFormat = new SimpleDateFormat(format);
	
	return dateFormat.format(orderDate);
    }
    
    public void setOrderDateFromString(String dateValue, String format) throws ParseException {
	SimpleDateFormat dateFormat = new SimpleDateFormat(format);

	orderDate = dateFormat.parse(dateValue);
    }
    
    public Date getOrderDate() {
	return orderDate;
    }

    public void setOrderDate(Date orderDate) {
	this.orderDate = orderDate;
    }
    
    
}
