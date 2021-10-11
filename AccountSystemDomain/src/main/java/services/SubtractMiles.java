package services;
import persistanceTestWeb.AccountTransaction;
import persistanceTestWeb.AccountType;

import java.util.Scanner;

import java.sql.*;

public class SubtractMiles {
    private int miles = 0;
    public static void main(String args[]) throws SQLException {


        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "GDS", "cmpg311");
            Statement st = con.createStatement();
            String sql = "SELECT Miles FROM Account_Transaction ";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next())
                System.out.println(rs.getInt(1) + "" + rs.getString(2));
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }


        Scanner userInput = new Scanner("Enter username");
        Scanner userMiles = new Scanner("How much miles would you like to ad:");


        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "GDS", "cmpg311");
            Statement st = con.createStatement();
            String sql = "INSERT INTO Account_Transaction VALUES (userMiles) ";
            ResultSet rsAdd = st.executeQuery(sql);
            while (rsAdd.next())
                System.out.println(rsAdd.getInt(1) + "" + rsAdd.getString(2));
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }












    }
}