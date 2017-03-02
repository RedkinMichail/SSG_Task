import java.util.ArrayList;

public interface IDataBase {
    int getOrderCount();
    void makeOrder(int numberOfGood, int amountGoods, String name);
    void addGood(Good good);
    ArrayList getGoodsList();

    ArrayList getRecomendationGoodsList(Good good);
}
