/*Известна информация о 20 сотрудниках фирмы: фамилия, имя, отчество, адрес и дата поступления на работу (месяц, год).
Напечатать фамилию, имя, отчество и адрес сотрудников, которые на сегодняшний день проработали в фирме
 не менее трех лет. День месяца не учитывать (при совпадении месяца поступления и месяца сегодняшнего дня считать,
 что прошел пол-ный год).*/
package com.getjavajob.training.algo.init.saidovrs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TaskCH13N12 {
    public static void main(String[] args) {
        System.out.println("Which action do you want to perform? ");
        System.out.println("Search by length of service (press 1)|" +
                "Search by persons name/surname (incl. partial spelling)(press 2)|" +
                "Displaying the experience of employees in company on a given date (press 3)");
        int choose;
        do {
            Scanner scanx = new Scanner(System.in);
            choose = scanx.nextInt();
        } while (choose < 1 || choose > 3);
        if (choose == 1) {
            System.out.println("Enter the month form which to start the counting: ");
            int startMonth;
            do {
                Scanner scanStartMonth = new Scanner(System.in);
                startMonth = scanStartMonth.nextInt();
            } while (startMonth < 1 | startMonth > 12);
            System.out.println("Enter the year form which to start the counting: ");
            int startYear;
            do {
                Scanner scanStartYear = new Scanner(System.in);
                startYear = scanStartYear.nextInt();
            } while (startYear > 2019);
            System.out.println("To sort employees, enter the number of years that employee must work in the company: ");
            int lengthOfService;
            do {
                Scanner scanLengthOfService = new Scanner(System.in);
                lengthOfService = scanLengthOfService.nextInt();
            } while (lengthOfService < 1);
            System.out.println("As of " + startMonth + "." + startYear + " the followed employees worked for more than " + lengthOfService + " years: ");
            Database database1 = new Database(startMonth, startYear, lengthOfService);
            database1.printString(database1.searchByWorkExperience());
        } else if (choose == 2) {
            System.out.println("Enter full(partial) name/surname of a employee which you want to search: ");
            String searchByWord;
            do {
                Scanner scans = new Scanner(System.in);
                searchByWord = scans.nextLine();
            } while (searchByWord.equals(""));
            Database database2 = new Database(searchByWord);
            database2.printString(database2.searchByName());
        } else {
            System.out.println("Enter the month form which to start the counting: ");
            int startMonth;
            do {
                Scanner scanm = new Scanner(System.in);
                startMonth = scanm.nextInt();
            } while (startMonth < 1 | startMonth > 12);
            System.out.println("Enter the year form which to start the counting: ");
            int startYear;
            do {
                Scanner scany = new Scanner(System.in);
                startYear = scany.nextInt();
            } while (startYear > 2019);
            Database database3 = new Database(startMonth, startYear);
            database3.printString(database3.outputExperienceYears());
        }
    }
}
//-----------------------------------------------------------
class Database {
    private final static Employee[] EMPLOYEES = new Employee[]{
            new Employee("Иванов", "Иван", "Иванович", "ул. Ивановcкая д.1", 3, 2011),
            new Employee("Петров", "Петр", "Петрович", "ул. Петровская д.2", 2, 2018),
            new Employee("Сидоров", "Сидор", "Сидорович", "ул. Сидоровская д.3", 5, 2009),
            new Employee("Павлов", "Павел", "Павлович", "ул. Павловский д.4", 7, 1999),
            new Employee("Никитин", "Петр", "Никитич", "ул. Никитская д.5", 2, 2018),
            new Employee("Алексеев", "Алексей", "Алексеевич", "ул. Алексеевская д.33", 1, 2017),
            new Employee("Дмитриев", "Дмитрий", "Дмитриевич", "ул. Двимтриева д.44", 7, 2006),
            new Employee("Семенов", "Семен", "Семенович", "ул. Семеновская д.11", 9, 2008),
            new Employee("Михайлов", "Михаил", "Михайлович", "ул. Михайловская д.1", 6, 2015),
            new Employee("Романов", "Роман", "Романович", "ул. Романовская д.4", 11, 2014),
            new Employee("Артемов", "Артем", "Артемович", "ул. Артемовская д.22", 4, 2001),
            new Employee("Максимов", "Максим", "Максимович", "ул. Максимовская д.33", 12, 2019),
            new Employee("Федоров", "Федор", "Федорович", "ул. Федоровская д.76", 6, 2012),
            new Employee("Сергеев", "Сергей", "Сергеевич", "ул. Сергеевская д.88", 10, 2010),
            new Employee("Юрьев", "Юрий", "Юрьевич", "ул. Юрьевская д.23", 7, 2007),
            new Employee("Александров", "Александр", "Александрович", "ул. Александровская д.33", 11, 1995),
            new Employee("Игорев", "Игорь", "Игоревич", "ул. Игоревская д.54", 9, 1989),
            new Employee("Олегов", "Олег", "Олегович", "ул. Олеговская д.11", 1, 2016),
            new Employee("Всеволодов", "Всеволод", "Всеволодович", "ул. Всеволодовская д.65", 11, 2013),
            new Employee("Владимиров", "Владимир", "Владимирович", "ул. Владимировская д.93", 5, 2004)
    };
    private int lengthOfService;
    private int startMonth;
    private int startYear;
    private String searchByWord;

    Database(String searchByWord) {
        this.searchByWord = searchByWord;
    }

    Database(int startMonth, int startYear) {
        this.startYear = startYear;
        this.startMonth = startMonth;
    }

    Database(int startMonth, int startYear, int lengthOfService) {
        this(startMonth, startYear);
        this.lengthOfService = lengthOfService;
    }

    String[] searchByWorkExperience() {
        List<String> result = new ArrayList<>();
        for (Employee employee : EMPLOYEES) {
            if ((employee.getBeginInMonth() <= startMonth & employee.getBeginInYear() <= startYear - lengthOfService) |
                    employee.getBeginInMonth() > startMonth & employee.getBeginInYear() <= startYear - lengthOfService - 1) {
                result.add(employee.getSurname() + " " + employee.getName() + " " + employee.getFathersname()
                        + ". Устроился на работу " + employee.getBeginInMonth() + ":" + employee.getBeginInYear() + ".");
            }
        }
        return result.toArray(new String[result.size()]);
    }

    String[] searchByName() {
        List<String> result = new ArrayList<>();
        for (Employee employee : EMPLOYEES) {
            String str = searchByWord.toLowerCase();
            if (employee.getSurname().toLowerCase().contains(str) ||
                    employee.getName().toLowerCase().contains(str) ||
                    employee.getFathersname().toLowerCase().contains(str)) {
                result.add(employee.getSurname() + " " + employee.getName() + " " + employee.getFathersname()
                        + ". Проживает по адресу: " + employee.getAddress() + ".");
            }
        }
        return result.toArray(new String[result.size()]);
    }

    String[] outputExperienceYears() {
        List<String> result = new ArrayList<>();
        int experienceYears;
        for (Employee employee : EMPLOYEES) {
            if (employee.getBeginInMonth() <= startMonth) {
                experienceYears = startYear - employee.getBeginInYear();
            } else {
                experienceYears = startYear - employee.getBeginInYear() - 1;
            }
            if (experienceYears >= 0) {
                result.add(employee.getFathersname() + " " + employee.getName() + " поступил на работу  "
                        + employee.getBeginInMonth() + "." + employee.getBeginInYear() + ". На " + startMonth + "."
                        + startYear + " проработал в компании " + experienceYears + " год.");
            }
        }
        return result.toArray(new String[result.size()]);
    }

    void printString(String[] array) {
        for (String str : array) {
            System.out.println(str);
        }
    }
}
//-----------------------------------------------------------
class Employee {
    private String surname;
    private String name;
    private String fathersname;
    private String address;
    private Integer beginInMonth;
    private Integer beginInYear;

    Employee(String surname, String name, String fathersname, String address, Integer beginInMonth, Integer beginInYear) {
        this.surname = surname;
        this.name = name;
        this.fathersname = fathersname;
        this.address = address;
        this.beginInMonth = beginInMonth;
        this.beginInYear = beginInYear;
    }

    String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getFathersname() {
        return fathersname;
    }

    public void setFathersname(String fathersname) {
        this.fathersname = fathersname;
    }

    String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    Integer getBeginInMonth() {
        return beginInMonth;
    }

    public void setBeginInMonth(Integer beginInMonth) {
        this.beginInMonth = beginInMonth;
    }

    Integer getBeginInYear() {
        return beginInYear;
    }

    public void setBeginInYear(Integer beginInYear) {
        this.beginInYear = beginInYear;
    }
}