public class DataBase {
    private final IDataBase dataBase;
    public DataBase(final IDataBase dataBase) {
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
}
