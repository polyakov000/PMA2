import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmartphoneFactory appleFactory = new IphoneFactory();
        SmartphoneFactory samsungFactory = new SumsungFactory();

        while (true) {
            System.out.println("Фабрика смартфонов");
            System.out.println("1. Создать iPhone");
            System.out.println("2. Создать Samsung");
            System.out.println("3. Выход");
            System.out.print("Выберите вариант: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очищаем буфер после nextInt()

            if (choice == 3) break;

            System.out.print("Введите название модели: ");
            String model = scanner.nextLine();

            System.out.print("Введите объем памяти (GB): ");
            int storage = scanner.nextInt();
            scanner.nextLine(); // Очищаем буфер после nextInt()

            switch (choice) {
                case 1:
                    appleFactory.orderSmartphone(model, storage);
                    break;
                case 2:
                    samsungFactory.orderSmartphone(model, storage);
                    break;
                default:
                    System.out.println("Неверный выбор!");
            }
        }

        scanner.close();
        System.out.println("Фабрика закрыта.");
    }
}