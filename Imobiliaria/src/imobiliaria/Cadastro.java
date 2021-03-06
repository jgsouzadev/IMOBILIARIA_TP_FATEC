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

    public void main() {

        // File file = new File("Imóveis Cadastrados");
        // file.mkdir();
        File arquivo = new File("Imóveis.txt");

        Scanner teclado = new Scanner(System.in);

        // CADASTRO DOS DADOS DO IMÓVEL
        // System.out.println("ID do Imóvel: ");
        // int id = teclado.nextInt();
        int id = 0;
        System.out.println("Id do imóvel:");
        while (!teclado.hasNextInt()) {
            System.out.println("Id incorreta, utilize somente números:  ");
            teclado.nextLine();
        }
        id = teclado.nextInt();
        String id2 = String.valueOf(id);

        Scanner tecladoString = new Scanner(System.in);
        System.out.println("Endereço (somente nome da rua): ");
        String endereco = tecladoString.nextLine();

        System.out.println("Tipo: ");
        String tipo = tecladoString.nextLine();

        int comodos = 0;
        System.out.println("Número de cômodos: ");
        while (!teclado.hasNextInt()) {
            System.out.println("Inválido! Insira apenas números: ");
            teclado.nextLine();
        }
        comodos = teclado.nextInt();
        String comodos2 = String.valueOf(comodos);

        int area = 0;
        System.out.println("Area (apenas números): ");
        while (!teclado.hasNextInt()) {
            System.out.println("Inválido! Insira apenas números: ");
            teclado.nextLine();
        }
        area = teclado.nextInt();
        String area2 = String.valueOf(area);

        System.out.println("Valor: ");
        String valor = tecladoString.nextLine();
        String valor2 = String.valueOf(valor);

        // PARTE ONDE GRAVA
        try {
            // arquivo.createNewFile();

            FileWriter fileWriter = new FileWriter(arquivo, true);
            BufferedWriter escrever = new BufferedWriter(fileWriter);

            // GRAVAÇÃO DOS DADOS DO IMÓVEL
            escrever.write(id2);
            escrever.write("\n");

            escrever.write(endereco);
            escrever.write("\n");

            escrever.write(tipo);
            escrever.write("\n");

            escrever.write(comodos2);
            escrever.write("\n");

            escrever.write(area2);
            escrever.write("\n");

            escrever.write(valor2);
            escrever.write("\n");

            // PULO MAIS UMA LINHA PARA DIFERENCIAR DO PROXIMO IMÓVEL A SER CADASTRADO
            escrever.write("\n");

            escrever.close();
            fileWriter.close();

            FileReader ler = new FileReader(arquivo);
            BufferedReader lerb = new BufferedReader(ler);

            String linha = lerb.readLine();

            while (linha != null) {
                System.out.println(linha);
                linha = lerb.readLine();
            }

            System.out.println("Cadastrado com sucesso :D");
            System.out.println("Selecione Outra opção na interface gráfica.");
        } catch (IOException ex) {
            System.out.println("Erro encontrado");
            
        }

    }

}
