/**
 * Code Examples in JDK 8 v1 (https://www.dariawan.com)
 * Copyright (C) 2019 Dariawan <hello@dariawan.com>
 *
 * Creative Commons Attribution-ShareAlike 4.0 International License
 *
 * Under this license, you are free to:
 * # Share - copy and redistribute the material in any medium or format
 * # Adapt - remix, transform, and build upon the material for any purpose,
 *   even commercially.
 *
 * The licensor cannot revoke these freedoms
 * as long as you follow the license terms.
 *
 * License terms:
 * # Attribution - You must give appropriate credit, provide a link to the
 *   license, and indicate if changes were made. You may do so in any
 *   reasonable manner, but not in any way that suggests the licensor
 *   endorses you or your use.
 * # ShareAlike - If you remix, transform, or build upon the material, you must
 *   distribute your contributions under the same license as the original.
 * # No additional restrictions - You may not apply legal terms or
 *   technological measures that legally restrict others from doing anything the
 *   license permits.
 *
 * Notices:
 * # You do not have to comply with the license for elements of the material in
 *   the public domain or where your use is permitted by an applicable exception
 *   or limitation.
 * # No warranties are given. The license may not give you all of
 *   the permissions necessary for your intended use. For example, other rights
 *   such as publicity, privacy, or moral rights may limit how you use
 *   the material.
 *
 * You may obtain a copy of the License at
 *   https://creativecommons.org/licenses/by-sa/4.0/
 *   https://creativecommons.org/licenses/by-sa/4.0/legalcode
 */
package com.dariawan.datetime;

import java.util.Calendar;

public class CalendarSetExample {
    
    public static void main(String[] args) {       
        Calendar cal = Calendar.getInstance();
        
        // Set
        cal.set(1980, 3, 18);
        System.out.println("Calendar's date/time: " + cal.getTime());
        System.out.println("Calendar's date  : " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Calendar's month : " + cal.get(Calendar.MONTH));
        System.out.println("Calendar's year  : " + cal.get(Calendar.YEAR));
        System.out.println();
        
        cal.set(2002, 2, 22, 14, 20);
        System.out.println("Calendar's date/time: " + cal.getTime());
        System.out.println("Calendar's hour  : " + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("Calendar's minute: " + cal.get(Calendar.MINUTE));
        System.out.println();
        
        cal.set(1981, 6, 12, 20, 30, 40);
        System.out.println("Calendar's date/time: " + cal.getTime());
        System.out.println("Calendar's hour  : " + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("Calendar's minute: " + cal.get(Calendar.MINUTE));
        System.out.println("Calendar's second: " + cal.get(Calendar.SECOND));
        System.out.println();
        
        cal.set(Calendar.YEAR, 1981);
        cal.set(Calendar.MONTH, 3);
        cal.set(Calendar.DATE, 11);
        System.out.println("Calendar's date/time: " + cal.getTime());
        System.out.println("Calendar's date  : " + cal.get(Calendar.DATE));
        System.out.println("Calendar's month : " + cal.get(Calendar.MONTH));
        System.out.println("Calendar's year  : " + cal.get(Calendar.YEAR));
    }
}
