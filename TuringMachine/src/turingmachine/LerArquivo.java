package turingmachine;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LerArquivo {
    String multiplo, parImpar, soma, regra, entrada, saida;
    static BufferedReader mult;
    static BufferedReader parOuImpar;
    static BufferedReader somas;
    static BufferedReader regras;
    static BufferedReader ent;
    static BufferedWriter sai;
    static String linha[];
    static String posAtual = "q0";
    
    public LerArquivo(String multiplo, String parImpar, String soma, String regra, String entrada, String saida) throws FileNotFoundException, IOException{
        this.multiplo = multiplo;
        this.parImpar = parImpar;
        this.soma = soma;
        this.regra = regra;
        this.entrada = entrada;
        this.saida = saida;
        LerArquivo.mult = new BufferedReader(new FileReader(multiplo));
        LerArquivo.parOuImpar = new BufferedReader(new FileReader(parImpar));
        LerArquivo.somas = new BufferedReader(new FileReader(soma));
        LerArquivo.regras = new BufferedReader(new FileReader(regra));
        LerArquivo.ent = new BufferedReader(new FileReader(entrada));
        LerArquivo.sai = new BufferedWriter(new FileWriter(saida));
    }
    
    public static String lerEntrada() throws IOException{
        String Ler;
        Ler = ent.readLine();
        return Ler;
    }
 
    public int verificar() throws IOException{
        String input[];
        int i = 0;
        input = lerEntrada().split("");
        String leitor = "";
        mult.mark(1000);
        parOuImpar.mark(1000);
        somas.mark(1000);
        regras.mark(1000);
        
        
        while (leitor != null) {
            if(i>=input.length&&posAtual.contains("qf")){
                for (String input1 : input) {
                    sai.append(input1);
                }
                mult.close();
                parOuImpar.close();
                somas.close();
                regras.close();
                ent.close();
                sai.close();
                return 1;
                
            }else if(i>=input.length){
                for (String input1 : input) {
                    sai.append(input1);
                }
                mult.close();
                parOuImpar.close();
                somas.close();
                regras.close();
                ent.close();
                sai.close();
                return 0;
            }
            linha = leitor.split(" ");
            if(linha[0].equals(posAtual) && linha[1].equals(input[i])){
                posAtual=linha[4];
                input[i]=linha[2];
                if(linha[3].equals("R")){
                    i++;
                }else if (linha[3].equals("L")){
                    i--;
                }
                mult.reset();
                parOuImpar.reset();
                somas.reset();
                regras.reset();
            }else{
                leitor = mult.readLine();
                leitor = parOuImpar.readLine();
                leitor = somas.readLine();
                leitor = regras.readLine();
            }
        }
        for (String input1 : input) {
                    sai.append(input1);
                }
                mult.close();
                parOuImpar.close();
                somas.close();
                regras.close();
                ent.close();
                sai.close();
        return 0;
    }
}
