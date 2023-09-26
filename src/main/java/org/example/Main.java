package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mtg, fng, favg;

        System.out.print("Enter your midterm grade: ");
        mtg = input.nextDouble();

        System.out.print("Enter your final grade: ");
        fng = input.nextDouble();

        favg = (mtg * 50/100) + (fng* 50/100);

        System.out.println("Your Final Average is "+ favg);

        if(favg >= 96 && favg <= 100) {
            System.out.println("Your grade point is 4.0");
        }
        else if(favg >= 90 && favg <= 95) {
            System.out.println("Your grade point is 3.5");
        }
        else if(favg >= 84 && favg <= 89) {
            System.out.println("Your grade point is 3.0");
        }
        else if(favg >= 78 && favg <= 83) {
            System.out.println("Your grade point is 2.5");
        }
        else if(favg >= 72 && favg <= 77) {
            System.out.println("Your grade point is 2.0");
        }
        else if(favg >= 66 && favg <= 71) {
            System.out.println("Your grade point is 1.5");
        }
        else if(favg >= 60 && favg <= 65) {
            System.out.println("Your grade point is 1.0");
        }
        else if(favg >= 0 && favg <= 59) {
            System.out.println("Your grade point is R");
        }
        else {
            System.out.println("Invalid grade");
        }
    }
}