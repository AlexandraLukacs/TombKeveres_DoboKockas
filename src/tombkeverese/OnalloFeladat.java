/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tombkeverese;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LukácsAlexandra(SZOF
 */
public class OnalloFeladat {
        
    static Scanner sc = new Scanner(System.in, "latin2");
    static Random rnd = new Random();
    
    public static void main(String[] args) {
        /* Egy kockás feladat, dobókocka számainak előfordulásának db-ja */
        System.out.println("1. Feladat");
        System.out.print("Hányszor szeretne dobni: ");
        int dobasDb = sc.nextInt();
        while (dobasDb < 1){
            System.out.print("Csak pozitív számot fogadunk el: ");
            dobasDb = sc.nextInt();
        }
        
        final int oldalakSzama = 6;
        int[] dobasok = new int[oldalakSzama+1];
        
        
        for (int i = 0; i < dobasDb; i++) {
            int dobas = rnd.nextInt(1,7);
            dobasok[dobas]++;
        }
        
        for (int i = 0; i < dobasok.length; i++) {
            System.out.printf("%d volt %3d darab\n", i, dobasok[i]);
        }
        System.out.println("");
        
        /* Két kockás feladat, oszlopdiagram */
        System.out.println("2. Feladat");
        System.out.print("Hányszor szeretne dobni: ");
        int dobasSzam = sc.nextInt();
        
        
        
    }
}
