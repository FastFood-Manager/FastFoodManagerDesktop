/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author Henrique
 */
public class ItemCardapio {
    String ID;
    String Nome;
    String Ingredientes;
    String valor;
    
    public ItemCardapio(String ID, String Nome, String Ingredientes, String valor){
        this.ID = ID;
        this.Nome = Nome;
        this.Ingredientes = Ingredientes;
        this.valor = valor;
    }   

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
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

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    public String Imprimir(){
        return "ID: " + ID + "Nome: " + Nome + "Ingredientes: " + Ingredientes + "Valor: " + valor;
    }
    
}


