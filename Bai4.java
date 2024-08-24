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
public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap gia tri a:");
        int a = scanner.nextInt();
        System.out.println("Nhap gia tri b:");
        int b = scanner.nextInt();
        if ( a == 0) {
            if (b == 0){
            System.out.println("Phuong trinh co vo so nghiem");
        } else {
            System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double x = -b/a;
            System.out.println(" Phuong trinh co nghiem la: ");
       
        }
    }
}
