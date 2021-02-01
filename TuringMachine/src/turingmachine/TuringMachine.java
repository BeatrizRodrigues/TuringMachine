package turingmachine;

import java.io.IOException;

public class TuringMachine {

    public static void main(String[] args) throws IOException {
        String multiplo = "C:\\Users\\beeat\\OneDrive\\Documentos\\NetBeansProjects\\TuringMachine\\src\\turingmachine\\MultPor2.txt";
        String parOuImpar = "C:\\Users\\beeat\\OneDrive\\Documentos\\NetBeansProjects\\TuringMachine\\src\\turingmachine\\parOuImpar.txt";
        String soma = "C:\\Users\\beeat\\OneDrive\\Documentos\\NetBeansProjects\\TuringMachine\\src\\turingmachine\\soma.txt";
        String regras = "C:\\Users\\beeat\\OneDrive\\Documentos\\NetBeansProjects\\TuringMachine\\src\\turingmachine\\regras.txt";
        String entrada = "C:\\Users\\beeat\\OneDrive\\Documentos\\NetBeansProjects\\TuringMachine\\src\\turingmachine\\entrada.txt";     
        String saida = "C:\\Users\\beeat\\OneDrive\\Documentos\\NetBeansProjects\\TuringMachine\\src\\turingmachine\\saida.txt";
                
        LerArquivo leitor = new LerArquivo(multiplo, parOuImpar, soma, regras, entrada, saida);
        System.out.println(leitor.verificar());
    }
    
}
