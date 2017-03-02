import java.util.ArrayList;

public class FakeDataBase implements IDataBase {
    ArrayList goodsList;
    ArrayList orderList;
    public FakeDataBase() {
        goodsList = new ArrayList();
        orderList = new ArrayList();
    }
    @Override
    public void addGood(Good good) {
        goodsList.add(good);
    }
    @Override
    public ArrayList getGoodsList() {
        return (ArrayList)goodsList.clone();
    }

    @Override
    public ArrayList getRecomendationGoodsList(Good good) {
        ArrayList result = new ArrayList();
        for (Object tmp : goodsList) {
            if ((good.isRelatedGood((Good)tmp))) {
                result.add(tmp);
            }
        }
        return result;
    }

    @Override
    public int getOrderCount() {
        return orderList.size();
    }

    @Override
    public void makeOrder(int numberOfGood, int amountGoods, String name) {
        if (numberOfGood > 0 && numberOfGood < goodsList.size()) {
            orderList.add(name + " "+ goodsList.get(numberOfGood) + " " + amountGoods);
        }
    }
}
