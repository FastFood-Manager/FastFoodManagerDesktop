/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Henrique
 */
public class ItemCardapio {
    int ID;
    String Nome;
    String Ingredientes;
    double valor;
    
    public ItemCardapio(int ID, String Nome, String Ingredientes, double valor){
        this.ID = ID;
        this.Nome = Nome;
        this.Ingredientes = Ingredientes;
        this.valor = valor;
    }   
public ItemCardapio(){}

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getIngredientes() {
        return Ingredientes;
    }

    public void setIngredientes(String Ingredientes) {
        this.Ingredientes = Ingredientes;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String Imprimir(){
        return "ID: " + ID + "Nome: " + Nome + "Ingredientes: " + Ingredientes + "Valor: " + valor;
    }
    
}


