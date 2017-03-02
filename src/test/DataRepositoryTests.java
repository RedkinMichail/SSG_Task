import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DataRepositoryTests {
    DataRepository dataRepository;
    public void createDataRepository() {
        dataRepository = new DataRepository(new FakeDataBase());
        dataRepository.addGood(new Good("Наша марка","Табак"));
        dataRepository.addGood(new Good("Red Apple","Табак"));
        dataRepository.addGood(new Good("Прима","Табак"));
        dataRepository.addGood(new Good("Беговые кроссовки","Спорт"));

    }

    @Test
    public void whenCreateNewDataReposytoryAndGetGoodsList_ResultShouldBeEmptyString() {
        DataRepository dataRepository = new DataRepository(new FakeDataBase());

        ArrayList result = dataRepository.getGoodsList();

        assertEquals(0, result.size());
    }

    @Test
    public void whenCreateNewDataReposytoryAddGoodAndGetGoodsList_ResultShouldBeThatGood() {
        DataRepository dataRepository = new DataRepository(new FakeDataBase());
        Good good = new Good("Наша марка");
        dataRepository.addGood(good);

        ArrayList goodsList = dataRepository.getGoodsList();
        Good result = (Good)goodsList.get(0);

        assertEquals(good, result);
    }

    @Test
    public void whenMakeOrderAndGetOrderCount_ResultShouldBe_1() {
        createDataRepository();
        dataRepository.makeOrder(1,3,"Vasya");

        int result = dataRepository.getOrderCount();

        assertEquals(1, result);
    }

    @Test
    public void dataRepositoryShouldNot_CreateOrder_WhenUserEnterNotValidGoodId(){
        createDataRepository();
        Order order = new Order(-1, 10, "Vasya");

        dataRepository.makeOrder(order);

        assertEquals(0,dataRepository.getOrderCount());
    }

    @Test
    public void whenGetRecommendationGoodsListAndGetHimSize_ResultShouldBe_2() {
        createDataRepository();
        Good good = new Good("Наша марка","Табак");

        ArrayList recommendations = dataRepository.getRecomendationGoodsList(good);

        assertEquals(2, recommendations.size());
    }
}
