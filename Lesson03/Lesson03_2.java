package Lesson03;

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

        Phonebook phonebook = new Phonebook();
        phonebook.addPhonebook(phone1, name1);
        phonebook.addPhonebook(phone2, name2);
        phonebook.addPhonebook(phone3, name3);
        phonebook.addPhonebook(phone4, name4);

        System.out.println("––––––––––––––––––––––––––––––");
        System.out.println("Вся телефонная книга");
        phonebook.printPhonebook();

        //======================================================================
        System.out.println("––––––––––––––––––––––––––––––");
        String IsPhone = "6945958";
        System.out.println("По номеру [ " + IsPhone + " ] нашлось:");
        phonebook.getIsPhone(IsPhone);

        //todo ?? IsPhone = "000000000000"
        //todo ?? IsPhone = ""
        //todo ?? IsPhone = null

        System.out.println("––––––––––––––––––––––––––––––");
        String IsName = "Олег";
        System.out.println("По имени [ " + IsName + " ] нашлось:");
        phonebook.getIsName(IsName);

        //todo ?? IsName = "slvinsrajygsb"
        //todo ?? IsName = ""
        //todo ?? IsName = null

        //======================================================================
        System.out.println("––––––––––––––––––––––––––––––");
    }

}



