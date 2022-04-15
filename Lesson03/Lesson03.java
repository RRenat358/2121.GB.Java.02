package Lesson03;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

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
        String[] array01 = new String[]{
                "a-1", "a-2", "a-3", "a-4", "a-5", "a-6", "a-7", "a-8", "a-9", "a-10", "a-10", "a-10", "a-10"
        };
        System.out.println("––––––––––––––––––––––––––––––");
        System.out.println(array01.length + " = элементов");
        System.out.println(Arrays.toString(array01));
        System.out.println("––––––––––––––––––––––––––––––");
        Set<String> array01LinkedHashSet = new LinkedHashSet<>(); //уникальные
        array01LinkedHashSet.addAll(Arrays.asList(array01));
//        for (String arr : array01) {
//            setArray01.add(arr);
//        }
        System.out.println(array01LinkedHashSet.size() + " = уникальные");
        System.out.println(array01LinkedHashSet);

        System.out.println("––––––––––––––––––––––––––––––");
        //наличие в массиве
        System.out.println(array01LinkedHashSet.contains("a-0"));

        System.out.println("––––––––––––––––––––––––––––––");
        Set<String> array01LinkedHashSet02 = new LinkedHashSet<>();
        int count = 0;
        for(int i = 0; i<array01.length; i++) {
            if(array01LinkedHashSet02.add(array01[i])) {
                count++;
                System.out.println("Index :: "+i+" Element :: "+array01[i]);
            }
        }
        System.out.println("count = " + count);


        //======================================================================



    }






}
