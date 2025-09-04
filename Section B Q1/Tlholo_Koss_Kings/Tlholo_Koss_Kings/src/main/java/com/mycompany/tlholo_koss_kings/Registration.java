/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tlholo_koss_kings;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tlhologelo Mogashoa
 */
public class Registration {
     //Declaration
    private String name;
    private String surname;
    private int numberOfPeople;
    private int tableNumber;
    Scanner input = new Scanner(System.in);
    ArrayList<String> userInfo = new ArrayList<>();

    //Setter and Getter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }  

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }
    

    //Method welcomes the user
    public void WelcomeUser()
    {
        //Declaration
        boolean valid = false;
        
        System.out.println("Welcome To TMAN PROJECTS!!!");
        System.out.println("******************************************");
        System.out.println("Click 3 to start the program.");
        int answer = Integer.parseInt(input.nextLine());
        
        while(!valid)
        {
            if(answer == 3)
            {
                UserInformation();
            }
            else
            {
                System.out.println("WRONG INPUT!!! TRY AGAIN");
            }
        }      
    }

    //The user enters in their information
    public void UserInformation()
    {
        System.out.println("Enter your name: ");
        name = input.nextLine();
        System.out.println("Enter Surname for " + name + ": ");
        surname = input.nextLine();
        System.out.println("How many people are at the table?");
        numberOfPeople = Integer.parseInt(input.nextLine());
        
        //Calling the ValidTableNumber method
        ValidTableNumber();
        
        //Calling the Menu class
        Menu food = new Menu();
        food.MenuProgram();  
        
        //Adding the user`s information in the ArrayList
        userInfo.add(name + surname + numberOfPeople + tableNumber);

    }
    
    //Method validates the users table number
    public void ValidTableNumber()
    {
        //Declaration
        boolean validTable = false;
        
        while(!validTable)
        {
            System.out.println("Enter your table number...");
            tableNumber = Integer.parseInt(input.nextLine());
            
            if(tableNumber <= 40)
            {
                System.out.println("Order to Table Number: " + tableNumber);
                validTable = true;
            }
            else
            {
                System.out.println("Invalid Table Number!!! RETRY AGAIN!!!");
            }
        }
    }
    
}
