/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject25;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Mavenproject25 {

    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        int alunos[] = new int[5];
        double soma = 0;
        int maior = 0;
        int menor = 0;
        int namedia = 0;
        for(int i=0;i<5;i++)
        {System.out.println("Digite a nota do aluno");
         alunos[i] = leia.nextInt();
         soma+=alunos[i];
         }
        double media = soma/5;
        for (int j =0;j<5;j++)
        {if(alunos[j]< media)
        {menor++;}
        else if(alunos[j] >media)
        {maior++;}
        else
        {namedia++;}
        }
        System.out.println(menor+" alunos estão abaixo da media,"+namedia+" alunos estão exatamente na media e "+maior+" estão acima da media");
        leia.close(); 
    }
}
