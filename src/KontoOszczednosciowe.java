public class KontoOszczednosciowe implements Konto {
    private double moneyInBank;

    @Override
    public void addToAccount(double money) {
        this.moneyInBank = this.moneyInBank + money*1.05;
    }

    @Override
    public void cashOut(double money) {
        this.moneyInBank = this.moneyInBank - money*1.1;
    }

    @Override
    public double accountValue() {
        return moneyInBank;
    }

    @Override
    public String toPrint() {
        return null;
    }
}
