/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uern.di.poo.aula27;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lordi
 */
public class TesteExcecao {
    
    
    public static int converteInt(String n) throws NumeroNegativoException, NumberFormatException{
        int i = parseInt(n);
        if (i<0)
            throw new NumeroNegativoException ();
        return i;
    }
    
    public static void main(String[] args) {
       
        boolean repete;
        do{
            repete = false;
            try{
                int n = converteInt (showInputDialog("Digite um número"));
                int p = converteInt (showInputDialog("Digite outro número"));
                showMessageDialog(null, "O resultado de  n/p é" + n/p);       
            }catch(NumberFormatException nfe){
                showMessageDialog(null, "Formato de número inválido!");
                repete=true;
            }catch(ArithmeticException ae){
                showMessageDialog(null, "Divisão por zero");
                repete=true;
            } catch (NumeroNegativoException ex) {
                showMessageDialog(null, ex.toString());
            }finally{
                showMessageDialog(null, "entrou no finally");
            }
        }while(repete);
    }
}
