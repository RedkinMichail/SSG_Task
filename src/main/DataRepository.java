import java.util.ArrayList;

public class DataRepository {
    private final IDataBase dataBase;
    public DataRepository(final IDataBase dataBase) {
        this.dataBase = dataBase;
    }
    public ArrayList getGoodsList() {
        return dataBase.getGoodsList();
    }
    public int getOrderCount() {
        return dataBase.getOrderCount();
    }

    public void addOrder(Order order) {
        dataBase.addOrder(order);
    }

    public void addGood(Good good) {
        dataBase.addGood(good);
    }

    public ArrayList getRecomendationGoodsList(Good good) {
        return dataBase.getRecomendationGoodsList(good);
    }
}
