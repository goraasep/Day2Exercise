package org.example.exercise;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Exercise {
    public static void run() {
        System.out.println("=====Exercise 1=====");
        fahrenheitToCelsius(32);
        System.out.println("=====Exercise 2=====");
        cmToKm(3200);
        System.out.println("=====Exercise 3=====");
        System.out.println("Check if odd = " + oddCheck(2));
        convertToCurrency(1000);
        System.out.println("=====Exercise 4=====");
        removeFirstOccurrence("ell", "Hello World");
        System.out.println("=====Exercise 5=====");
        System.out.println("Check if palindrome = " + isPalindrome("madam"));
    }

    //    Exercise 1
//    Write a program that takes a temperature in Fahrenheit as input
//    and converts it to Celsius.
    public static void fahrenheitToCelsius(double f) {
        double celsius = (f - 32) * 5 / 9;
        System.out.println("Fahrenheit to Celsius = " + celsius + " °C");
    }

    //    Exercise 2
//    Write a code to convert centimeter to kilometer.
    public static void cmToKm(double cm) {
        double km = cm / 100000;
        System.out.println("cm to km = " + km + " km");
    }

    //    Exercise 3.1
//    Write a function that takes an integer n as input and returns true
//    if n is odd and false if n is even
    public static boolean oddCheck(Integer n) {
        return n % 2 != 0;
    }

    //    Exercise 3.2
//    Example : 1000 → “Rp. 1.000,00”
    public static void convertToCurrency(Integer amount) {
        Currency idr = Currency.getInstance("IDR");
        Locale loc = new Locale("id", "ID");
        // Create a NumberFormatter with custom currency
        NumberFormat idrFormatter
                = NumberFormat.getCurrencyInstance(loc);
        idrFormatter.setCurrency(idr);
        String currIdr = idrFormatter.format(amount);
        System.out.println("Current balance = " + currIdr);
    }

    //    Exercise 4
//    Write a code to remove the first occurrence of a given “search
//    string” from a string
    public static void removeFirstOccurrence(String word, String target) {
        System.out.println(target.replaceFirst(word, ""));
    }

    //    Exercise 5
//    Write a code to check whether a string is a palindrome or not.
    public static boolean isPalindrome(String word) {
        String newWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            newWord +=  word.charAt(i);
        }
        return word.equals(newWord);
    }
}
