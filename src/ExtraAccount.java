public class ExtraAccount implements Account {
    private double accountValue;
    private int countToFive;

    public ExtraAccount() {
        this.countToFive = 0;
    }


    @Override
    public void addToAccount(double money) {
        this.accountValue = this.accountValue + money;
        countToFive++;
        if (countToFive == 5) {
            this.accountValue = this.accountValue + 50;
            countToFive = 0;
        }

    }

    @Override
    public void cashOut(double money) {
        this.accountValue = this.accountValue - money * 1.05;

    }

    @Override
    public double accountValue() {
        return accountValue;
    }

    @Override
    public String toPrint() {
        return "SuperKasa " + String.format("%,.2f", accountValue) + " PLN";
    }
}
