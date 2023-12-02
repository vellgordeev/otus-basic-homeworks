package ru.gordeev.homeworks.homework10;

import java.util.*;

public class PhoneBook {

    private Map<String, Long> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String name, long phone) {
        phoneBook.put(name, phone);
    }

    public List<Long> find(String name) {
        List<Long> phones = new ArrayList<>();

        for (Map.Entry<String, Long> entry : phoneBook.entrySet()) {
            if (entry.getKey().equals(name)) {
                phones.add(entry.getValue());
            }

        }

        return phones;
    }

    public boolean containsPhoneNumber(Long phone) {
        for (Long ph : phoneBook.values()) {
            if (phone.equals(ph)) {
                return true;
            }
        }
        return false;
    }

}
