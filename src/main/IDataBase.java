public interface IDataBase {
    String getGoodsList();
    int getOrderCount();
    void makeOrder(int numberOfGood, int amountGoods, String name);
    void addGood(String nameOfGood);
}
