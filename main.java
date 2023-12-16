import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        VendingMachine apparat = new VendingMachine();
        function(apparat);

    }
    public static void function(VendingMachine apparat){
        Scanner scan = new Scanner(System.in);
        System.out.println("выберите действие");
        System.out.println("1 - добавить игрушку");
        System.out.println("2 - запустить работу автомата");
        System.out.println("3 - выход");
        int result = scan.nextInt();
        switch (result) {
            case 1:
                Scanner scann = new Scanner(System.in);
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите название игрушки: ");
                String name = scanner.nextLine();
                System.out.println("Введите id игрушки: ");
                int id = scann.nextInt();
                System.out.println("Введите вес игрушки: ");
                int howMuch = scann.nextInt();
                put(apparat, name, id, howMuch);
                function(apparat);
            break;
        
            case 2:
                Get(apparat);
            break;

            case 3:
                System.out.println("Игра окончена. До свидания");
            break;

            default:
                System.out.println("Вы ввели некорректное значение");
            break;
        }
    }

    public static void put(VendingMachine apparat, String name, int id, int howMuch){
        for (int i = 0; i < howMuch; i++) {
            apparat.addToy(new Toy(id, howMuch, name));
        }
    }

    public static void Get(VendingMachine apparat){
        System.out.println();
        Random rand = new Random();
        System.out.println("Ваш выигрыш: ");
        for (int i = 0; i < 10; i++) {
            int symbol = rand.nextInt(0, apparat.getSize());
            System.out.println((apparat.getToy()).get(symbol));

            String thisId = Integer.toString((apparat.getToy()).get(symbol).getId());
            String thisHowMuch = Integer.toString((apparat.getToy()).get(symbol).getHowMuch());

            try (FileWriter fileWriter = new FileWriter("YourToys", true)){
                fileWriter.write("id: ");
                fileWriter.write(thisId);
                fileWriter.write(", игрушка: ");
                fileWriter.write((apparat.getToy()).get(symbol).getName());
                fileWriter.write(", частота выпадения: ");
                fileWriter.write(thisHowMuch);
                fileWriter.write("\n");
                fileWriter.flush();
            } catch (Exception e) {
                System.out.println("ошибка записи");
            }
        }
        System.out.println();
        function(apparat);
    }
}
 


