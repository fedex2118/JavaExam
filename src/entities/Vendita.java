package entities;

public class Vendita {

    private Cliente cliente;
    private Giocattolo giocattolo;
    private int quantita;
    private double prezzoTotale;
	
    public Vendita() {
    	
    }
    
    public Vendita(Cliente cliente, Giocattolo giocattolo, int quantita, double prezzoTotale) {
		super();
		this.cliente = cliente;
		this.giocattolo = giocattolo;
		this.quantita = quantita;
		this.prezzoTotale = prezzoTotale;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Giocattolo getGiocattolo() {
		return giocattolo;
	}

	public void setGiocattolo(Giocattolo giocattolo) {
		this.giocattolo = giocattolo;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public double getPrezzoTotale() {
		return prezzoTotale;
	}

	public void setPrezzoTotale(double prezzoTotale) {
		this.prezzoTotale = prezzoTotale;
	}
    
    
    
	
}
