package lk.ijse.creational.singleton;

import java.sql.Connection;

public class DBConnection {
    private static DBConnection dbConnection = new DBConnection();
    private DBConnection(){

    }

    public static DBConnection getInstance(){
        return dbConnection;
    }

    public void showMessage(){
        System.out.println("Hello singletton Example Method..!");
    }

}
