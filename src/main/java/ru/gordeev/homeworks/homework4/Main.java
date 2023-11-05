package ru.gordeev.homeworks.homework4;

import java.util.Calendar;
import java.util.Date;

public class Main {

    private static final int CURRENT_YEAR = 2023;

    public static void main(String[] args) {
        User[] users = new User[10];

        users[0] = new User("Гордеев", "Валентин", "Русланович",
                new Date(1995, Calendar.DECEMBER, 16), "gordeev@yandex.ru");
        users[1] = new User("Петров", "Алексей", "Владимирович",
                new Date(1974, Calendar.FEBRUARY, 12), "petrov@yandex.ru");
        users[2] = new User("Чижовкин", "Руслан", "Александрович",
                new Date(1956, Calendar.JANUARY, 30), "chizhovkin@yandex.ru");
        users[3] = new User("Селезнев", "Марат", "Исаакиевич",
                new Date(1991, Calendar.JULY, 21), "seleznev@yandex.ru");
        users[4] = new User("Попов", "Денис", "Валентинович",
                new Date(1972, Calendar.OCTOBER, 10), "popov@yandex.ru");
        users[5] = new User("Денисов", "Вячеслав", "Рустамович",
                new Date(1998, Calendar.MARCH, 9), "denisov@yandex.ru");
        users[6] = new User("Исупова", "Юлия", "Викторовна",
                new Date(2001, Calendar.MARCH, 10), "isupova@yandex.ru");
        users[7] = new User("Агеев", "Борис", "Алексеевич",
                new Date(1983, Calendar.JANUARY, 25), "ageev@yandex.ru");
        users[8] = new User("Гайдай", "Александр", "Русланович",
                new Date(2005, Calendar.DECEMBER, 6), "gaidai@yandex.ru");
        users[9] = new User("Чижовкина", "Кира", "Александровна",
                new Date(1995, Calendar.SEPTEMBER, 27), "kira@yandex.ru");

        for (User user : users) {
            if (user.getDateOfBirth().after(new Date(CURRENT_YEAR - 40, Calendar.JANUARY, 1))) {
                user.printInfoAboutUser();
            }
        }

    }
}
