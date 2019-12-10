public class Run {
    public static void main(String[] args) {
        makeBankOperation(Initialization());
    }

    private static void makeBankOperation(Account... accountsArray) {
        for (int i = 0; i < 10; i++) {

            for (Account account : accountsArray) {
                System.out.println("Stan: " + String.format("%,.2f", account.accountValue()));
                System.out.println("wpłacam 100,00");
                account.addToAccount(100);
                System.out.println("Stan: " + String.format("%,.2f", account.accountValue()));
                System.out.println("wypłacam 50,00");
                account.cashOut(50);
                System.out.println("Stan: " + String.format("%,.2f", account.accountValue()));

            }
        }
        for (Account konto : accountsArray) {
            System.out.println("Na koniec mam: " + konto.toPrint());
        }
    }

    private static Account[] Initialization() {

        SuperCash superKasa = new SuperCash(2);
        LiveInMadrid zycieJakWMadrycie = new LiveInMadrid();
        SaverAccount kontoOszczednosciowe = new SaverAccount();
        ExtraAccount extraKonto = new ExtraAccount();
        return new Account[]{superKasa, zycieJakWMadrycie, kontoOszczednosciowe, extraKonto};
    }
}
