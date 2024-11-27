/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject18;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Mavenproject18 {

    public static void main(String[] args) {
      Scanner leia = new Scanner (System.in);
      
      int num[] = new int [10];
      double soma = 0;
        
      for(int i=0;i<10;i++)
      {System.out.println("Insira um numero inteiro");
       num[i] = leia.nextInt();
       soma += num[i];}
      double media = soma/10;
      System.out.println("a soma dos números é "+soma+" e a media é "+media);
      leia.close(); 
    }
}
