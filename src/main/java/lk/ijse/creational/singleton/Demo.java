package lk.ijse.creational.singleton;

public class Demo {
    public static void main(String[] args) {

//        DBConnection object = new DBConnection();

        DBConnection object2 = DBConnection.getInstance();
        object2.showMessage();
    }
}
