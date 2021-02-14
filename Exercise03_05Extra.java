/*Programmer Trevor Eales
Date: February 13, 2021
CSC201-Z01S
Assignment: Group Assignment 3 (Exercise03_05Extra)
Description: This program draws a random card from a standard playing deck */
public class Exercise03_05Extra {
    public static void main(String[] args) {
    // Generate a random number from 0-51
        int number = (int) (Math.random() * 51 );
        System.out.println(" number = " + number);
    // Get the card number
        switch (number % 13) {
           case 0: System.out.print("The card is Ace of "); break;
           case 10: System.out.print("The card is Jack of "); break;
           case 11: System.out.print("The card is Queen of "); break;
           case 12: System.out.print("The card is King of "); break;
           default: System.out.print("The card is " + (number % 13 + 1) + " of ");
       }    
    // Get the suit
        switch (number / 13) {
            case 0: System.out.print("Spades"); break;
            case 1: System.out.print("Diamonds"); break;
            case 2: System.out.print("Clubs"); break;
            case 3: System.out.print("Hearts");
        }
    }
}
