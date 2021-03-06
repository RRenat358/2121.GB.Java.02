package Lesson03;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Phonebook {
    private String phone = "";
    private String name = "";
    Map<String, String> phonebookMap = new TreeMap<>();

    public Phonebook(Map<String, String> phonebookMap) {
        this.phonebookMap = phonebookMap;
    }

    public Phonebook() {
    }

    public Phonebook(String phone, String name) {
        this.phone = phone;
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public String setPhone(String phone) {
        this.phone = phone;
        return this.phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getPhonebookMap() {
        return phonebookMap;
    }

    public void setPhonebookMap(Map<String, String> phonebookMap) {
        this.phonebookMap = phonebookMap;
    }

    //======================================================================
    void addPhonebook(String phone, String name) {
        if (!isNumberIsPhone(phone) || !isStringIsName(name)) {
            System.out.println("❌ Абонент не записан");
            return;
        }
        phone = phone.trim();
        name = name.trim();
        this.phonebookMap.put(phone, name);
    }

    //======================================================================
    void getIsPhone(String phone) {
        if (!isNumberIsPhone(phone)) {
            System.out.println("! Введите корректный номер");
            return;
        }
        phone = phone.trim();
        //TreeMap e.getKey() == уникален → берём первый попавшийся
        for (Map.Entry<String, String> stringEntry : this.phonebookMap.entrySet()) {
            if (stringEntry.getKey() == phone) {
                System.out.println("По номеру [ " + phone + " ] нашлось:");
                System.out.println(stringEntry.getKey() + " = " + stringEntry.getValue());
            }
        }
    }

    void getIsName(String name) {
        if (!isStringIsName(name)) {
            System.out.println("! Введите корректное имя");
            return;
        }
        name = name.trim();
        Map<String, String> nameMap = new LinkedHashMap<>();
        for (Map.Entry<String, String> stringEntry : this.phonebookMap.entrySet()) {
            if (stringEntry.getValue() == name) {
                nameMap.put(stringEntry.getKey(), stringEntry.getValue());
            }
        }
        System.out.println("По имени [ " + name + " ] нашлось:");
        nameMap.forEach((phoneFE, namFE) ->
                System.out.println(phoneFE + " = " + namFE)
        );
    }

    //======================================================================
    void phonebookPrint() {
        System.out.println("Вся телефонная книга");
        System.out.println("- - - - - - - - - - - - - - -");
        phonebookMap.forEach((phone, name) ->
                System.out.println(phone + " = " + name)
        );
    }

    void phonePrint(String phone) {
        System.out.println("phone = [ " + phone + " ]");
    }

    void namePrint(String name) {
        System.out.println("name = [ " + name + " ]");
    }

    //======================================================================
    //QA

    //todo проверка может быть не полной, нужно тз и/или погуглить
    private boolean isNumberIsPhone(String phone) {
        if (phone == null || phone.isEmpty() || phone.trim().isEmpty()) {
            phonePrint(phone);
            System.out.println("Не заполнен");
            return false;
        }
        phone = phone.trim();
//        phone = phone.replaceAll("\\s+", "");
        if (phone.indexOf("+") == 0) {
            phone = phone.substring(1);
        }
        if (phone.length() != 11) {
            phonePrint(phone);
            System.out.println("Не корректный, короткий/длинный");
            return false;
        }
        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                phonePrint(phone);
                System.out.println("Допускаются только цифры");
                return false;
            }
        }
        return true;
    }

    //todo проверка может быть не полной, нужно тз и/или погуглить
    private boolean isStringIsName(String name) {
        if (name == null || name.isEmpty() || name.trim().isEmpty()) {
            namePrint(name);
            System.out.println("Не заполнен");
            return false;
        }
        return true;
    }

}
