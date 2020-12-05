package imobiliaria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/**
 * @author Ewerton
 */

public class ListarImoveis {

    public void main() {

        try {
            File arquivo = new File("Imóveis.txt");

            FileReader ler = new FileReader(arquivo);
            BufferedReader lerb = new BufferedReader(ler);

            String linha = lerb.readLine();

            while (linha != null) {
                System.out.println(linha);
                linha = lerb.readLine();
            }

        } catch (IOException ex) {
            System.out.println("Erro encontrado");
        }

    }

}
