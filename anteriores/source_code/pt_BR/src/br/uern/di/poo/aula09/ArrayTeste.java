/*
 Exercício em sala
- Criar uma classe ArrayTeste com um método main
- Criar dois vetores de inteiros com 10 posições
-- O primeiro deve iniciar com valores de 10 até 1
-- O segundo preenchido com valor -1 nas 5 primeiras posições e 5 nas últimas posições
- Comparar os vetores para verificar se são iguais
- Criar um método public static void imprimeArray para exibir um array passado
- Exibir os dois arrays com o método criado
- Buscar o elemento 7 nos dois arrays
- Copiar o conteúdo do primeiro no segundo
- Testar novamente se são iguais
- Exibir novamente os dois vetores
 */
package br.uern.di.poo.aula09;

import java.util.Arrays;

/**
 *
 * @author lordi
 */
public class ArrayTeste {

    public static void main(String[] args) {
        // Criando os vetores
        int [] array1 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int array2[] = new int[10];
        Arrays.fill(array2, 0, 5, -1);
        Arrays.fill(array2, 5, 10, 5);
        
        // Comparando se são iguais
        if(Arrays.equals(array1,array2))
            System.out.println("Os vetores são iguais");
        else
            System.out.println("Os vetores são diferentes");
        
        // Exibindo usando a função imprimeArray criada
        imprimeArray(array1);
        imprimeArray(array2);
        
        // Buscando o elemento 7 com binarySearch. Lembrar de ordenar o vetor antes
        Arrays.sort(array1);
        if(Arrays.binarySearch(array1, 7)>=0)  // Retorna a posição do elemento no vetor
            System.out.println("Elemento 7 encontrado no array1");
        else   // Se a posição for menor que 0, o elemento não existe no vetor
           System.out.println("Elemento 7 não foi encontrado no array1");
        
        Arrays.sort(array2);
        if(Arrays.binarySearch(array2, 7)>=0)  // Retorna a posição do elemento no vetor
            System.out.println("Elemento 7 encontrado no array2");
        else   // Se a posição for menor que 0, o elemento não existe no vetor
           System.out.println("Elemento 7 não foi encontrado no array2");
        
        // Copiando o conteúdo e testando novamente se são iguais
        System.arraycopy(array1, 0, array2, 0, array2.length);
        if(Arrays.equals(array1,array2))
            System.out.println("Os vetores são iguais");
        else
            System.out.println("Os vetores são diferentes");
        
        // Exibindo os dois novamente
        imprimeArray(array1);
        imprimeArray(array2);
        
        // That's all folks!
    }
    // O método pode ser declarado depois de ser chamado  
    public static void imprimeArray(int [] array){
        for(int i:array)
            System.out.print(i+" ");
        System.out.println("");
    }
}
