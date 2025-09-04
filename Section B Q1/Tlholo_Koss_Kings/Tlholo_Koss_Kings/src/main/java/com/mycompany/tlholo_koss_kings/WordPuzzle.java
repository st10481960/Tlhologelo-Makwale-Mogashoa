/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tlholo_koss_kings;

import java.util.Scanner;

/**
 *
 * @author Tlhologelo Mogashoa
 */
public class WordPuzzle {
        //Declaration
    Scanner input = new Scanner(System.in);
    
    public void FirstWordPuzzle()
    {
            System.out.println("1. What goes up and never comes down?");
            String ageAnswer = input.nextLine();

            if(ageAnswer.equalsIgnoreCase("Age"))
            {
                System.out.println("CORRECT!!!");
                System.out.println("YOU ARE SMART!!!");
            }
            else
            {
                System.out.println("INCORRECT!!!");
                System.out.println("TRY AGAIN!!!");
                FirstWordPuzzle();
            }
        
    }
    
    public void SecondWordPuzzle()
    {
            System.out.println("What gets more wet as it dries up?");
            String towelAnswer = input.nextLine();
            
            if(towelAnswer.equalsIgnoreCase("Towel"))
            {
                System.out.println("CORRECT!!!");
                System.out.println("YOU ARE SMART!!!");
            }
            else
            {
                System.out.println("INCORRECT!!!");
                System.out.println("TRY AGAIN!!!");
                SecondWordPuzzle();
            }
        
    }
    
    public void ThirdWordPuzzle()
    {
        
            System.out.println("The poor have me; the rich need me. Eat me and you will die. What am I?");
            String nothingAnswer = input.nextLine();
            
            if(nothingAnswer.equalsIgnoreCase("Nothing"))
            {
                System.out.println("CORRECT!!!");
                System.out.println("YOU ARE SMART!!!");
            }
            else
            {
                System.out.println("INCORRECT!!!");
                System.out.println("TRY AGAIN!!!");
                ThirdWordPuzzle();
            }         
                     
    }
    
    public void ExitTheGame()
    {
        System.out.println("You are done playing the game and done with your  order. Have a wonderful day!");
    }
    
    
}
