package edu.ucan.naturemarket.util;

import java.sql.Date;
import java.time.LocalDateTime;

/**
 *
 * @author Ismael Correia
 * @id 19802
 */
public class DateUtil {
    
    public static LocalDateTime toLocalDateTime(Date date) {
        return LocalDateTime.of(
                date.getYear(), 
                date.getMonth(), 
                date.getDate(), 
                date.getHours(), 
                date.getMinutes(), 
                date.getSeconds());
    }

}
