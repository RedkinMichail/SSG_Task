import java.util.ArrayList;

public interface IDataBase {
    int getOrderCount();
    void addOrder(Order order);
    void addGood(Good good);
    ArrayList getGoodsList();
    ArrayList getRecomendationGoodsList(Good good);
}
