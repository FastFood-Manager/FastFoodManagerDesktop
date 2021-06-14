/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import models.ItemCardapio;
import UI.MySQL;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Henrique
 */
public class CardapioDAO {

    MySQL conectar;

    public CardapioDAO() {
        conectar = new MySQL();
    }
    
    public void inserir(ItemCardapio item){
         conectar.conectaBanco();    //Conecta ao banco de dados

        try {

            this.conectar.insertSQL("INSERT INTO Cardapio("
                    + "Item_nome,"
                    + "Item_Igredientes,"
                    + "Item_valor"
                    + ") VALUES ("
                    + "'" + item.getNome() + "',"
                    + "'" + item.getIngredientes() + "',"
                    + "'" + item.getValor() + "'"
                    + ");");

        } catch (Exception e) {

            System.out.println("Erro ao lançar contas a receber " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao lançar contas a receber");

        } finally {
            this.conectar.fechaBanco();
            JOptionPane.showMessageDialog(null, "Conta Lançada com sucesso");
        }
    }

    public ArrayList<ItemCardapio> selecionarTodos() {
        try {
            conectar.conectaBanco();
            this.conectar.executarSQL(
                    "SELECT * From cardapio;"
            );
            ResultSet rs = this.conectar.getResultSet();
            ArrayList<ItemCardapio> ItemCard = new ArrayList<>();
            while (rs.next()) {
                ItemCard.add(new ItemCardapio(rs.getInt("Item_ID") ,
                        rs.getString("Item_nome") ,
                        rs.getString("Item_Igredientes"),
                        rs.getDouble("Item_valor")));
            }
            return ItemCard;

        } catch (Exception e) {
            System.out.println("Erro ao consultar Cardapio " + e.getMessage());
            return null;
        } finally {
            this.conectar.fechaBanco();
        }
    }
}
