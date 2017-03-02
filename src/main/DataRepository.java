public class DataRepository {
    private final IDataBase dataBase;
    public DataRepository(final IDataBase dataBase) {
        this.dataBase = dataBase;
    }
    public String getGoodsList() {
        return dataBase.getGoodsList();
    }
    public void makeOrder(int numberOfGood, int amountGoods, String name) {
        dataBase.makeOrder(numberOfGood, amountGoods, name);
    }
    public int getOrderCount() {
        return dataBase.getOrderCount();
    }

    public void makeOrder(Order order) {
        makeOrder(order.getNumberOfGood(), order.getAmountOfGoods(), order.getNameOfBuyer());
    }

    public void addGood(String nameOfGood) {
        dataBase.addGood(nameOfGood);
    }
}
