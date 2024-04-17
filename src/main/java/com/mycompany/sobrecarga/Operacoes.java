package com.mycompany.sobrecarga;
public class Operacoes {
    
    
    public int soma(int x, int y){
       int soma = x + y;
       return soma;
    }
    
    public double soma(double x, double y){
       double soma = x + y;
       return soma;
    }
    
    public int subtracao(int x, int y){
       int subtracao = x - y;
       return subtracao;
    }
    
    public double subtracao(double x, double y){
       double subtracao = x - y;
       return subtracao;
    }
    public int multiplicacao(int x, int y){
       int multiplicacao = x * y;
       return multiplicacao;
    }
    
    public double multiplicacao(double x, double y){
       double multiplicacao = x * y;
       return multiplicacao;
    }
    public int divisao(int x, int y){
       int divisao = x / y;
       return divisao;
    }
    
    public double divisao(double x, double y){
       double divisao = x / y;
       return divisao;
    }
    public int potenciacao(int x, int y){
       int potenciacao = 1;
       
       for (int i = 0; i < y; i++){
           potenciacao *= x;
       }
       return potenciacao;
    }
    
    public double potenciacao(double x, double y){
       double potenciacao = Math.pow(x, y);
       return potenciacao;
    }
    
    
    public void printarNaTela(String Frase){
        System.out.println(Frase);
    }
    
    public void printarNaTela(char letra){
        System.out.println(letra);
    }
    
}
