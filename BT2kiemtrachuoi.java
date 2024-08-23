/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testnetbeans;

import java.util.Scanner;

public class BT2kiemtrachuoi {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input :");
        String input = keyboard.nextLine();
        boolean check = input instanceof String;
        System.out.println("Kiem tra phai chuoi hay khong : " + check);
    }
}
