/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.aula27;

/**
 *
 * @author lordi
 */
public class NumeroNegativoException extends Exception{
        @Override
        public String toString(){
            return "Número negativo não permitido";
        }    
}
