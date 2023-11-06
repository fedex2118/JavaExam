package gestione;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import entities.Giocattolo;

public class Inventario {

	private Map<Integer, Giocattolo> giocattoliDisponibili;
    private Map<Integer, Integer> stockGiocattoli;

    public Inventario() {
        this.giocattoliDisponibili = new HashMap<>();
        this.stockGiocattoli = new HashMap<>();
    }

    public void aggiungiGiocattolo(Giocattolo giocattolo, int quantita) {
        giocattoliDisponibili.put(giocattolo.getId(), giocattolo);
        stockGiocattoli.put(giocattolo.getId(), quantita);
    }

    public boolean vendiGiocattolo(int id, int quantitaDaVendere) {
        Integer stockAttuale = stockGiocattoli.get(id);
        if (stockAttuale != null && quantitaDaVendere <= stockAttuale) {
            stockGiocattoli.put(id, stockAttuale - quantitaDaVendere);
            return true;
        }
        return false;
    }

    public boolean rifornisciGiocattolo(int id, int quantitaDaAggiungere) {
        Integer stockAttuale = stockGiocattoli.get(id);
        if (stockAttuale != null) {
            stockGiocattoli.put(id, stockAttuale + quantitaDaAggiungere);
            return true;
        }
        return false;
    }

    public Giocattolo getGiocattolo(int id) {
        return giocattoliDisponibili.get(id);
    }

    public int getStockGiocattolo(int id) {
        return stockGiocattoli.getOrDefault(id, 0);
    }

    public Collection<Giocattolo> getTuttiGiocattoli() {
        return giocattoliDisponibili.values();
    }

    public void rimuoviGiocattolo(int id) {
        if (giocattoliDisponibili.containsKey(id)) {
            giocattoliDisponibili.remove(id);
            stockGiocattoli.remove(id);
        }
    }
    
    // Metodo per stampare lo stato attuale dell'inventario
    public void stampaInventario() {
        giocattoliDisponibili.forEach((id, giocattolo) -> {
            int stock = stockGiocattoli.getOrDefault(id, 0);
            System.out.println(giocattolo + ", Quantità disponibile: " + stock);
        });
    }
	
}
