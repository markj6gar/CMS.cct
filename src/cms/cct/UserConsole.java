/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cms.cct;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Mark
 */

//
public class UserConsole {
    private Scanner scanner;
    private Map <String, String> users;
    private String currentUser;
    private ReportGenerator reportGen;
    //db.C
    
    //
    public UserConsole() {
    scanner = new Scanner(System.in);
    users = new HashMap<>();
    //As a CMS Admin I want to be the first user in the CMS, so that I can manage, set up and keep track of all the new users myself
    users.put("admin","java");
    currentUser = "admin";
    reportGen = new ReportGenerator();
    //db.C
    }
    
    
    
    //
    public void start() throws IOException {
        System.out.println("Welcome to CCT Course Managament System");
        boolean isLoggedIn = login();
            if(!isLoggedIn) {
            System.out.println("Login Failed");
            return;
        }
        
        //
        while (true) {
            
           showMenu();
            
            int choice = getChoice();        
            switch (choice) {
            
            case 1: 
                if(currentUser.equals("admin")) { //add lecturer and office staff later
               ReportGenerator();
                } else {
                    System.out.println("Permission denied to admins.");
                }
            break;
            
            case 2: changeUsername();
            break;
            
            case 3: changePassword();
            break;
            
            case 4: if(currentUser.equals("admin")) {
                        manageUsers();
                    } else {  System.out.println("Premission not granted."); }
            break;
            
            case 5: logOut();
            return;
            
            default:
                System.out.println("Invalid choice, try again...");
            }
        }
    }
    
    
    private boolean login() {
        System.out.println("Please login: ");
        System.out.println("Username: ");
        String username = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();
        
        if(users.containsKey(username) && users.get(username).equals(password)) {
           currentUser = username;
            System.out.println("Login successful. Welcom, " + currentUser);
            return true;
        } else { return false;    
        }
    }
    
    private void showMenu() {
        System.out.println("Main Menu:");
        System.out.println("1. Generate Reports");
        System.out.println("2. Change Username");
        System.out.println("3. Change Reports");
        System.out.println("4. Manage Users");
        System.out.println("5. Log Out");
        System.out.println("Your option: ");
    }
    
    
    private int getChoice() {
        try{
        return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e){
            return -1;
        }
    }
    

    
private void generateReports() throws IOException {
    System.out.println("Choose a report you would like to generate:");
    System.out.println("1. Courses Report");
    System.out.println("2. Student Report");
    // System.out.println("3. Lecturer Report");
    System.out.println("Your option: ");
    
    int reportChoice = getChoice();

    switch (reportChoice) {
        case 1:
            reportGen.generateCoursesReport();
            System.out.println("Courses Report generated successfully.");
            break;
        case 2:
            reportGen.generateStudentsReport();
            System.out.println("Students Report generated successfully.");
            break;
        default:
            System.out.println("Invalid choice. Please select 1 or 2.");
    }
}
    
    
    
    
    
    
    
    
    
    //As a CMS user I want to change my username and password for security reasons.
    private void changePassword() {
        System.out.println("Enter new password: ");
        String newPassword = scanner.nextLine();
        users.put(currentUser, newPassword);
        System.out.println("Password change was succssful.");
    }
    private void changeUsername() {
        System.out.println("Enter new username: ");
        String newUsername = scanner.nextLine();
        users.put(newUsername, users.remove(currentUser));
        currentUser = newUsername;
        System.out.println("Username change was succssful.");
    }
    
    
    // Managaing users for users
    private void manageUsers() {
        System.out.println("Manage Users:");
        System.out.println("1. Add User");
        System.out.println("2. Delete User");
        System.out.print("Choose an option: ");
        
        int option = getChoice();
        
        switch (option){
        
            case 1: addUser();
            break;
            
            case 2: deleteUser();
            break;
            
            default:
                System.out.println("Wrong choice, try again");
        
        }
    }
    
    private void addUser() {
        System.out.println("Enter new username: ");
        String newUsername = scanner.nextLine();
        System.out.println("Enter new password: ");
        String newPassword = scanner.nextLine();
        users.put(newUsername, newPassword);
        System.out.println("User added successfully.");
    }


    private void deleteUser() {
        System.out.println("Enter username to deleted: ");
        String username = scanner.nextLine();
        if (users.containsKey(username)) {
        users.remove(username);
            System.out.println("User is deleted");
        } else{    
            System.out.println("User does not exist");
        
        }
        }
    
    private void logOut() {
        System.out.println("Logging Out. ZZzzz");   
    }
    
    
    private String getOutputFormat() {
        System.out.println("Choose format:");
        System.out.println("1. TXT file");
        System.out.println("2. CSV file");
        System.out.println("3. Console");
        System.out.println("Your option:");
        int option = getChoice();
        switch (option) {

            case 1:
                return "txt";
            case 2:
                return "csv";
            case 3:
                return "console";
            default:
                System.out.println("Invalid choice. Defualt choice TXT file");
                return "txt";
        }
    }
    
        public static void main(String[] args) throws IOException {
        UserConsole console = new UserConsole();
        console.start();

    }
    
    }

