public class SuperCash implements Account {
    private double accountMoney;
    private int chargeAdd;
    private int chargeOut;

    public SuperCash(int chargeAdd) {

        this.chargeAdd = chargeAdd;
    }

    @Override
    public String toPrint() {
        return "SuperKasa " + String.format("%,.2f", accountMoney) + " PLN";
    }

    @Override
    public void addToAccount(double money) {
        this.accountMoney = this.accountMoney + money * (100.0 - chargeAdd) / 100.0;

    }

    @Override
    public void cashOut(double money) {
        this.accountMoney = this.accountMoney - money - 1.0;

    }

    @Override
    public double accountValue(){
    return accountMoney;
    }
}
