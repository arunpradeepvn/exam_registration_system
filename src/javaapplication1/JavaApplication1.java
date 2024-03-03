package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;


public class JavaApplication1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/examregistration","root","");
       }
       catch (ClassNotFoundException | SQLException e){
           System.out.println(e);
       }
       
       String pjtpassword = sc.nextLine();
       if(pjtpassword.equals("runarun")){
           loginForm loginForm = new loginForm();
           loginForm.setVisible(true);
           loginForm.setSize(1000,1000);
       }
       else{
           System.out.println("Invalid");
       }
    }
}
