/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        String answer1, answer2, answer3, answer4, answer5;

        System.out.print("Is the car silent when you turn the key? ");
        answer1 = input.nextLine();

        if (answer1.equals("yes") || answer1.equals("y") || answer1.equals("Yes")) {
            System.out.print("Are the battery terminals corroded? ");
            answer2 = input.nextLine();

            if (answer2.equals("yes") || answer2.equals("y") || answer2.equals("Yes"))  {
                System.out.print("Clean the terminals and try starting again.");
                System.exit(0);
            }
            else {
                System.out.print("Replace cables and try again.");
                System.exit(0);
            }
        }
        else {
            System.out.print("Does the car make a slicking noise? ");
            answer2 = input.nextLine();

            if (answer2.equals("yes") || answer2.equals("y") || answer2.equals("Yes")) {
                System.out.print("Replace the battery.");
                System.exit(0);
            }
            else {
                System.out.print("Does the car crank up but fail to start? ");
                answer3 = input.nextLine();

                if (answer3.equals("yes") || answer3.equals("y") || answer3.equals("Yes")){
                    System.out.print("Check spark plug connection.");
                    System.exit(0);
                }
                else {
                    System.out.print("Does the engine start and then die? ");
                    answer4 = input.nextLine();

                    if(answer4.equals("yes") || answer4.equals("y") || answer4.equals("Yes")) {
                        System.out.print("Does your car have fuel injection? ");
                        answer5 = input.nextLine();

                        if (answer5.equals("yes") || answer5.equals("y") || answer5.equals("Yes")) {
                            System.out.print("Get it in for service.");
                            System.exit(0);
                        }
                        else {
                            System.out.print("Check to ensure the choke is not opening and closing.");
                            System.exit(0);
                        }
                    }
                    else {
                        System.out.print("This should not be possible.");
                    }
                }
            }
        }
    }
}
