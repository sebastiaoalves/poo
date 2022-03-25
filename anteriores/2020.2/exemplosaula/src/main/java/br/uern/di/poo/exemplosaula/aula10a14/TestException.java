/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.exemplosaula.aula10a14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author sebastiao
 */
public class TestException {
    
    class IllegalAttributeValueException extends RuntimeException{
        private String attribute;
        public IllegalAttributeValueException(String attribute, int value){
            super("Valor de atributo ilegal para " + attribute + ":" + value +". Deve ser entre 1 e 20.");
            this.attribute = attribute;
        }
    }
    
    public static void leArquivo(String filename) throws IOException, FileNotFoundException{
        InputStream is = new FileInputStream (filename);

    }
            
    public static void main(String[] args) {
        
    }
}
