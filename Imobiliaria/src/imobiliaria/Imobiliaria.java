/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imobiliaria;

import java.util.Scanner;

/**
 * @author jg e thurzin
 */
public class Imobiliaria {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("***Imobiliária costamar *** \n Escolha uma opção:");
            System.out.println("1) Cadastrar Imóvel \n 2) Alterar dados de imóvel \n 3) Pesquisar Imível \n 4) Excluir Imóvel \n 5) Relatórios \n 6) Sair");
            opcao = teclado.nextInt();
            teclado.close();
        } while (opcao > 6);


        switch (opcao){

           case 1:
           System.out.println("Opção 1");
           break;


           case 2:
           System.out.println("Opção 2");
           break;

           case 3:
           System.out.println("Opção 3");
           break;

           case 4:
           System.out.println("Opção 4");
           break;

           case 5:
           System.out.println("Opção 5");
           break;

           case 6:
           break;

        }




        
    }
    
}
