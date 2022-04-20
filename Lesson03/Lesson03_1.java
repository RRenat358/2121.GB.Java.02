package Lesson03;

import java.util.*;

/*
1 Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и
        вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        Посчитать, сколько раз встречается каждое слово.
*/
public class Lesson03_1 {

    public static void main(String[] args) {
        //======================================================================
        System.out.println("––––––––––––––––––––––––––––––");
        String[] arrayFruit = new String[]{
                "Апельсин",
                "Слива",
                "Яблоко", "Яблоко", "Яблоко",
                "Груша",
                "Вишня",
                "Киви",
                "Малина", "Малина",
                "Персик",
                "Абрикос",
                "Мандарин", "Мандарин", "Мандарин", "Мандарин"
        };
        System.out.println(arrayFruit.length + " = элементов всего");
        System.out.println(Arrays.toString(arrayFruit));

        //======================================================================
        System.out.println("––––––––––––––––––––––––––––––");
        Set<String> arrayFruitLinkedHashSet = new LinkedHashSet<>(); //уникальные
        arrayFruitLinkedHashSet.addAll(Arrays.asList(arrayFruit));

        System.out.println(arrayFruitLinkedHashSet.size() + " = уникальных");
        System.out.println(arrayFruitLinkedHashSet);

        //======================================================================
        System.out.println("––––––––––––––––––––––––––––––");
        //Наличие в массиве
        String checkIsElement = "Укроп";
        System.out.println("Элемент [ " + checkIsElement + " ] в массиве? == " +
                arrayFruitLinkedHashSet.contains(checkIsElement));

        //======================================================================
        System.out.println("––––––––––––––––––––––––––––––");
        //Количество каждого элемента в массиве
        Map<String, Integer> mapCountIsElement = new TreeMap<>();
        for (int i = 0; i < arrayFruit.length; i++) {
            if (!mapCountIsElement.containsKey(arrayFruit[i])) {
                mapCountIsElement.put(arrayFruit[i], 1);
            } else {
                mapCountIsElement.replace(arrayFruit[i],
                        mapCountIsElement.get(arrayFruit[i]),
                        mapCountIsElement.get(arrayFruit[i]) + 1
                );
            }
        }
        for (Map.Entry<String, Integer> entry : mapCountIsElement.entrySet()) {
            System.out.println(entry.getKey() + "  =  " + entry.getValue());
        }

        //======================================================================
        System.out.println("––––––––––––––––––––––––––––––");
    }

}
