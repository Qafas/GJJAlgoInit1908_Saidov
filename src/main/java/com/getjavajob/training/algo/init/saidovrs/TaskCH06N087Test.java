package com.getjavajob.training.algo.init.saidovrs;

import com.getjavajob.training.algo.util.Assert;

import static com.getjavajob.training.algo.init.saidovrs.Game.result;
import static com.getjavajob.training.algo.init.saidovrs.Game.score;

public class TaskCH06N087Test {
    public static void main(String[] args) {
        testResultFirstTeamWin();
        testResultSecondTeamWin();
        testResultDraw();
        testScore();
        testWrongScore();
    }

    private static void testResultFirstTeamWin() {
        Assert.assertEquals("TaskCH06N087Test.testResultFirstTeamWin", true,
                result(3, 2, "Reds", "Blues").equals("The game ended with the score: 3:2. The winner is Reds."));
    }

    private static void testResultSecondTeamWin() {
        Assert.assertEquals("TaskCH06N087Test.testResultFirstTeamWin", true,
                result(3, 4, "Reds", "Blues").equals("The game ended with the score: 3:4. The winner is  Blues."));
    }

    private static void testResultDraw() {
        Assert.assertEquals("TaskCH06N087Test.testResultFirstTeamWin", true,
                result(5, 5, "Reds", "Blues").equals("The game ended with the score: 5:5. Draw."));
    }

    private static void testScore() {
        Assert.assertEquals("TaskCH6N87Test.testScore", true, score(10) == 12);
    }

    private static void testWrongScore() {
        Assert.assertEquals("TaskCH06N087Test.testWrongScore", false, score(10) == 9);
    }
}