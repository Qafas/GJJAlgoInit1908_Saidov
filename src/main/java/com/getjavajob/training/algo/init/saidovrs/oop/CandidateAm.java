package com.getjavajob.training.algo.init.saidovrs.oop;

//это класс Кандидата самоучки. Здесь реализуется  метод describeExperience из абстрактного класса Candidate
public class CandidateAm extends Candidate {

    //передача переменной имени кандидата в класс Candidate
    CandidateAm(String name, Nationaly nationality) {
        super(name, nationality);
    }

    CandidateAm(String name) {
        super(name);
    }

    //реализация метода describeExperience для кандидата самоучки
    public void describeExperience() {
        System.out.println("-Я самостоятельно обучался джаве, никто не проверял мои знания и как хорош мой код.");
    }
}