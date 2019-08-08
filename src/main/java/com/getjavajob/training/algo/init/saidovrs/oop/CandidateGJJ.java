package com.getjavajob.training.algo.init.saidovrs.oop;

//это класс Кандидата выпусткника getJavaJob. Здесь реализуется  метод describeExperience из абстрактного класса Candidate
class CandidateGJJ extends Candidate {

    //передача переменной имени кандидата в класс Candidate
    CandidateGJJ(String name, Nationaly nationality) {
        super(name, nationality);
    }

    CandidateGJJ(String name) {
        super(name);
    }

    //реализация метода describeExperience для кандидата выпусткника getJavaJob
    public void describeExperience() {
        System.out.println("-Я успешно прошел экзамены getJavaJob и обзоры моего кода.");
    }
}