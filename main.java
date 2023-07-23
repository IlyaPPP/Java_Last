// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
// Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и
// выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры 
// фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class main {
    public static void main(String[] args) {

        Laptop Laptop1 = new Laptop("Acer", "Aspire", 3, 2019, 700, "Windows", 1024, 16, "Red");
        Laptop Laptop2 = new Laptop("Macbook", "Air", 13, 2020, 1000, "MacOS", 256, 8, "Grey");
        Laptop Laptop3 = new Laptop("Lenovo", "IdeaPad", 3, 2022, 650, "Windows", 512, 12, "Blue");
        Laptop Laptop4 = new Laptop("Honor", "Magicbook", 15, 2021, 700, "Windows", 1024, 16, "Grey");
        Laptop Laptop5 = new Laptop("Macbook", "Pro", 16, 2023, 1000, "MacOS", 512, 16, "Grey");
        Laptop Laptop6 = new Laptop("Asus", "Vivobook", 14, 2023, 450, "Windows", 256, 8, "Blue");
        Laptop Laptop7 = new Laptop("MSI", "Modern", 15, 2023, 600, "Windows", 512, 16, "Grey");
        Laptop Laptop8 = new Laptop("MSI", "Titan", 77, 2020, 4800, "Windows", 2056, 32, "Black");

        Map<Integer, String> mapBrand = new TreeMap<>();
        mapBrand.put(0, Laptop1.getBrand());
        mapBrand.put(1, Laptop2.getBrand());
        mapBrand.put(2, Laptop3.getBrand());
        mapBrand.put(3, Laptop4.getBrand());
        mapBrand.put(4, Laptop5.getBrand());
        mapBrand.put(5, Laptop6.getBrand());
        mapBrand.put(6, Laptop7.getBrand());
        mapBrand.put(7, Laptop8.getBrand());

        Map<Integer, Integer> mapYear = new TreeMap<>();
        mapYear.put(0, Laptop1.getYear());
        mapYear.put(1, Laptop2.getYear());
        mapYear.put(2, Laptop3.getYear());
        mapYear.put(3, Laptop4.getYear());
        mapYear.put(4, Laptop5.getYear());
        mapYear.put(5, Laptop6.getYear());
        mapYear.put(6, Laptop7.getYear());
        mapYear.put(7, Laptop8.getYear());

        Map<Integer, Integer> mapPrice = new TreeMap<>();
        mapPrice.put(0, Laptop1.getPrice());
        mapPrice.put(1, Laptop2.getPrice());
        mapPrice.put(2, Laptop3.getPrice());
        mapPrice.put(3, Laptop4.getPrice());
        mapPrice.put(4, Laptop5.getPrice());
        mapPrice.put(5, Laptop6.getPrice());
        mapPrice.put(6, Laptop7.getPrice());
        mapPrice.put(7, Laptop8.getPrice());

        Map<Integer, Integer> mapSSD = new TreeMap<>();
        mapSSD.put(0, Laptop1.getSSD());
        mapSSD.put(1, Laptop2.getSSD());
        mapSSD.put(2, Laptop3.getSSD());
        mapSSD.put(3, Laptop4.getSSD());
        mapSSD.put(4, Laptop5.getSSD());
        mapSSD.put(5, Laptop6.getSSD());
        mapSSD.put(6, Laptop7.getSSD());
        mapSSD.put(7, Laptop8.getSSD());

        Map<Integer, Integer> mapRam = new TreeMap<>();
        mapRam.put(0, Laptop1.getRam());
        mapRam.put(1, Laptop2.getRam());
        mapRam.put(2, Laptop3.getRam());
        mapRam.put(3, Laptop4.getRam());
        mapRam.put(4, Laptop5.getRam());
        mapRam.put(5, Laptop6.getRam());
        mapRam.put(6, Laptop7.getRam());
        mapRam.put(7, Laptop8.getRam());

        Map<Integer, String> mapColor = new TreeMap<>();
        mapColor.put(0, Laptop1.getColor());
        mapColor.put(1, Laptop2.getColor());
        mapColor.put(2, Laptop3.getColor());
        mapColor.put(3, Laptop4.getColor());
        mapColor.put(4, Laptop5.getColor());
        mapColor.put(5, Laptop6.getColor());
        mapColor.put(6, Laptop7.getColor());
        mapColor.put(7, Laptop8.getColor());

        Map<Integer, List<Integer>> Parametres = new TreeMap<>();
        boolean flag = true;

        while (flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите цифру, соответствующую необходимому критерию: ");
            System.out.println("0 - brand");
            System.out.println("1 - year");
            System.out.println("2 - price");
            System.out.println("3 - SSD");
            System.out.println("4 - Ram");
            System.out.println("5 - Color");
            System.out.println("6 - Произвести поиск");
            System.out.println("7 - Выход");
            int enter = scanner.nextInt();
            ArrayList<Integer> indexO = new ArrayList<>();
            switch (enter) {
                case 0: {
                    System.out.println("Введите брэнд");
                    String brand = scanner.next();
                    for (int i = 0; i < mapBrand.size(); i++) {
                        if (mapBrand.get(i).equals(brand)) {
                            indexO.add(i);
                        }
                    }
                    Parametres.put(0, indexO);
                    break;
                }
                case 1: {
                    System.out.println("Введите минимальный год: ");
                    int minYear = scanner.nextInt();
                    for (int i = 0; i < mapYear.size(); i++) {
                        if (mapYear.get(i) >= minYear) {
                            indexO.add(i);
                        }
                    }
                    Parametres.put(1, indexO);
                    break;
                }
                case 2: {
                    System.out.println("Введите минимальную цену: ");
                    int minPrice = scanner.nextInt();
                    for (int i = 0; i < mapPrice.size(); i++) {
                        if (mapPrice.get(i) >= minPrice) {
                            indexO.add(i);
                        }
                    }
                    Parametres.put(2, indexO);
                    break;
                }
                case 3: {
                    System.out.println("Введите минимальный размер SSD-памяти: ");
                    int minSSD = scanner.nextInt();
                    for (int i = 0; i < mapSSD.size(); i++) {
                        if (mapSSD.get(i) >= minSSD) {
                            indexO.add(i);
                        }
                    }
                    Parametres.put(3, indexO);
                    break;
                }
                case 4: {
                    System.out.println("Введите минимальный размер Ram-памяти: ");
                    int minRam = scanner.nextInt();
                    for (int i = 0; i < mapRam.size(); i++) {
                        if (mapRam.get(i) >= minRam) {
                            indexO.add(i);
                        }
                    }
                    Parametres.put(4, indexO);
                    break;
                }
                case 5: {
                    System.out.println("Введите цвет: ");
                    String color = scanner.next();
                    for (int i = 0; i < mapColor.size(); i++) {
                        if (mapColor.get(i).equals(color)) {
                            indexO.add(i);
                        }
                    }
                    Parametres.put(5, indexO);
                    break;
                }
                case 6: {
                    ArrayList<Integer> sortParametres = new ArrayList<>();
                    for (List<Integer> i : Parametres.values()) {
                        sortParametres.addAll(i);
                    }
                    System.out.println(sortParametres);
                    Map<Integer, Integer> frequencyMap = new HashMap<>();
                    for (Integer s : sortParametres) {
                        Integer count = frequencyMap.get(s);
                        if (count == null) {
                            count = 0;
                        }
                        frequencyMap.put(s, count + 1);
                    }
                    int max = 0;
                    List<Integer> Max = new ArrayList<>();
                    for (int j = 0; j < frequencyMap.size(); j++) {
                        try {
                            int f = frequencyMap.get(j);
                            if (f > max) {
                                Max.clear();
                                Max.add(j);
                                max = f;
                            } else if (f == max)
                                Max.add(j);
                        } catch (Exception e) {
                        }
                    }
                    while (!Max.isEmpty()) {
                        switch (Max.get(0)) {
                            case 0:
                                System.out.println(Laptop1.toString());
                                Max.remove(0);
                                break;
                            case 1:
                                System.out.println(Laptop2.toString());
                                Max.remove(0);
                                break;
                            case 2:
                                System.out.println(Laptop3.toString());
                                Max.remove(0);
                                break;
                            case 3:
                                System.out.println(Laptop4.toString());
                                Max.remove(0);
                                break;
                            case 4:
                                System.out.println(Laptop5.toString());
                                Max.remove(0);
                                break;
                            case 5:
                                System.out.println(Laptop6.toString());
                                Max.remove(0);
                                break;
                            case 6:
                                System.out.println(Laptop7.toString());
                                Max.remove(0);
                                break;
                            case 7:
                                System.out.println(Laptop8.toString());
                                Max.remove(0);
                                break;
                            default:
                                break;
                        }
                    }
                    Parametres.clear();
                    break;
                }
                case 7: {
                    flag = false;
                    break;
                }
            }
        }
    }
}