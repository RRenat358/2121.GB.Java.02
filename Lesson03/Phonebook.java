package Lesson03;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Phonebook {
    String phone = "";
    String name = "";
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
        if (!isNumberIsPhone(phone)) {
            System.out.println("❌ Абонент не записан");//for log
            return;
        }
        if (name == null || name == "null") {
            name = "";
        }
        this.phonebookMap.put(phone, name);
    }

    /*
        String getIsPhone(String phone) {
            Map<String, String> getIsPhoneMap = new LinkedHashMap<>();
            for (Map.Entry<String, String> stringEntry : this.phonebookMap.entrySet()) {
                if (stringEntry.getKey() == phone) {
                    getIsPhoneMap.put(stringEntry.getKey(), stringEntry.getValue());
                }
            }
            getIsPhoneMap.forEach((phone2, name2) ->
                    System.out.println(phone2 + " = " + name2)
            );
            return null;
        }
    */
    void getIsPhone(String phone) {
        if (!isNumberIsPhone(phone)) {
            System.out.println("❌ Введите корректный номер");//for log
            return;
        }
        Map<String, String> getIsPhoneMap = new LinkedHashMap<>();
        for (Map.Entry<String, String> stringEntry : this.phonebookMap.entrySet()) {
            if (stringEntry.getKey() == phone) {
                getIsPhoneMap.put(stringEntry.getKey(), stringEntry.getValue());
            }
        }
        System.out.println("По номеру [ " + phone + " ] нашлось:");
        getIsPhoneMap.forEach((phoneFE, nameFE) ->
                System.out.println(phoneFE + " = " + nameFE)
        );
        return;
    }

    String getIsName(String name) {

        Map<String, String> getIsNameMap = new LinkedHashMap<>();
        for (Map.Entry<String, String> stringEntry : phonebookMap.entrySet()) {
            if (stringEntry.getValue() == name) {
                getIsNameMap.put(stringEntry.getKey(), stringEntry.getValue());
            }
        }
        System.out.println("По имени [ " + name + " ] нашлось:");
        getIsNameMap.forEach((phone2, name2) ->
                System.out.println(phone2 + " = " + name2)
        );
        return null;
    }


    void printPhonebook() {
        phonebookMap.forEach((phone, name) ->
                System.out.println(phone + " = " + name)
        );
    }
    //мини проверка телефона
    public boolean isNumberIsPhone(String phone) {
        if (phone == null || phone.isEmpty() || phone.trim().isEmpty()) {
            phonePrint(phone);
            System.out.println("Не заполнен");//for log
            return false;
        }
        phone = phone.trim();
//        phone = phone.replaceAll("\\s+", "");
        if (phone.indexOf("+") == 0) {
            phone = phone.substring(1);
        }
        if (phone.length() != 11) {
            phonePrint(phone);
            System.out.println("Не корректный, короткий/длинный");//for log
            return false;
        }
        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                phonePrint(phone);
                System.out.println("Допускаются только цифры");//for log
                return false;
            }
        }
        return true;
    }

    void phonePrint(String phone) {
        System.out.println("phone = [ " + phone + " ]");
    }

}
