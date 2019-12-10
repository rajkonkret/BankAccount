public interface Account {
    void addToAccount(double money);

    void cashOut(double money);

    double accountValue();

    String toPrint();

}
