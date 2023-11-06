package gestione;

import java.util.HashMap;
import java.util.Map;

import entities.Giocattolo;

public class Inventario {

	private Map<Integer, Giocattolo> giocattoliDisponibili;

    public Inventario() {
        this.giocattoliDisponibili = new HashMap<>();
    }

    public void aggiungiGiocattolo(Giocattolo giocattolo) {
        giocattoliDisponibili.put(giocattolo.getId(), giocattolo);
    }

    public Giocattolo rimuoviGiocattolo(int id) {
        return giocattoliDisponibili.remove(id);
    }

    public Giocattolo getGiocattolo(int id) {
        return giocattoliDisponibili.get(id);
    }
	
}
