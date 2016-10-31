/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refresh.quiz;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Aleaya
 */
public class RefreshQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random x = new Random();
        Scanner keyboard = new Scanner (System.in);
        System.out.println("What number would you like to generate random numbers up to?");
        int limit = keyboard.nextInt();
        System.out.println("How many numbers would you like to generate?");
        int nums = keyboard.nextInt();
        if(limit > 20 || nums > 20 || limit < 1 || nums < 1)
        {
            System.out.println("Try again. Please choose numbers between 1 and 20.");
            System.out.println("What number would you like to generate random numbers up to?");
            limit = keyboard.nextInt();
            System.out.println("How many numbers would you like to generate?");
            nums = keyboard.nextInt();
        }
        
        for(int i = 0; i<nums; i++)
        {
        int ran = 1 + x.nextInt(limit);
        System.out.println(ran);
        }
        keyboard.close();
    }
    
}
