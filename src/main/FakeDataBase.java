import java.util.ArrayList;

public class FakeDataBase implements IDataBase {
    ArrayList goodsList;
    ArrayList orderList;
    public FakeDataBase() {
        goodsList = new ArrayList();
        orderList = new ArrayList();
    }
    @Override
    public void addGood(String nameOfGood) {
        goodsList.add(nameOfGood);
    }
    @Override
    public String getGoodsList() {
        String result = "";
        for (int i = 0; i < goodsList.size(); i++) {
            result += String.valueOf(i + 1) + ". " + goodsList.get(i) + "\n";
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
