import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        store.addToy(new Toy(1, "Кораблик", 7, 15));
        store.addToy(new Toy(2, "Поезд", 6, 12));
        store.addToy(new Toy(3, "Машинка", 12, 23));
        store.addToy(new Toy(4, "Самолётик", 3, 30));

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Введите команду (read, add, update, play, exit)");

            String choice = scanner.next();

            switch (choice) {
                case "read":
                    System.out.println("Игрушки в магазине:");
                    store.showToys();
                    break;
                case "add":
                    System.out.println("Введите id игрушки");
                    int id = scanner.nextInt();
                    System.out.println("Введите имя игрушки");
                    String name = scanner.next();
                    System.out.println("Введите кол-во игрушек");
                    int quantity = scanner.nextInt();
                    System.out.println("Введите вероятность выпадения игрушки (от 0 до 100)");
                    int probability = scanner.nextInt();
                    store.addToy(new Toy(id, name, quantity, probability));
                    break;
                case "update":
                    System.out.println("Введите id игрушки");
                    int toyId = scanner.nextInt();
                    System.out.println("Введите вероятность выпадения игрушки (от 0 до 100)");
                    int toyProbability = scanner.nextInt();
                    store.updateToyProbability(toyId, toyProbability);
                    break;
                case "play":
                    store.play();
                    break;
                case "exit":
                    running = false;
                    break;
                default:
                    System.out.println("Недопустимая команда");
            }
        }
    }
}
