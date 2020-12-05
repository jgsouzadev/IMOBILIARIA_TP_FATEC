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
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ewerton
 */
public class ExcluirImovel {
    public void main() {
        File Arquivo = new File("Imóveis.txt");

        try {
            FileReader fr = new FileReader(Arquivo);
            BufferedReader br = new BufferedReader(fr);

            String linha = br.readLine();
            ArrayList<String> salvar = new ArrayList();

            Scanner teclado = new Scanner(System.in);

            int id = 0;

            System.out.println("Digite a id que deseja excluir:");
            while (!teclado.hasNextInt()) {
                System.out.println("Id incorreta, utilize somente números:  ");
                teclado.nextLine();
            }
            id = teclado.nextInt();
            String id2 = String.valueOf(id);
            while (linha != null) {

                // ESTÁ CONFIGURADO PARA SALVAR AS LINHAS NAS VARIAVEIS, EXCETO A LINHA QUE
                // CORRESPONDE A ID2
                if (linha.equals(id2) == true) {
                    int i;
                    for (i = 0; i < 5; i++) {
                        br.readLine();
                    }
                    br.read();
                }

                if (linha.equals(id2) == false) {
                    salvar.add(linha);

                }
                linha = br.readLine();

            }
            fr.close();
            br.close();
            FileWriter fw2 = new FileWriter(Arquivo, true);
            fw2.close();

            FileWriter fw = new FileWriter(Arquivo);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < salvar.size(); i++) {
                bw.write(salvar.get(i));
                bw.newLine();
            }
            bw.close();
            fw.close();
            System.out.println("Excluido com sucesso, selecione outra opção :D ");
            System.out.println("Selecione Outra opção na interface gráfica.");

        } catch (IOException ex) {
            System.out.println("Erro encontrado");

        }
    }
}