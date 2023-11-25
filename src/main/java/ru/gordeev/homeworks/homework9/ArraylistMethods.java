package ru.gordeev.homeworks.homework9;

import java.util.*;

public class ArraylistMethods {

    public static void main(String[] args) {
        ArrayList<Integer> sequentialList = createSequentialList(1, 10);
        System.out.println(sequentialList);

        incrementAllElementsByNumber(sequentialList, 1);
        System.out.println(sequentialList);

    }

    /*
        Реализуйте метод, принимающий в качестве аргументов числа min и max, и возвращающий ArrayList с
        набором последовательных значений в указанном диапазоне (min и max включительно, шаг - 1);
     */
    public static ArrayList<Integer> createSequentialList(int min, int max) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = min; i <= max; i++) {
            arrayList.add(i);
        }

        return arrayList;
    }

    /*
        Реализуйте метод, принимающий в качестве аргумента список целых чисел, суммирующий все элементы,
        значение которых больше 5, и возвращающий сумму;
     */
    public static int sumOfElementsGreaterThanFive(List<Integer> list) {
        int sum = 0;

        for (Integer x : list) {
            if (x > 5) {
                sum += x;
            }
        }

        return sum;
    }

    /*
        Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
        метод должен переписать каждую заполненную ячейку списка указанным числом;
     */
    public static void replaceAllElementsWithNumber(List<Integer> list, int number) {
        /*
            можно циклом for, можно через listIterator();
         */

        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.set(number);
        }
    }

    /*
        Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
        увеличивающий каждый элемент списка на указанное число;
    */
    public static void incrementAllElementsByNumber(List<Integer> list, int number) {
         /*
            можно циклом for, можно через listIterator();

            for (int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i) + number);
            }
         */

        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            iterator.set(iterator.next() + number);
        }
    }

    /*
        Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий список их имен;
    */
    public static List<String> extractEmployeeNames(List<Employee> list) {
        List<String> listOfNames = new ArrayList<>();

        for (Employee employee : list) {
            listOfNames.add(employee.getName());
        }

        return listOfNames;
    }

    /*
        Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный возраст, и
        возвращающий список сотрудников, возраст которых больше либо равен указанному аргументу;
    */
    public static List<Employee> filterEmployeesByMinimumAge(List<Employee> list, int minAge) {
        List<Employee> listOfEmployees = new ArrayList<>();

        for (Employee employee : list) {
            if (employee.getAge() >= minAge) {
                listOfEmployees.add(employee);
            }
        }

        return listOfEmployees;
    }

    /*
        Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный средний возраст,
        и проверяющий что средний возраст сотрудников превышает указанный аргумент;
    */
    public static boolean checkAverageAgeExceeds(List<Employee> list, double minAvgAge) {
        double avgAge = 0;

        for (Employee employee : list) {
            avgAge += employee.getAge();
        }

        avgAge = avgAge / list.size();
        return avgAge > minAvgAge;
    }

    /*
        Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий ссылку на самого молодого сотрудника.
    */
    public static Employee findYoungestEmployee(List<Employee> list) {
        Employee youngestEmployee = list.get(0);

        for (Employee employee : list) {
            if (employee.getAge() < youngestEmployee.getAge()) {
                youngestEmployee = employee;
            }
        }

        return youngestEmployee;
    }
}
