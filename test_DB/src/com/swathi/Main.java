package com.swathi;

import java.sql.*;

public class Main {
        public static final String DB_NAME = "testOne.db";
        public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Database\\"+DB_NAME;
        public static final String TABLE_CONTACTS = "contacts";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_PHONE = "phone";
        public static final String COLUMN_EMAIL = "email";
    public static void main(String[] args) {
        try{
            Connection conn = DriverManager.getConnection(CONNECTION_STRING);
            Statement statement = conn.createStatement();
            statement.execute("DROP TABLE IF EXISTS "+TABLE_CONTACTS);
            statement.execute("CREATE TABLE IF NOT EXISTS "+TABLE_CONTACTS +
                    " ("+COLUMN_NAME+" TEXT, "+COLUMN_PHONE+" INTEGER, "+COLUMN_EMAIL+" TEXT)");


//            statement.execute("INSERT INTO "+TABLE_CONTACTS +

//                    " ("+COLUMN_NAME+", "+COLUMN_PHONE+", "+COLUMN_EMAIL+")"+
//                     " VALUES('Ram',5754,'ram@jma.com')");
            insertContacts(statement,"Vijay",7894,"vj@email.com");
            insertContacts(statement,"Ram",4561,"ram@email.com");
            insertContacts(statement,"Sita",7514,"si@email.com");
            insertContacts(statement,"Krishna",4512,"krish@email.com");
            insertContacts(statement,"Radha",7754,"radha@email.com");

            ResultSet result = statement.executeQuery("SELECT * FROM "+ TABLE_CONTACTS);
            while (result.next()){
                System.out.println(result.getString(COLUMN_NAME)+" | "+
                                    result.getString(COLUMN_PHONE)+" | "+
                                    result.getString(COLUMN_EMAIL));
            }
            result.close();
            statement.close();
            conn.close();


        }catch(SQLException e){
            System.out.println("wrong "+ e.getMessage());

        }
    }
    private static void insertContacts(Statement statement, String name, int phone, String email) throws SQLException{

        statement.execute("INSERT INTO "+TABLE_CONTACTS +
                " ("+COLUMN_NAME+", "+COLUMN_PHONE+", "+COLUMN_EMAIL+")"+
                " VALUES('"+name+"',"+phone+",'"+email+"')");
    }


}
