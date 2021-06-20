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
public class ItemPedidoClass {

    int ID;
    String Nome;
    String Status;

    public ItemPedidoClass(int ID, String Nome, String Status) {
        this.ID = ID;
        this.Nome = Nome;
        this.Status = Status;
    }

    public ItemPedidoClass() {
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

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    
}
