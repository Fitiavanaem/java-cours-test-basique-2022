import java.util.Scanner;

public class CompteBancaire {
    int numero;
    double solde;
    String proprietaire;
    static CompteBancaire c1;
    static CompteBancaire c2;

    public CompteBancaire(int numero, double solde, String proprietaire) {
        this.numero = numero;
        this.solde = solde;
        this.proprietaire = proprietaire;
    }

    public void depot(double montant) {
        solde += montant;
        System.out.println(proprietaire + " a déposé " + montant);
        System.out.println("Nouveau solde : " + solde);
    }

    public void retrait(double montant) {
        if (solde >= montant) {
            solde -= montant;
            System.out.println(proprietaire + " a retiré " + montant);
            System.out.println("Nouveau solde : " + solde);
        } else {
            System.out.println("Votre solde est insuffisant");
        }
    }

    public static void virer(CompteBancaire envoie, CompteBancaire beneficiaire, double montant) {
        if (envoie.solde >= montant) {
            envoie.solde -= montant;
            beneficiaire.solde += montant;
            System.out.println(envoie.proprietaire + " a viré " + montant + " à " + beneficiaire.proprietaire);
            System.out.println("Nouveau solde de " + envoie.proprietaire + " : " + envoie.solde);
            System.out.println("Nouveau solde de " + beneficiaire.proprietaire + " : " + beneficiaire.solde);
        } else {
            System.out.println("Votre solde est insuffisant pour effectuer le virement");
        }
    }

    public static void main(String[] args) {
        c1 = new CompteBancaire(1, 0, "Fitiavana");
        c2 = new CompteBancaire(2, 0, "Roschtand");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choisissez le compte :");
        System.out.println("1. Fitiavana");
        System.out.println("2. Roschtand");
        int choixCompte = scanner.nextInt();

        switch (choixCompte) {
            case 1:
                effectuerOperation(c1, scanner);
                break;
            case 2:
                effectuerOperation(c2, scanner);
                break;
            default:
                System.out.println("Choix invalide");
                break;
        }
    }

    public static void effectuerOperation(CompteBancaire compte, Scanner scanner) {
        System.out.println("Choisissez une opération :");
        System.out.println("1. Dépôt");
        System.out.println("2. Retrait");
        System.out.println("3. Virement");
        int choixOperation = scanner.nextInt();

        switch (choixOperation) {
            case 1:
                effectuerDepot(compte, scanner);
                break;
            case 2:
                effectuerRetrait(compte, scanner);
                break;
            case 3:
                effectuerVirement(scanner);
                break;
            default:
                System.out.println("Choix invalide");
                break;
        }
    }

    public static void effectuerDepot(CompteBancaire compte, Scanner scanner) {
        System.out.println("Entrez le montant du dépôt : ");
        double montantDepot = scanner.nextDouble();
        compte.depot(montantDepot);
    }

    public static void effectuerRetrait(CompteBancaire compte, Scanner scanner) {
        System.out.println("Entrez le montant du retrait : ");
        double montantRetrait = scanner.nextDouble();
        compte.retrait(montantRetrait);
    }

    public static void effectuerVirement(Scanner scanner) {
        System.out.println("Entrez le montant du virement : ");
        double montantVirement = scanner.nextDouble();

        System.out.println("Choisissez le compte bénéficiaire :");
        System.out.println("1. Fitiavana");
        System.out.println("2. Roschtand");
        int compteBeneficiaireChoice = scanner.nextInt();

        CompteBancaire compteBeneficiaire = (compteBeneficiaireChoice == 1) ? c1 : c2;

        virer(c1, compteBeneficiaire, montantVirement);
    }
}
