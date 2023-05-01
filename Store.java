import java.util.*;
public class Store {
    public static void main(String[] args) {
        NoteBook notebook1 = new NoteBook("Dell", "Vostro 3510", 8, 256, "Windows", "Черный", 699);
        NoteBook notebook2 = new NoteBook("HP", "Pavilion 14", 4, 128, "Windows", "Серый", 499);
        NoteBook notebook3 = new NoteBook("Lenovo", "ThinkPad T580", 16, 512, "Windows", "Черный", 1499);
        NoteBook notebook4 = new NoteBook("Apple", "MacBook M1", 8, 256, "macOS", "Серый", 999);
        NoteBook notebook5 = new NoteBook("Asus", "VivoBook Go 14", 8, 512, "Linux", "Зеленый", 899);

        Set<NoteBook> notebooks = new HashSet<>();
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите критерий фильтрации:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем жесткого диска");
        System.out.println("3 - Цена");
        int filterCriteria = sc.nextInt();
        
        System.out.println("Введите минимальное значение для выбранного критерия:");
        int minValue = sc.nextInt();
        
        Set<NoteBook> filteredNotebooks = new HashSet<>();
        for (NoteBook notebook : notebooks) {
            switch (filterCriteria) {
                case 1:
                    if (notebook.getRamSize() >= minValue) {
                        filteredNotebooks.add(notebook);
                    }
                    break;
                case 2:
                    if (notebook.getHddSize() >= minValue) {
                        filteredNotebooks.add(notebook);
                    }
                    break;
                case 3:
                    if (notebook.getPrice() >= minValue) {
                        filteredNotebooks.add(notebook);
                    }
                    break;
                default:
                    System.out.println("Некорректный критерий фильтрации");
            }
        }
        
        if (filteredNotebooks.isEmpty()) {
            System.out.println("Ноутбуки не найдены по заданным критериям");
        } else {
            System.out.println("Найдены следующие ноутбуки:");
            for (NoteBook notebook : filteredNotebooks) {
                notebook.display();
                System.out.println();
            }
        }
        sc.close();
    }
}
    
