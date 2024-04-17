
package com.mycompany.sobrecarga;
public class Sobrecarga {

    public static void main(String[] args) {
        Operacoes objOperacao = new Operacoes();
        
        System.out.println("Operações matemáticas");
        System.out.println("Soma");
        System.out.println(objOperacao.soma(2, 4));
        System.out.println(objOperacao.soma(2.5, 5.5));
        
        System.out.println("Subtração");
        System.out.println(objOperacao.subtracao(3, 2));
        System.out.println(objOperacao.subtracao(2.5, 1.2));
        
        System.out.println("Multiplicacao");
        System.out.println(objOperacao.multiplicacao(3, 6));
        System.out.println(objOperacao.multiplicacao(2.3, 4.3));
        
        System.out.println("Divisao");
        System.out.println(objOperacao.divisao(10, 5));
        System.out.println(objOperacao.divisao(2, 5));
         
        System.out.println("Potencia");
        System.out.println(objOperacao.potenciacao(2, 4));
        System.out.println(objOperacao.potenciacao(2.1, 4));
        
        System.out.println("Isso é apenas um teste de sobrecarga");
        objOperacao.printarNaTela("Isso aqui é uma frase e na proxima será um char");
        objOperacao.printarNaTela("c");
    }
}
