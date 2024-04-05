/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cms.cct;

import java.util.Scanner;

/**
 *
 * @author Mark
 */
public class UserCounsule {
    private Scanner scanner;
    private User currentUser;
    
    public void start() {
        System.out.println("Welcome to CCT Course Managament System");
        boolean loggedIn = false;
        String username;
        String password;
        
        do {
            System.out.println("Enter username: ");
            username = scanner.nextLine();
            System.out.println("Enter password: ");
            password = scanner.nextLine();
            
            loggedIn = authenticate (username, password);
                if(!loggedIn) {
                    System.out.println("Invalid username or password");
                }
        } while (!loggedIn);
        
        System.out.println("Login successful");
        
        String role = dbConn.getUser
        
    }
}
