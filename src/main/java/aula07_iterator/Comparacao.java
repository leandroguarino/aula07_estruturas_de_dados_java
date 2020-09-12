package aula07_iterator;

import java.util.ArrayList;

public class Comparacao {
    public static void main(String[] args) {
        
        ListaLigada<Integer> lista = new ListaLigada<Integer>();
        
        ArrayList<Integer> vetor = new ArrayList<Integer>();
        
        //Adicionar elementos
        int limite = 100000;
        long tempoInicial = System.currentTimeMillis();
        long tempoFinal;
        for(int i=0; i < limite; i++){
            vetor.add(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Adicionou "+limite+" elementos no vetor");
        System.out.println(tempoFinal - tempoInicial);
        
        tempoInicial = System.currentTimeMillis();
        for(int i=0; i < limite; i++){
            lista.adicionar(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n\nAdicionou "+limite+" elementos na lista");
        System.out.println(tempoFinal - tempoInicial);
        
        //ler valores
        tempoInicial = System.currentTimeMillis();
        for(int i=0; i < vetor.size(); i++){
            vetor.get(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n\nTempo de leitura do vetor");
        System.out.println(tempoFinal - tempoInicial);
        
        tempoInicial = System.currentTimeMillis();
        IteratorListaLigada<Integer> iterator = lista.getIterator();
        while(iterator.temProximo()){
            iterator.getProximo();
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n\nTempo de leitura da lista");
        System.out.println(tempoFinal - tempoInicial);
        
        
    }
}
