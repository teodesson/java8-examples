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

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateInfoExample {
    
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate    : " + localDate);
        System.out.println("DayOfMonth   : " + localDate.getDayOfMonth());
        System.out.println("MonthValue   : " + localDate.getMonthValue());
        System.out.println("Year         : " + localDate.getYear());
        
        System.out.println("DayOfWeek    : " + localDate.getDayOfWeek());
        System.out.println("Month        : " + localDate.getMonth());
        System.out.println("DayOfYear    : " + localDate.getDayOfYear());

        System.out.println("DAY_OF_MONTH : " + localDate.getLong(ChronoField.DAY_OF_MONTH));        
        System.out.println("MONTH_OF_YEAR: " + localDate.getLong(ChronoField.MONTH_OF_YEAR));
        System.out.println("YEAR         : " + localDate.getLong(ChronoField.YEAR));
        
        System.out.println("Chronology   : " + localDate.getChronology());
        System.out.println("Era          : " + localDate.getEra());

        System.out.println("LeapYear     : " + localDate.isLeapYear()); // for 2019
        System.out.println("LengthOfMonth: " + localDate.lengthOfMonth()); // for AUGUST
        System.out.println("LengthOfYear : " + localDate.lengthOfYear()); // for 2019
    }
}
