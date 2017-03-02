import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DataRepositoryTests {
    DataRepository dataRepository;
    public void createDataRepository() {
        dataRepository = new DataRepository(new FakeDataBase());
        dataRepository.addGood("Наша марка");
        dataRepository.addGood("Red Apple");
        dataRepository.addGood("Прима");
    }

    @Test
    public void whenCreateNewDataReposytoryAndGetGoodsList_ResultShouldBeEmptyString() {
        DataRepository dataRepository = new DataRepository(new FakeDataBase());

        String result = dataRepository.getGoodsList();

        assertEquals("", result);
    }

    @Test
    public void whenCreateNewDataReposytoryAddGoodAndGetGoodsList_ResultShouldBeThatGood() {
        DataRepository dataRepository = new DataRepository(new FakeDataBase());
        dataRepository.addGood("Наша марка");

        String result = dataRepository.getGoodsList();

        assertEquals("1. Наша марка\n", result);
    }

    @Test
    public void whenGetOrderList_ResultShouldBeOrderList() {
        createDataRepository();

        String result = dataRepository.getGoodsList();

        assertEquals("1. Наша марка\n" +
                "2. Red Apple\n" +
                "3. Прима\n", result);
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
}
