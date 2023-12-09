package ru.gordeev.homeworks.homework10;

import java.util.*;

public class PhoneBook {

    private Map<String, Set<Long>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String name, Set<Long> phones) {
        phoneBook.put(name, phones);
    }

    public Set<Long> find(String name) {
        if (phoneBook.get(name) != null)
            return phoneBook.get(name);
        else
            throw new NullPointerException("There is no stored phones with this name");
    }

    public boolean containsPhoneNumber(Long phone) {
        for (var phs : phoneBook.values()) {
            if (phs.contains(phone))
                return true;

        }
        return false;
    }

}
