package lesson3;

import java.util.*;

public class Phonelist {
    private Map<String, Set<String>> contacts = new HashMap<String, Set<String>>();

    public Map<String, Set<String>> getContacts() {
        return contacts;
    }

    public void add(String name, String phone){
        if(!contacts.containsKey(name)){
            contacts.put(name, new HashSet<String>());
        }
        contacts.get(name).add(phone);

    }

    public void add(String name, String[] phones){
        for (String phone:phones) {
            add(name,phone);
        }

    }

    public void get(String name) {
        if (!(contacts.containsKey(name))){
            System.out.println("Совпадений нет для: " + name);
        } else {
            System.out.println("Имя: " + name + System.lineSeparator() + "Номера: " + contacts.get(name));
        }

    }


}