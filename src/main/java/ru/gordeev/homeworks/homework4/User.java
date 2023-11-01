package ru.gordeev.homeworks.homework4;

import java.util.Date;


public class User {

    private String surname;
    private String name;
    private String patronymic;
    private Date dateOfBirth;
    private String email;

    public User(String surname, String name, String patronymic, Date dateOfBirth, String email) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printInfoAboutUser() {
        System.out.println("ФИО: " + surname + " " + name + " " + patronymic + "\n"
                + "Год рождения: " + dateOfBirth.getYear() + "\n"
                + "email: " + email
        );
    }
}
