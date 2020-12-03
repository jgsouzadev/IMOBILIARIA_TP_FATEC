    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imobiliaria;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Ewerton
 */
public class Cadastro {
    public static void main(String[] args) {
   
      // File file = new File("Imóveis Cadastrados");
       //file.mkdir();
        
        
        File arquivo = new File("Imóveis.txt");
        
        Scanner teclado = new Scanner(System.in);
        
        
        
        
       
        
        //CADASTRO DOS DADOS DO IMÓVEL 
       
       
        System.out.println("ID do Imóvel: ");
        int id = teclado.nextInt();
        
       
        System.out.println("Endereço: ");
        String endereco = teclado.next();
        
        System.out.println("Numero: ");
        int numeroEndereco = teclado.nextInt();
     
        
        System.out.println("Tipo: ");
        String tipo = teclado.next();
        
          System.out.println("Número de cômodos: ");
        int comodos = teclado.nextInt();
        
        System.out.println("Area: ");
        int area= teclado.nextInt();
      
        
        System.out.println("Valor do Imóvel: ");
        int valor = teclado.nextInt();
        
        
        
        
        
        
        //PARTE ONDE GRAVA
        try{
             // arquivo.createNewFile();
           
            
            
            FileWriter fileWriter = new FileWriter(arquivo, true);
            BufferedWriter escrever = new BufferedWriter(fileWriter);
            
            
           //GRAVAÇÃO DOS DADOS DO IMÓVEL
            
            escrever.write(id);
            escrever.write("\n");
      
            escrever.write(endereco);
            escrever.write("\n");
            
            escrever.write(numeroEndereco);
            escrever.write("\n");
            
            escrever.write(tipo);
            escrever.write("\n");
            
            escrever.write(area);
            escrever.write("\n");
            
            escrever.write(valor);
            escrever.write("\n");
            
            escrever.write(comodos);
            escrever.write("\n");
            
            
           // PULO MAIS UMA LINHA PARA DIFERENCIAR DO PROXIMO IMÓVEL A SER CADASTRADO
            escrever.write("\n");
            
            
            
            
            
            escrever.close();
            fileWriter.close();
            
            FileReader ler = new FileReader(arquivo);
            BufferedReader lerb = new BufferedReader(ler);
         
            
            String linha= lerb.readLine();
           
            while (linha != null){
                System.out.println(linha);
                linha= lerb.readLine();
            }
            
          
            
            
        }
        catch (IOException ex){
                
                }
        
        
        }
     
    
}

    
    
    
