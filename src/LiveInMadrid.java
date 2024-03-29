public class LiveInMadrid implements Account {
    private double accountMoney;

    @Override
    public String toPrint()
    {
        return "Zycie jak w Madrycie " + String.format("%,.2f", accountMoney) + " PLN";
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
