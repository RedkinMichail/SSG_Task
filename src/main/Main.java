import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static DataRepository dataRepository;

    static void initializeDataRepository() {
        dataRepository = new DataRepository(new FakeDataBase());
        dataRepository.addGood(new Good("Наша марка","Табак"));
        dataRepository.addGood(new Good("Red Apple","Табак"));
        dataRepository.addGood(new Good("Прима","Табак"));
        dataRepository.addGood(new Good("Беговые кроссовки","Спорт","Бег"));
    }

    static void printGoodsList(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(i +". " +((Good)list.get(i)).nameOfGood + "\n");
        }
        System.out.println();
    }

    static void createOrder(ArrayList goodsList) {
        Scanner input = new Scanner(System.in);
        int numberOfGood = input.nextInt();
        if (numberOfGood < 0 || numberOfGood >= goodsList.size()) {
            System.out.println("Указан некоректный номер товара");
            return;
        }
        System.out.println();
        System.out.print("Введите ваше имя:");
        String name = input.next();
        System.out.println();
        System.out.print("Введите количество:");
        int amountOfGoods = input.nextInt();
        Order order = new Order((Good) goodsList.get(numberOfGood),amountOfGoods,name);
        dataRepository.addOrder(order);
        ArrayList recomendationGoodsList = dataRepository.getRecomendationGoodsList(order.getGood());
        if (recomendationGoodsList.size() != 0) {
            System.out.println("Возможно вас заинтересуют другие наши товары:");
            printGoodsList(recomendationGoodsList);
            numberOfGood = input.nextInt();
            if (numberOfGood < 0 || numberOfGood >= goodsList.size()) {
                System.out.println("Указан некоректный номер товара");
                return;
            }
            System.out.print("Введите количество:");
            amountOfGoods = input.nextInt();
            order = new Order((Good) recomendationGoodsList.get(numberOfGood), amountOfGoods, name);
            dataRepository.addOrder(order);
        }
    }

    public static void main(String[] args) {
        initializeDataRepository();
	    System.out.println("Здраствуйте, у нас вы можете заказать следующий товар:");
        ArrayList goodsList = dataRepository.getGoodsList();
        printGoodsList(goodsList);
        createOrder(goodsList);
    }
}
