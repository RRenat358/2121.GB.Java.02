package Lesson03;

import java.util.*;
/*
2 Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и
        телефонных номеров. В этот телефонный справочник с помощью метода add() можно
        добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует
        учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
        тогда при запросе такой фамилии должны выводиться все телефоны. Желательно не добавлять
        лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем
        через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного
        справочника.
*/
public class Lesson03_2 {

    public static void main(String[] args) {
        //======================================================================

        String phone1 = "5826847";
        String name1 = "Олег";

        String phone2 = "4135422";
        String name2 = "Иван";

        String phone3 = "8461535";
        String name3 = "Олег";

        String phone4 = "6945958";
        String name4 = "Артур";

        Phonebook addPerson = new Phonebook();
        addPerson.addPhonebook(phone1, name1);
        addPerson.addPhonebook(phone2, name2);
        addPerson.addPhonebook(phone3, name3);
        addPerson.addPhonebook(phone4, name4);

        System.out.println("––––––––––––––––––––––––––––––");
        System.out.println("Вся телефонная книга");
        addPerson.printPhonebook();

        //======================================================================
        System.out.println("––––––––––––––––––––––––––––––");
        String IsPhone = "6945958";
        System.out.println("По номеру [ " + IsPhone + " ] нашлось:");
        addPerson.getIsPhone(IsPhone);

        System.out.println("––––––––––––––––––––––––––––––");
        String IsName = "Олег";
        System.out.println("По имени [ " + IsName + " ] нашлось:");
        addPerson.getIsName(IsName);

        //======================================================================
        System.out.println("––––––––––––––––––––––––––––––");
    }

}




