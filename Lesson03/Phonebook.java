package Lesson03;

import java.util.LinkedHashMap;
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

    //todo add get/set() and add all methods


    //======================================================================
    Map<String, String> phonebookMap = new TreeMap<>();

    void addPhonebook(String phone, String name) {
        phonebookMap.put(phone, name);


    }

    String getIsPhone(String phone) {
        Map<String, String> getIsPhoneMap = new LinkedHashMap<>();
        for (Map.Entry<String, String> stringEntry : phonebookMap.entrySet()) {
            if (stringEntry.getKey() == phone) {
                getIsPhoneMap.put(stringEntry.getKey(), stringEntry.getValue());
            }
        }
        getIsPhoneMap.forEach((phone2, name2) ->
                System.out.println(phone2 + " == " + name2)
        );
        return null;
    }

    String getIsName(String name) {
        Map<String, String> getIsNameMap = new LinkedHashMap<>();
        for (Map.Entry<String, String> stringEntry : phonebookMap.entrySet()) {
            if (stringEntry.getValue() == name) {
                getIsNameMap.put(stringEntry.getKey(), stringEntry.getValue());
            }
        }
        getIsNameMap.forEach((phone2, name2) ->
                System.out.println(phone2 + " == " + name2)
        );
        return null;
    }

    void printPhonebook() {
        phonebookMap.forEach((phone, name) ->
                System.out.println(phone + " == " + name)
        );
    }

}
