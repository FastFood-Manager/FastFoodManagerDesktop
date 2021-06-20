package UI;

/**
 *
 * @author Henrique
 */
public class Pedido {
    
    int ID;
    String Nome;
    String Status;

    public Pedido(int ID, String Nome, String Status) {
        this.ID = ID;
        this.Nome = Nome;
        this.Status = Status;
    }

    public Pedido() {
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
