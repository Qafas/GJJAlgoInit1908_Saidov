package com.getjavajob.training.algo.init.saidovrs.oop;

//это класс нанимателя. Здесь реализуется интерфейс HelloInt
class Employers implements HelloInt {

    private Employers() {
    }

    static Employers getInstance() {
        return new Employers();
    }

    //Это реализация нанимателем метода hello, получаемого из интерфейса HelloInt
    public void hello() {
        System.out.println("-Привет! Пожалуйста представься и опиши свой опыт в Java.");
    }

    void tellmenation() {
        System.out.println("-Назовите вашу национальность.");
    }
}