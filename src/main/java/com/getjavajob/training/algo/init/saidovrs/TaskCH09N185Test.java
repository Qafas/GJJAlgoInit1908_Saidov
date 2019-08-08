package com.getjavajob.training.algo.init.saidovrs;

import com.getjavajob.training.algo.util.Assert;

import static com.getjavajob.training.algo.init.saidovrs.TaskCH09N185.*;

public class TaskCH09N185Test {
    public static void main(String[] args) {
        testCalcBracketEqual();
        testCalcBracketMoreOpeningBrackets();
        testCalcBracketMoreClosingBrackets();
    }

    private static void testCalcBracketEqual() {
        Assert.assertEquals("TaskCH09N185Test.testCalcBracketEqual", true,
                calcBracket("(1+1)=0").equals("EXPRESSION IS CORRECT. The number of opening and closing brackets is equal."));
    }

    private static void testCalcBracketMoreOpeningBrackets() {
        Assert.assertEquals("TaskCH09N185Test.testCalcBracketMoreOpeningBrackets", true,
                calcBracket("((1+1)=0").equals("ERROR. The number of opening brackets more then closing brackets. Total amount of opening brackets is: 2"));
    }

    private static void testCalcBracketMoreClosingBrackets() {
        Assert.assertEquals("TaskCH09N185Test.testCalcBracketMoreClosingBrackets", true,
                calcBracket("(1+1))=0").equals("ERROR. The number of closing brackets more then opening brackets. First closing bracket is 5 in a row."));
    }
}