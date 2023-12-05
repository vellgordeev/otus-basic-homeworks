package ru.gordeev.homeworks.homework10;

import java.util.*;

public class PhoneBook {

    private Map<String, List<Long>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String name, List<Long> phones) {
        phoneBook.put(name, phones);
    }

    public List<Long> find(String name) {
        if (phoneBook.get(name) != null)
            return phoneBook.get(name);
        else
            throw new NullPointerException("There is no stored phones with this name");
    }

    public boolean containsPhoneNumber(Long phone) {
        for (List<Long> phs : phoneBook.values()) {
            if (phs.contains(phone))
                return true;

        }
        return false;
    }

}
