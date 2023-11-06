package main;

import entities.Cliente;
import entities.Giocattolo;
import gestione.Inventario;
import gestione.RegistroVendite;
import gestione.RegistroVenditeSemplice;

public class Test {
	
	
	public static void main(String[] args) {
		// Creazione dell'inventario
        Inventario inventario = new Inventario();
        
        // Creazione e aggiunta di giocattoli all'inventario
        Giocattolo orsacchiotto = new Giocattolo(1, "Orsacchiotto", 19.99, 3);
        Giocattolo legoSet = new Giocattolo(2, "LEGO Set", 59.99, 7);
        Giocattolo puzzle = new Giocattolo(3, "Puzzle", 9.99, 4);
        
        inventario.aggiungiGiocattolo(orsacchiotto, 10);
        inventario.aggiungiGiocattolo(legoSet, 5);
        inventario.aggiungiGiocattolo(puzzle, 20);

        // Stampa dell'inventario prima dell'acquisto
        System.out.println("Inventario prima dell'acquisto:");
        inventario.stampaInventario();

        // Creazione del cliente
        Cliente cliente = new Cliente(1L, "Mario Rossi", "indirizzo", "mario.rossi@example.com");

        // Creazione del registro vendite e registrazione di un acquisto
        RegistroVendite registroVendite = new RegistroVenditeSemplice(inventario);
        registroVendite.registraVendita(cliente, orsacchiotto, 1);

        // Stampa dell'inventario dopo l'acquisto
        System.out.println("\nInventario dopo l'acquisto:");
        inventario.stampaInventario();
	}
}
