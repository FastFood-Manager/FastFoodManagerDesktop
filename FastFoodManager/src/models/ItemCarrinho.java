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
public class ItemCarrinho {
    int ID;
    String Nome;
    int Quantidade;
    double valor;
    public ItemCarrinho(){}
    public ItemCarrinho(int ID, String Nome, int Quantidade, double valor){
        this.ID = ID;
        this.Nome = Nome;
        this.Quantidade = Quantidade;
        this.valor = valor;
    }   

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

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

   

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String Imprimir(){
        return "ID: " + ID + "Nome: " + Nome + "Valor: " + valor;
    }
}
