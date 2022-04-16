package Lesson03;

import java.sql.Array;
import java.util.*;

/*
1 Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и
        вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        Посчитать, сколько раз встречается каждое слово.
2 Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и
        телефонных номеров. В этот телефонный справочник с помощью метода add() можно
        добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует
        учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
        тогда при запросе такой фамилии должны выводиться все телефоны. Желательно не добавлять
        лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем
        через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного
        справочника.
*/
public class Lesson03 {

    public static void main(String[] args) {
        //======================================================================
        System.out.println("––––––––––––––––––––––––––––––");
        String[] array01 = new String[]{
/*
                "a-1",
                "a-2",
                "a-3", "a-3", "a-3",
                "a-4",
                "a-5",
                "a-6",
                "a-7", "a-7",
                "a-8",
                "a-9",
                "a-10", "a-10", "a-10", "a-10"
        };
*/
                "Арбуз",
                "Дыня",
                "Яблоко", "Яблоко", "Яблоко",
                "Груша",
                "Вишня",
                "Киви",
                "Малина", "Малина",
                "Персик",
                "Абрикос",
                "Мандарин", "Мандарин", "Мандарин", "Мандарин"
        };
        System.out.println(array01.length + " = элементов всего");
        System.out.println(Arrays.toString(array01));

        //======================================================================
        System.out.println("––––––––––––––––––––––––––––––");
        Set<String> array01LinkedHashSet = new LinkedHashSet<>(); //уникальные
        array01LinkedHashSet.addAll(Arrays.asList(array01));
//        for (String arr : array01) {
//            setArray01.add(arr);
//        }
        System.out.println(array01LinkedHashSet.size() + " = уникальных");
        System.out.println(array01LinkedHashSet);

        //======================================================================
        System.out.println("––––––––––––––––––––––––––––––");
        //наличие в массиве
        String checkIsElement = "Укроп";
        System.out.println("Элемент [ " + checkIsElement + " ] в массиве? == " +
                array01LinkedHashSet.contains(checkIsElement));

        //======================================================================
        System.out.println("––––––––––––––––––––––––––––––");
        // Количество каждого элемента в массиве
        Map<String, Integer> treeMapCountIsElement = new TreeMap<>();
        for (int i = 0; i < array01.length; i++) {
            if (!treeMapCountIsElement.containsKey(array01[i])){
                treeMapCountIsElement.put(array01[i],1);
            } else {
                treeMapCountIsElement.replace(array01[i],
                        treeMapCountIsElement.get(array01[i]),
                        treeMapCountIsElement.get(array01[i])+1
                );
            }
        }
//        treeMapCountIsElement.forEach((key, value) -> System.out.println(key + " " + value));
        for (Map.Entry<String, Integer> entry : treeMapCountIsElement.entrySet()) {
            System.out.println(entry.getKey() + "  =  " + entry.getValue());
        }

        //======================================================================
        System.out.println("––––––––––––––––––––––––––––––");
    }

}
