public class Order {
    Good good;
    int amountOfGoods;
    String nameOfBuyer;
    public Order(Good good, int amountOfGoods, String nameOfBuyer) {
        this.good = good;
        this.amountOfGoods = amountOfGoods;
        this.nameOfBuyer = nameOfBuyer;
    }

    public String getNameOfBuyer() {
        return nameOfBuyer;
    }

    public Good getGood() {
        return good;
    }

    public int getAmountOfGoods() {
        return amountOfGoods;
    }
}
