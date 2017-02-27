import java.util.ArrayList;

/**
 * Created by Михаил on 27.02.2017.
 */
public class FakeDataBase implements IDataBase {
    ArrayList goodsList;
    public FakeDataBase() {
        goodsList = new ArrayList();
        goodsList.add("1. Наша марка");
        goodsList.add("2. Red Apple");
        goodsList.add("3. Прима");
    }
    @Override
    public String getGoodsList() {
        String result = "";
        for (int i = 0; i < goodsList.size(); i++) {
            result += goodsList.get(i) + "\n";
        }
        return result;
    }
}
