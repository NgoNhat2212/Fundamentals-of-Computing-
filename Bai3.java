/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conditional.execution;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Place: ");
        int place = scanner.nextInt();
         if ( place == 1){
            System.out.println("Gold medal!");
        } else if (place == 2){
            System.out.println("Silver medal!");
        } else if (place == 3) {
            System.out.println("Brone medal.");
        }
        
    }
    
}
