package Lesson03;

import java.util.Map;
import java.util.TreeMap;

public class Phonebook {
    String phone = "";
    String name = "";

    public Phonebook() {
    }

    public Phonebook(String phone, String name) {
        this.phone = phone;
        this.name = name;
    }


    //======================================================================
    Map<String, String> phonebookMap = new TreeMap<>();

    void add(String phone, String name) {
        phonebookMap.put(phone,name);


    }



    void printPhonebook() {
        phonebookMap.forEach((phone, name) ->
                System.out.println(name + " == " + phone)
        );
    }

}
