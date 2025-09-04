/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tlholo_koss_kings;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tlhologelo Mogashoa
 */
public class Menu {
     //Declaration
    Scanner input = new Scanner(System.in);
    Registration user = new Registration();
    private int chips;
    private int fish;
    private int coke;
    private int popcorn;
    private int papAndStrew;
    private int hotdog;
    private int burgerAndChips;
    private int totalCost = 0;
    private Random randomNumber = new Random();
    
    public void MenuProgram()
    {
        boolean menuLoop = false;
       
            System.out.println("\n******************");
            System.out.println("Tlholo`s Koss Menu");
            System.out.println("1. Chips = R25");
            System.out.println("2. Fish = R15");
            System.out.println("3. Coke 2L = R23");
            System.out.println("4. PopCorn = R10");
            System.out.println("5. Pap and Strew = R50");
            System.out.println("6. Hotdog = R20");
            System.out.println("7. Burger and Chips = R35");
            System.out.println("8. Click 8 to exit the program");

            int answer = Integer.parseInt(input.nextLine());

            switch(answer)
            {
                case 1:
                    chips++;
                    totalCost += 25;
                    System.out.println("Chips added: R" + totalCost);
                    break;
                case 2:
                    fish++;
                    totalCost += 15;
                    System.out.println("Fish added: R" + totalCost);
                    break;
                case 3:
                    coke++;
                    totalCost += 23;
                    System.out.println("Coke added: R" + totalCost);
                    break;
                case 4:
                    popcorn++;
                    totalCost += 10;
                    System.out.println("Popcorn added: R" + totalCost);
                    break;
                case 5:
                    papAndStrew++;
                    totalCost += 50;
                    System.out.println("Pap and Strew added: R" + totalCost);
                    break;
                case 6:
                    hotdog++;
                    totalCost += 20;
                    System.out.println("Hotdog added: " + totalCost);
                    break;
                case 7:
                    burgerAndChips++;
                    burgerAndChips += 35;
                    System.out.println("Burger and Chips added: R" + totalCost);
                case 8:
                    System.out.println("HAVE A WONDERFUL DAY!!!");
                    System.exit(0);
                default:
                    System.out.println("Does not exist!!!");               
            }
            System.out.println("Total Cost: R" + totalCost);
        
        
        //Calling the other methods
        RandomNumberGenerator();
        DisplayOrder();
    }
    
    public void RandomNumberGenerator()
    {
        System.out.println("Your order Number is: " + randomNumber.nextInt(1000) + 1);
    }
    
    //Method displays the user`s order
    public void DisplayOrder()
    {
        System.out.println("\n----------------------------");
        System.out.println("Receipt ");
        if(chips > 0)
        {
            System.out.println("\nChips: " + chips);
        }
        else
        { 
            if(fish > 0)
            {
                System.out.println("\nFish: " + fish);
            }
            else
            {
                if(coke > 0)
                {
                    System.out.println("\nCoke: " + coke);
                }
                else
                {
                    if(popcorn > 0)
                    {
                        System.out.println("\nPopcorn: " + popcorn);
                    }
                    else
                    {
                        if(papAndStrew > 0)
                        {
                            System.out.println("\nPap and Strew: " + papAndStrew);
                        }
                        else
                        {
                            if(hotdog > 0)
                            {
                                System.out.println("\nHotdog: " + hotdog);
                            }
                            else
                            {
                                if(burgerAndChips > 0)
                                {
                                    System.out.println("\nBurger and Chips: " + burgerAndChips);
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Total Cost: R" + totalCost);
        System.out.println("----------------------------");
        
        //Calling the CallClass method
        CallClass();
    }
    
    //Method to call the WordPuzzle Class
    public void CallClass()
    {
        System.out.println("Do you want to order more food?");
        String answerFood = input.nextLine();
        
        if(answerFood.equalsIgnoreCase("Yes"))
        {
            MenuProgram();
        }

        System.out.println("Do you want to Play a Riddle Game?");
        String answer = input.nextLine();
        
        if(answer.equalsIgnoreCase("Yes"))
        {
            WordPuzzle game = new WordPuzzle();
            game.FirstWordPuzzle();
        }
        else
        {
            if(answer.equalsIgnoreCase("No"))
            {
                MenuProgram();
            }
        }
    }
    
}
