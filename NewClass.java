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
public class NewClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap gia tri vao x:");
        int x = scanner.nextInt();
        if ( x > 0 ) {
            System.out.println("Positive");
        } else if ( x < 0 ) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        
    }
    
}
