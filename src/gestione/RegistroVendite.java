package gestione;

import entities.Cliente;
import entities.Giocattolo;

public abstract class RegistroVendite {

	public abstract void registraVendita(Cliente cliente, Giocattolo giocattolo, int quantita);
}
