public class Run {
    public static void main(String[] args) {
        SuperKasa superKasa = new SuperKasa(2);
        ZycieJakWMadrycie zycieJakWMadrycie = new ZycieJakWMadrycie();

        //Konto[] konto = {superKasa, zycieJakWMadrycie};
        makeBankOperation(superKasa, zycieJakWMadrycie);
    }

    private static void makeBankOperation(Konto... accountsArray) {
        for (int i = 0; i < 10; i++) {

            for (Konto account : accountsArray) {
                System.out.println("Stan: " + String.format("%,.2f", account.accountValue()));
                System.out.println("wpłacam 1000,00");
                account.addToAccount(100);
                System.out.println("Stan: " + String.format("%,.2f", account.accountValue()));
                System.out.println("wypłacam 50,00");
                account.cashOut(50);
                System.out.println("Stan: " + String.format("%,.2f", account.accountValue()));

            }
        }
        for (Konto konto : accountsArray) {
            System.out.println("Na koniec mam: " + konto.toPrint());
        }
    }
}
