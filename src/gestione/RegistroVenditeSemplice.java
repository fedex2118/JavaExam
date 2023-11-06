package gestione;

import entities.Cliente;
import entities.Giocattolo;

public class RegistroVenditeSemplice extends RegistroVendite {

    private Inventario inventario;

    public RegistroVenditeSemplice(Inventario inventario) {
        this.inventario = inventario;
    }

    @Override
    public void registraVendita(Cliente cliente, Giocattolo giocattolo, int quantita) {
        if (inventario.vendiGiocattolo(giocattolo.getId(), quantita)) {
            System.out.println("Vendita registrata per il cliente: " + cliente.getNome() + " - Giocattolo: " + giocattolo.getNome() + " - Quantità: " + quantita);
        } else {
            System.out.println("Vendita non riuscita, stock insufficiente o giocattolo non esistente.");
        }
    }
    
    @Override
    public void resoVendita(Cliente cliente, Giocattolo giocattolo, int quantita) {
        // TODO Logica del reso da implementare
    }
}
