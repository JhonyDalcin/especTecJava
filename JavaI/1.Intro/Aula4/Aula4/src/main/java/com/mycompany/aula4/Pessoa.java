/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula4;

/**
 *
 * @author jhonydalcin
 */
public class Pessoa {
    int rg;
    String nome;
    
    Pessoa(){
        rg = 100;
        nome = "Paz";
    }
        
    public void insereDados(){
        int rg = 1;
        String nome = "Jesus";
        this.rg = rg;
        this.nome = nome;
    }
    
    public void mostraDados(){
        System.out.println("\n RG: "+rg);
        System.out.println("\n Nome: "+nome);
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        //p.insereDados();
        p.mostraDados();
    }
}
