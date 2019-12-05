public class ZycieJakWMadrycie implements Konto {
    private double accountMoney;

    @Override
    public String toPrint() {
        return "Zycie jak w Madrycie " + String.format("%,.2f", accountMoney);
    }

    @Override
    public void addToAccount(double money) {
        this.accountMoney = this.accountMoney + money;
    }

    @Override
    public void cashOut(double money) {
        this.accountMoney = this.accountMoney - money;
    }

    @Override
    public double accountValue() {
        return accountMoney;
    }
}
