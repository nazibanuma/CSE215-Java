/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testmachine;

interface Database{
    public void connect(String admin,String password) throws DatabaseConnectionException ;
}
class DatabaseConnectionException extends Exception{
int code;
    public DatabaseConnectionException(int code,String message) {
        super(message);
        this.code = code;
    }
    public int getErrorCode(){
        return code;
    }
    
}
class MySQLDatabase implements Database{
    public void connect(String admin,String password)throws DatabaseConnectionException{
        throw new DatabaseConnectionException(1001," COnnection Timeout");
    }
}
public class TestMachine {
    public static void main(String[] args) {
        Database db = new MySQLDatabase();
        try {
            db.connect("admin", "password");
        } catch (DatabaseConnectionException e) {
            System.out.println("DATABASE ERROR: " + e.getErrorCode() + " - " + e.getMessage());
        }
    }
}

























//class InvalidOperationException extends Exception {
//
//    int code;
//
//    public InvalidOperationException(String message) {
//        super(message);
//      
//    }
//
//}
//
//public class TestMachine {
//
//    public static void operate(int code) throws InvalidOperationException {
//        if (code != 777) {
//            throw new InvalidOperationException("Code " + code + " is not the master code");
//        }
//    }
//
//    public static void main(String[] args) {
//        try {
//            operate(999);
//        } catch (InvalidOperationException e) {
//            System.out.println("ALERT: " + e.getMessage());
//        }
//    }
//}
