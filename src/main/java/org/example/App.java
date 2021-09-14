/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Berkay Arslan
 */

package org.example;
import java.util.*;
public class App
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sqftGallon = 350;
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        double totalSq = length * width;
        int gallon = (int)Math.ceil(totalSq/sqftGallon);
        System.out.println("You will need to purchase " +gallon+ " of paint to cover " +totalSq+ " square feet");
    }
}