/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tvstreamingcompany;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tlhologelo Mogashoa
 */
//Farrell(2023)
public class Series {

    public Series() {
    }
        //Declaration
        static public String SeriesId;
        static public String SeriesName;
        static public String SeriesAge;
        static public String SeriesNumberOfEpisodes;
        static Scanner input = new Scanner(System.in);
        static ArrayList<String> seriesInformation = new ArrayList<>();
        
        //Constructor
    public Series(String SeriesId, String SeriesName, String SeriesAge, String SeriesNumberOfEpisodes)
    {
        this.SeriesId = SeriesId;
        this.SeriesName = SeriesName;
        this.SeriesAge = SeriesAge;
        this.SeriesNumberOfEpisodes = SeriesNumberOfEpisodes;
    }

    //Setter and Getter
    public static String getSeriesId() {
        return SeriesId;
    }

    public static void setSeriesId(String SeriesId) {
        Series.SeriesId = SeriesId;
    }

    public static Scanner getInput() {
        return input;
    }

    public static void setInput(Scanner input) {
        Series.input = input;
    }

    public static ArrayList<String> getSeriesInformation() {
        return seriesInformation;
    }

    public static void setSeriesInformation(ArrayList<String> seriesInformation) {
        Series.seriesInformation = seriesInformation;
    }
    
        
    //Method to Start the program 
    public static void StartProgram()
    {   
        System.out.println("\nLATEST SERIES - 2025");
        System.out.println("***********************");
        System.out.println("Enter (1) to launch menu or any other key to exit.");
        int answer = Integer.parseInt(input.nextLine());
        
        switch(answer)
        {
            case 1:
                menu();
                break;
            case 2:
                System.out.println("HAVE A NICE DAY!!!!");
                break;
            default:
                break;
        }        
    }
    
    //Method for display the menu of the program
    public static void menu()
    {
        System.out.println("Please select one of the following menu items:");
        System.out.println("**********************************************");
        System.out.println("1. Capture a new series.");
        System.out.println("2. Search for a series.");
        System.out.println("3. Update series age restriction");
        System.out.println("4. Delete a series.");
        System.out.println("5. Print series report - 2025");
        System.out.println("6. Exit Application.");
        int responce = Integer.parseInt(input.nextLine());
        
        switch(responce)
        {
            case 1:
                CaptureSeries();
                break;
            case 2:
                SearchSeries();
                break;
            case 3:
                UpdateSeries();
                break;
            case 4:
                DeleteSeries();
                break;
            case 5:
                SeriesReport();
                break;
            case 6:
                ExitSeriesApplication();
                break;
            default:
                System.out.println("DOES NOT EXIST!!!");
                menu();
        }
    }
    
    //Method Captures a new series
    public static void CaptureSeries()
    {    
        //Code for user input
        System.out.println("Enter the Series ID: ");
        SeriesId = input.nextLine();
        System.out.println("Enter the Series Name: ");
        SeriesName = input.nextLine();
        
        //Method is called to validate the Age Restriction
        IsValidAgeRestriction();
        
        System.out.println("Enter the number of episodes for Extreme Sports: ");
        SeriesNumberOfEpisodes = input.nextLine();
        
        //Display that the information has been successfully captured
        System.out.println("Series processed successfully!!! ");
        
        //Adding information to the arraylist
        seriesInformation.add("\n-----------------------------------------------"
                             + "\nSeries ID: " + SeriesId
                             + "\nSeries Name: " + SeriesName
                             + "\nSeries Age Restriction: " + SeriesAge
                             + "\nNumber Of Episodes in Series " + SeriesName + ": " + SeriesNumberOfEpisodes
                             +"\n-----------------------------------------------");
        
        //Calling the StartProgram method
        StartProgram();       
    }
    
    //Method to validate the age restriction
    public static void IsValidAgeRestriction()
    {
        //Declaration     
        boolean validAge = false;
        
         //While loop is used to validate the Series Age Restriction
        while(!validAge)
        {
            System.out.println("Enter the series Age Restriction: ");
            SeriesAge = input.nextLine();
            if(Integer.parseInt(SeriesAge) >= 2 && Integer.parseInt(SeriesAge) <= 18)
            {
                System.out.println("You have enter a valid Age Restriction.");
                validAge = true;
            }
            else
            {
                System.out.println("You have entered the incorrect Age Restriction!!!");
                System.out.println("Please re-enter the Age Restriction >>");
            }
        } 
        
    }
    
    //Method Searches for a series
    public static void SearchSeries()
    {   
        boolean idFound = false;
        //Code for user input
        System.out.println("Enter the Series ID that you wish to look for: ");
        String answer = input.nextLine();
        
        //For Each to extract the Series ID from the arraay. 
        for (String series : seriesInformation) {
            if (SeriesId.equalsIgnoreCase(answer)) 
            {
                System.out.println("\n-----------------------------------------------");
                System.out.println("Series has been found.");
                System.out.println(seriesInformation);
                System.out.println("\n-----------------------------------------------");               
                idFound = true;
            } 
            else 
            {
                System.out.println("\n-----------------------------------------------");
                System.out.println("\nSeries with Series ID: " + answer + " was not found!!!");
                System.out.println("\n-----------------------------------------------");
            }

        }
        //Calling the StartProgram method
        StartProgram();        
    }
    
    //Method updates a serieses age restriction
    public static void UpdateSeries()
    {    
        System.out.println("Enter the SeriesID you wish to Update: ");
        String answer = input.nextLine();
        
        //For loop to search the arraylist
        for(String newSeries : seriesInformation)
        {
            //if statement to look for the correct series ID and replace old information with the new information
            if(SeriesId.equalsIgnoreCase(answer))
            {
                System.out.println("Enter the new Series Name: ");
                SeriesId = input.nextLine();
                
                //Calling the method to validate the users age restriction
                IsValidAgeRestriction();
                
                System.out.println("Enter the new Number of Episodes: ");
                SeriesNumberOfEpisodes = input.nextLine(); 
                
                System.out.println("--------------------------------------"
                                  + "\nNew Series Name: " + SeriesName
                                  +"\nNew Series Age Restriction: " + SeriesAge
                                  +"\nNew Number Of Episodes For Series " + SeriesName + " : " + SeriesNumberOfEpisodes
                                  +"\n--------------------------------------");
                
                System.out.println("Series successfully updated!!!");
            }
            else
            {
                System.out.println("Series with Series ID: " + answer + " was not found!!!");
            }
        }
        //Calling the StartProgram method
        StartProgram();
    }
    
    //Method deletes a a series
    public static void DeleteSeries()
    {      
        System.out.println("Enter the SeriesID that you wish to Delete: ");
        String answer = input.nextLine();
        
        //For loop to search the arraylist
        for(String deleteSeries : seriesInformation)
        {
            //if statement to scan the arraylist in order to delete the series
            if(SeriesId.equalsIgnoreCase(answer))
            {
                System.out.println("Are you sure that you want to delete series " + answer + " from the system?");
                System.out.println("Click (y) for YES.");
                String yes = input.nextLine();
                
                //if statement to comfirm the users answer
                if(yes.equalsIgnoreCase("y"))
                {
                    seriesInformation.remove(deleteSeries);
                    System.out.println("-----------------------------------------------");
                    System.out.println("Series with Series ID: " + answer + " WAS DELETED!!!");
                    System.out.println("-----------------------------------------------");
                }                
            }
            else
            {
                System.out.println("Series ID: " + answer + " NOT FOUND!!!");
            }
        }
        //Calling the StartProgram method
        StartProgram();        
    }
    
    //Method provides a series report
    public static void SeriesReport()
    {
        for(int i = 0; i < seriesInformation.size(); i++)
        {
            System.out.println(seriesInformation.get(i));
        }
        //Calling the StartProgram method
        StartProgram();
    }
    
    //Method allows a user to exit the application
    public static void ExitSeriesApplication()
    {
        System.exit(0);
    }
        
}
//Reference list:
//Farrell, J. (2023) Java programming. Boston, MA: Cengage



