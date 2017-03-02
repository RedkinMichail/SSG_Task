public class Order {
    int numberOfGood;
    int amountOfGoods;
    String nameOfBuyer;
    public Order(int numberOfGood, int amountOfGoods, String nameOfBuyer) {
        this.numberOfGood = numberOfGood;
        this.amountOfGoods = amountOfGoods;
        this.nameOfBuyer = nameOfBuyer;
    }

    public String getNameOfBuyer() {
        return nameOfBuyer;
    }

    public int getNumberOfGood() {
        return numberOfGood;
    }

    public int getAmountOfGoods() {
        return amountOfGoods;
    }
}
