package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeWork3 {
    /**1. Написать метод, который меняет два элемента массива местами (массив может быть любого
     ссылочного типа);
     2. Задача:
     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу
     фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта
     и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую
     коробку с той, которую подадут в compare() в качестве параметра. true – если их массы
     равны, false в противоположном случае. Можно сравнивать коробки с яблоками и
     апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются
     объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
     */
public static void main(String [] args) {
    Box<Apple> appleBox = new Box<>(new ArrayList<>(Arrays.asList(new Apple(), new Apple(), new Apple(), new Apple())));
    Box<Apple> newAppleBox = new Box<>();
    Box<Orange> orangeBox = new Box<>(new ArrayList<>(Arrays.asList(new Orange(), new Orange(), new Orange(), new Orange())));
    Box<Orange> newOrangeBox = new Box<>(new ArrayList<>(Arrays.asList(new Orange(), new Orange())));

    System.out.println("Apple box: " + appleBox);
    System.out.println("New Apple box: " + newAppleBox);
    System.out.println("Orange box: " + orangeBox);
    System.out.println("New Orange box: " + newOrangeBox);
    appleBox.addFruits(new ArrayList<>(Arrays.asList(new Apple(), new Apple())));
    appleBox.toAnotherBox(newAppleBox);
    System.out.println("New Apple box weight; " + newAppleBox.getWeight());
    System.out.println("Orange box weight: " + orangeBox.getWeight());
    newAppleBox.addFruits(new ArrayList<>(Arrays.asList(new Apple(), new Apple())));
    orangeBox.addFruits(new ArrayList<>(Arrays.asList(new Orange(), new Orange())));
    System.out.println("new Apple box weight " + newAppleBox.getWeight());
    System.out.println("Orange box weight: " + orangeBox.getWeight());
    newOrangeBox.toAnotherBox(orangeBox);
    System.out.println("Orange box weight: " + orangeBox.getWeight());
    System.out.println("Apple box: " + appleBox);
    System.out.println("New Apple box: " + newAppleBox);
    System.out.println("Orange box; " + orangeBox);
    System.out.println("New Orange box" + newOrangeBox);

    Integer[] ints = {1, 2, 3, 4, 5};
    Swapper<Integer> integerSwapper = new Swapper<>();
    integerSwapper.swap(ints, 2, 4);

    for (Integer i : ints) {
        System.out.print(i + " ");
    }

    System.out.println();

    Float[] floats = {1.6f, 2.4f, 3.6f, 4.2f, 5.1f};
    Swapper<Float> floatSwapper = new Swapper<>();
    floatSwapper.swap(floats, 0, 2);

    for (Float i : floats) {
        System.out.println(i + "  ");
    }

}
}
