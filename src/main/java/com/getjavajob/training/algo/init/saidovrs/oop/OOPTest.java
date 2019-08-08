package com.getjavajob.training.algo.init.saidovrs.oop;

class OOPTest {
    public static void main(String[] args) {
        //создание экземпляра класса Employers для использования метода hello из класса Employers
        //Employers employers = new Employers();

        //создание экземпляра класса Employers  помощью фабрики классов внутри класса Employers
        Employers employers = Employers.getInstance();

        //создание массива из обьектов класса Candidate
        Candidate[] candidates = {
                new CandidateAm("Иван", Nationaly.RUSSIAN),
                new CandidateGJJ("Петр", Nationaly.RUSSIAN),
                new CandidateAm("Йохан", Nationaly.FOREIGNER),
                new CandidateGJJ("Петер"),
                new CandidateAm("Ян"),
                new CandidateGJJ("Питер"),
                new CandidateAm("Джон"),
                new CandidateGJJ("Педро"),
                new CandidateAm("Жан"),
                new CandidateGJJ("Пьер"),
        };

        //создание цикла из обьектов класса Candidate, для каждого из которых будет реализован диалог
        for (Candidate candidate : candidates) {
            employers.hello();
            candidate.hello();
            candidate.describeExperience();
            employers.tellmenation();
            candidate.nation();
            System.out.println();
        }
    }
}