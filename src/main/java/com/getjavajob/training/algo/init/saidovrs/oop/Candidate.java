package com.getjavajob.training.algo.init.saidovrs.oop;

//это абстраткный класс Кандидата. Здесь реализуется интерфейс HelloInt и обьявляется метод describeExperience
abstract class Candidate implements HelloInt {
    //обьявление переменной имени
    private final String name;
    private final Nationaly nationality;

    // создание конструктора класса Candidate, в который зваходит значение переменной name из классов потомков CandidateAm и CandidateGJJ
    // Candidate(String name, String nationality) { }

    Candidate(String name, Nationaly nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    Candidate(String name) {
        //перегрузка конструктора внутри класса
        this(name, Nationaly.UNKNOWN);
    }

    //реализация метода Hello для кандидата
    public void hello() {
        System.out.println("Привет! Меня зовут " + name + "!");
    }

    //обьявление метода describeExperience в абстрактном классе Candidate
    public abstract void describeExperience();


    void nation() {

        switch (nationality) {
            case RUSSIAN:
                System.out.println("-Я россиянин.");
                break;
            case FOREIGNER:
                System.out.println("-Я иностранец.");
                break;
            default:
                System.out.println("-Не скажу.");
                break;
        }
    }
}