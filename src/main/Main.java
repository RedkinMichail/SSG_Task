import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DataRepository dataBase = new DataRepository(new FakeDataBase());
	    System.out.println("Какой табак предпочитаешь?");
	    System.out.print(dataBase.getGoodsList());
        Scanner input = new Scanner(System.in);
        int numberOfGood = input.nextInt();
        System.out.println();
        System.out.print("Введите ваше имя:");
        String name = input.next();
        System.out.println();
        System.out.print("Введите количество:");
        int amountOfGoods = input.nextInt();
        dataBase.makeOrder(numberOfGood,amountOfGoods,name);
    }
}
