/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Phi-Hung Tran
 */


import java.util.Calendar;
import java.util.Scanner;

public class ex6 {
    static void Calculator(int currentAge, int retirementAge){
        int currentYear= Calendar.getInstance().get(Calendar.YEAR); //stores the current year
        int yearsLeftToRetirement = retirementAge-currentAge;   //stores the years left to retire

        if(yearsLeftToRetirement >= 0) {    //if year left to retire is more than 0
            int retirementYear = currentYear + yearsLeftToRetirement;
            System.out.println("You have " + yearsLeftToRetirement + " years left until you can retire ");
            System.out.println("Its " + currentYear + " so you can retire in " + retirementYear + ".");
        }else{
            System.out.println("You can already retire");
        }
    }


    public static void main(String[] args){
        int currentAge; //stores current age
        int retirementAge;  //stores retirement age
        Scanner input=new Scanner(System.in);

        System.out.print("what is your current age? ");
        currentAge = input.nextInt();   //stores input of current age
        System.out.print("At what age would you like to retire? ");
        retirementAge = input.nextInt();    //stores input of age of retirement

        Calculator(currentAge,retirementAge);

    }

}
