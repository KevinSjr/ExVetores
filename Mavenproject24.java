/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject24;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Mavenproject24 {

    public static void main(String[] args) {
       Scanner leia = new Scanner(System.in);
       
       int p = 0;
       int i = 0;
       int nums[] = new int[15];
       
       for(int j=0;j<15;j++)
       {System.out.println("Insira um número inteiro");
        nums[j]=leia.nextInt();
        if(nums[j]%2 == 0)
        {p++;}
        else{i++;}} 
       System.out.println("a quantidade de números pares é"+p+" e a quantidade de números impares é"+i);
       leia.close(); 
               
    }
}
