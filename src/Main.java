/**
 * Implemento programma:
 * introduci metodo boolean per controllo password, restituisce true se la password inserita corrisponde
 * a quella del conto.
 * Altro metodo boolean per controllo prelievo che restituisce true se l'importo inserito è disponibile.
 */

public class Main {
    public static void main(String[] args) {
        GestioneBAnca conto = new GestioneBAnca();

        conto.versamento();
        conto.prelievo();
        conto.controlloPassword();


        System.out.println("Saldo rimanente: " + conto.getSaldo());
    }
}