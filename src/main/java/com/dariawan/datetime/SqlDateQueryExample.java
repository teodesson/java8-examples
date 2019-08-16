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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqlDateQueryExample {
 
    public static void main(String[] args) throws Exception {
        // (1) connect to postgresql database
        String url = "jdbc:postgresql://localhost/coffeeshop";
        Class.forName("org.postgresql.Driver");

        try (Connection conn = DriverManager.getConnection(url, "barista", "espresso")) {
            // (2) create statement and query
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT curr_date FROM test_date");
            while ( rs.next() ) {
                java.sql.Date currSqlDate = rs.getDate("curr_date");
                java.util.Date currDate = new java.util.Date(currSqlDate.getTime());
                
                // (3) print java.util.Date result
                System.out.println(currDate);
            }
        }
    }
}
