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
public class IPItemPedido {
    int ID;
    int Pedido_ID;
    int IP_IDCardapio;
    int IP_QTD;
    double IP_valor;

    public IPItemPedido() {
    }

    public IPItemPedido(int ID, int Pedido_ID, int IP_IDCardapio, int IP_QTD, double IP_valor) {
        this.ID = ID;
        this.Pedido_ID = Pedido_ID;
        this.IP_IDCardapio = IP_IDCardapio;
        this.IP_QTD = IP_QTD;
        this.IP_valor = IP_valor;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPedido_ID() {
        return Pedido_ID;
    }

    public void setPedido_ID(int Pedido_ID) {
        this.Pedido_ID = Pedido_ID;
    }

    public int getIP_IDCardapio() {
        return IP_IDCardapio;
    }

    public void setIP_IDCardapio(int IP_IDCardapio) {
        this.IP_IDCardapio = IP_IDCardapio;
    }

    public int getIP_QTD() {
        return IP_QTD;
    }

    public void setIP_QTD(int IP_QTD) {
        this.IP_QTD = IP_QTD;
    }

    public double getIP_valor() {
        return IP_valor;
    }

    public void setIP_valor(double IP_valor) {
        this.IP_valor = IP_valor;
    }
    
    
    
    
}
