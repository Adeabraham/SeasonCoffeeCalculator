package chapter2assignment;

import java.util.Scanner;

public class SeasonCoffeeCalculator {
    public static void main(String args[]){

        //1.	Get the season of the year
        System.out.println("Enter the season of the year");
        Scanner scanner = new Scanner(System.in);// declare scanner and import it
        String season = scanner.next(); //declare variable called season: data type:int,
                                        // and read the entered season

//2.	Get a whole number
        System.out.println("Enter the number of cups");
         int rate = scanner.nextInt();// no need to declare scanner again, declare variable (rate) of type int,and
                                      // use scanner to read the number of cups

//3.	Get an adjective
        System.out.println("Enter an adjective");
        String adject = scanner.next();//declare variable (adject) of type string,and
                                       // use scanner to read the number of cups

//4.	Combine season, number and adjective

//5.	Display result
        System.out.println("On a " + adject  +  season + " day , I drink a minimum of " + rate  + "cups of coffee.");

    }
}

/*
                                               Teacher's Solution:

package exercises.chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a season of the year:");
        String season = scanner.next();

        System.out.println("Enter a whole number:");
        int number = scanner.nextInt();

        System.out.println("Enter an adjective:");
        String adjective = scanner.next();

        scanner.close();

        System.out.println("On a " + adjective + " " + season +
                " day, I drink a minimum of " + number +
                " cups of coffee.");
    }
}

 */