/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject26;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Mavenproject26 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        String nomes[] = new String [10];
        
        for(int i =0;i<10;i++)
        {System.out.println("Digite um nome");
         nomes[i] = leia.next();
        }
        System.out.println("Digite um nome para busca");
        String busca = leia.next();
        if(busca.equals(nomes[0]))
        {System.out.println("O Nome está presenta no vetor, na posição 1");}
        else if(busca.equals(nomes[1]))
        {System.out.println("O Nome está presente no vetor, na posição 2");} 
       else if(busca.equals(nomes[2]))
        {System.out.println("O Nome está presente no vetor, na posição 3");}
       else if(busca.equals(nomes[3]))
        {System.out.println("O Nome está presente no vetor, na posição 4");}
      else if(busca.equals(nomes[4]))
        {System.out.println("O Nome está presente no vetor, na posição 5");}
      else if(busca.equals(nomes[5]))
        {System.out.println("O Nome está presente no vetor, na posição 6");}
      else if(busca.equals(nomes[6]))
        {System.out.println("O Nome está presente no vetor, na posição 7");}
       else if(busca.equals(nomes[7]))
        {System.out.println("O Nome está presente no vetor, na posição 8");}
       else if(busca.equals(nomes[8]))
        {System.out.println("O Nome está presente no vetor, na posição 9");}
        else if(busca.equals(nomes[9]))
        {System.out.println("O Nome está presente no vetor, na posição 10");}
        leia.close(); 
    }
}
