import java.util.Scanner;

public class GestioneBAnca {
    private double saldo;
    private int password;
    Scanner scanner= new Scanner(System.in);


    public GestioneBAnca() {
        this.saldo = 0;
        this.password= 1500;
    }

    public int controlloPassword(){
        System.out.println("Immetti la password: ");
        int controllo= scanner.nextInt();
        if (password==controllo){
            System.out.println(true);

        }else if (controllo!= password) {
            System.out.print("Reimmetti la password corretta: ");
            controllo= scanner.nextInt();
        }


        return password;
    }

    public void versamento() {
        System.out.print("Quanto vuoi versare : ");
        double versamento= scanner.nextDouble();
        saldo += versamento;
    }

    public void prelievo() {
        boolean continuaPrelievo = true;
        while (continuaPrelievo) {
            System.out.print("Quanto vuoi prelevare: ");
            double importoPrelievo = scanner.nextDouble();
            if (controlloDisponibilitaPrelievo(importoPrelievo)) {
                saldo -= importoPrelievo;
                System.out.println("Prelievo effettuato con successo.");
            } else {
                System.out.println("Non hai abbastanza fondi per questo prelievo.");
            }
            System.out.print("Vuoi prelevare ancora? (yes/no): ");
            String risposta = scanner.next();
            if (!risposta.equalsIgnoreCase("yes")) {
                continuaPrelievo = false;
            }
        }
    }

    public boolean controlloDisponibilitaPrelievo(double importoPrelievo) {
        return saldo >= importoPrelievo;
    }


    public double getSaldo() {
        return saldo;
    }

}






