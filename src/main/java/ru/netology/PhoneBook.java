package ru.netology;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class PhoneBook {
    public Map<String, String> contactsByName;
    public Map<String, String> contactsByNumber;
    public SortedSet<String> allNames;

    public PhoneBook() {
        contactsByName = new HashMap<>();
        contactsByNumber = new HashMap<>();
        allNames = new TreeSet<>();
    }

    public int add(String name, String number) {
        if (!contactsByName.containsKey(name)) {//проверяем наличие имени в книгеAdd commentMore actions
            contactsByName.put(name, number);//если нет добавляем в мапу в качестве ключа выступает имя
            contactsByNumber.put(number, name);//в эту мапу добавляем в качестве ключа выступает номер
            allNames.add(name);//добавляем контакт в коллекцию
            return contactsByName.size();//возвращается количество контактов
        } else {
            return -1; // если имя существует, то возвращается -1 контакт не добавлен
        }
    }
}
