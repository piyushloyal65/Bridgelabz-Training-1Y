package com.LogisticSystem;

import java.sql.*;

public class DBConnection {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/routeDB";
        String user = "root";
        String pass = "root"; // change if needed

        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            st.executeUpdate("INSERT INTO driver VALUES('D1204','Kavita Nair')");

            st.executeUpdate("INSERT INTO checkpoint VALUES('C1','D1204','Delivery','Warehouse A',30,60,70)");
            st.executeUpdate("INSERT INTO checkpoint VALUES('C2','D1204','Fuel','Pump 12',20,30,30)");
            st.executeUpdate("INSERT INTO checkpoint VALUES('C3','D1204','Rest','Motel X',10,20,60)");

            System.out.println("Data Inserted ✅");

            ResultSet rs = st.executeQuery("SELECT * FROM checkpoint");

            while (rs.next()) {
                System.out.println(
                        rs.getString("checkpointId") + " | " +
                                rs.getString("type") + " | " +
                                rs.getString("locationName")
                );
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
