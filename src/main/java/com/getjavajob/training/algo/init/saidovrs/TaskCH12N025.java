/*Заполнить двумерный массив так, как представлено на рис. 12.3.
        1 2 ... 10              1 13 ... 109
        11 12 ... 20            2 14 ... 110
        ... ... ... ...         ... ... ... ...
        111 112 ... 120         12 24 ... 120
        а                       б

        10 ... 2 1              12 24 ... 120
        20 ... 12 11            ... ... ... ...
        ... ... ... ...         2 14 ... 110
        120 ... 112 111         1 13 ... 109
        в                       г

        1 2 ... 12 1            24 25 ... 120
        24 ... 14 13            2 ... 26 ... 119
        25 26 ... 36            ... ... ... ... ...
        ... ... ... ...         11 14 ... ... 110
        120 ... 110 109         12 13 36 ... 109
        д                       е

        111 112 ... 120         109 ... 13 1
        ... ... ... ...         110 ... 14 2
        11 12 ... 20            ... ... ... ...
        1 2 ... 10              120 ... 24 12
        ж                       з

        120 ... 112 111         120 ... 24 12
        ... ... ... ...         ... ... ... ...
        20 ... 12 11            110 ... 14 2
        10 ... 2 1              109 ... 13 1
        и                       к

        120 119 ... 111         10 ... 2 1
        ... ... ... ...         11 12 ... 20
        21 22 ... ...           30 ... 22 21
        20 ... 12 11            ... ... ... ...
        1 2 ... 10              111 112 ... 120
        л                       м
        120 ... 25 24 1         12 13      ... 109
        119 ... 26 ... 2        11 14 ... ... 110
        ... ... ... ... ...     ... ... ... ... ...
        110 ... ... 14 11       2 ... 26 ... ...
        109 ... 26 13 12        1 24 25 ... 120
        н                       о

        111 112 ... 120         109 ... 36 13 12
        ... ... ... ...         110 ... ... 14 ...
        30 ... 22 21 ...        ... ... ... ...
        11 12 20 119            ... 26 ... 2
        10 ... 2 1 120          ... 25 24 1
        п                       р
        */
package com.getjavajob.training.algo.init.saidovrs;

class TaskCH12N025 {
    private static final int SIZE_X = 12;
    private static final int SIZE_Y = 10;

    public static void main(String[] args) {
        taskA();
        taskB();
        taskV();
        taskG();
        taskD();
        taskE();
        taskJ();
        taskZ();
        taskI();
        taskK();
        taskL();
        taskM();
        taskN();
        taskO();
        taskP();
        taskR();
    }

    private static void print(int[][] a) {
        for (int[] ints : a) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(String.format("%-4d", ints[j]));
            }
            System.out.println();
        }
    }

    private static void taskA() {
        System.out.println("Array A looks like this: ");
        int[][] arrayA = new int[SIZE_X][SIZE_Y];
        int kA = 0;
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[0].length; j++) {
                kA++;
                arrayA[i][j] = kA;
            }
        }
        print(arrayA);
    }

    private static void taskB() {
        System.out.println("Array B looks like this: ");
        int[][] arrayB = new int[SIZE_X][SIZE_Y];
        int kB;
        int kkB = 0;
        for (int i = 0; i < arrayB.length; i++) {
            kkB++;
            kB = kkB;
            for (int j = 0; j < arrayB[0].length; j++) {
                arrayB[i][j] = kB;
                kB = kB + arrayB.length;
            }
        }
        print(arrayB);
    }

    private static void taskV() {
        System.out.println("Array V looks like this: ");
        int[][] arrayV = new int[SIZE_X][SIZE_Y];
        int kV = 0;
        for (int i = 0; i < arrayV.length; i++) {
            for (int j = arrayV[0].length - 1; j >= 0; j--) {
                kV++;
                arrayV[i][j] = kV;
            }
        }
        print(arrayV);
    }

    private static void taskG() {
        System.out.println("МArray G looks like this: ");
        int[][] arrayG = new int[SIZE_X][SIZE_Y];
        int kG;
        int kkG = 0;
        for (int i = arrayG.length - 1; i >= 0; i--) {
            kkG++;
            kG = kkG;
            for (int j = 0; j < arrayG[0].length; j++) {
                arrayG[i][j] = kG;
                kG = kG + arrayG.length;
            }
        }
        print(arrayG);
    }

    private static void taskD() {
        System.out.println("Array D looks like this: ");
        int[][] arrayD = new int[SIZE_Y][SIZE_X];
        int kD = 0;
        for (int j = 0; j < arrayD.length; j = j + 2) {
            for (int i = 0; i < arrayD[0].length; i++) {
                kD++;
                arrayD[j][i] = kD;
            }
        }
        kD = 0;
        for (int j = 1; j < arrayD.length; j = j + 2) {
            int kkD = arrayD[0].length;
            kD = kD + kkD;
            for (int i = arrayD[0].length - 1; i >= 0; i--) {
                kD++;
                arrayD[j][i] = kD;
            }
        }
        print(arrayD);
    }

    private static void taskE() {
        System.out.println("Array E looks like this: ");
        int[][] arrayE = new int[SIZE_X][SIZE_Y];
        int kE = 0;
        int kkE = arrayE.length;
        for (int j = 0; j < arrayE[0].length; j = j + 2) {
            for (int i = 0; i < arrayE.length; i++) {
                kE++;
                arrayE[i][j] = kE;
            }
            kE = kE + kkE;
        }
        kE = 0;
        for (int j = 1; j < arrayE[0].length; j = j + 2) {
            kE = kE + kkE;
            for (int i = arrayE.length - 1; i >= 0; i--) {
                kE++;
                arrayE[i][j] = kE;
            }
        }
        print(arrayE);
    }

    private static void taskJ() {
        System.out.println("МArray J looks like this: ");
        int[][] arrayJ = new int[SIZE_X][SIZE_Y];
        int kJ = 0;
        for (int i = arrayJ.length - 1; i >= 0; i--) {
            for (int j = 0; j < arrayJ[0].length; j++) {
                kJ++;
                arrayJ[i][j] = kJ;
            }
        }
        print(arrayJ);
    }

    private static void taskZ() {
        System.out.println("Array Z looks like this: ");
        int[][] arrayZ = new int[SIZE_X][SIZE_Y];
        int kZ = 0;
        for (int j = arrayZ[0].length - 1; j >= 0; j--) {
            for (int i = 0; i < arrayZ.length; i++) {
                kZ++;
                arrayZ[i][j] = kZ;
            }
        }
        print(arrayZ);
    }

    private static void taskI() {
        System.out.println("Array I looks like this: ");
        int[][] arrayI = new int[SIZE_X][SIZE_Y];
        int kI = 0;
        for (int i = arrayI.length - 1; i >= 0; i--) {
            for (int j = arrayI[0].length - 1; j >= 0; j--) {
                kI++;
                arrayI[i][j] = kI;
            }
        }
        print(arrayI);
    }

    private static void taskK() {
        System.out.println("Array K looks like this: ");
        int[][] arrayK = new int[SIZE_X][SIZE_Y];
        int kK = 0;
        for (int j = arrayK[0].length - 1; j >= 0; j--) {
            for (int i = arrayK.length - 1; i >= 0; i--) {
                kK++;
                arrayK[i][j] = kK;
            }
        }
        print(arrayK);
    }

    private static void taskL() {
        System.out.println("Array L looks like this: ");
        int[][] arrayL = new int[SIZE_X][SIZE_Y];
        int kL = 0;
        for (int i = arrayL.length - 1; i >= 0; i = i - 2) {
            for (int j = 0; j < arrayL[0].length; j++) {
                kL++;
                arrayL[i][j] = kL;
            }
            int kkL = arrayL[0].length;
            kL = kL + kkL;
        }
        kL = 0;
        int kkL = arrayL[0].length;
        for (int i = arrayL.length - 2; i >= 0; i = i - 2) {
            kL = kL + kkL;
            for (int j = arrayL[0].length - 1; j >= 0; j--) {
                kL = kL + 1;
                arrayL[i][j] = kL;
            }
        }
        print(arrayL);
    }

    private static void taskM() {
        System.out.println("Array M looks like this: ");
        int[][] arrayM = new int[SIZE_X][SIZE_Y];
        int kM = 0;
        for (int i = 0; i < arrayM.length; i = i + 2) {
            for (int j = arrayM[0].length - 1; j >= 0; j--) {
                kM++;
                arrayM[i][j] = kM;
            }
            int kkM = arrayM[0].length;
            kM = kM + kkM;
        }
        kM = 0;
        int kkM = arrayM[0].length;
        for (int i = 1; i < arrayM.length; i = i + 2) {
            kM = kM + kkM;
            for (int j = 0; j < arrayM[0].length; j++) {
                kM = kM + 1;
                arrayM[i][j] = kM;
            }
        }
        print(arrayM);
    }

    private static void taskN() {
        System.out.println("Array N looks like this: ");
        int[][] arrayN = new int[SIZE_X][SIZE_Y];
        int kN = 0;
        for (int j = arrayN[0].length - 1; j >= 0; j = j - 2) {
            for (int i = 0; i < arrayN.length; i++) {
                kN++;
                arrayN[i][j] = kN;
            }
            int kkN = arrayN.length;
            kN = kN + kkN;
        }
        kN = 0;
        int kkN = arrayN.length;
        for (int j = arrayN[0].length - 2; j >= 0; j = j - 2) {
            kN = kN + kkN;
            for (int i = arrayN.length - 1; i >= 0; i--) {
                kN = kN + 1;
                arrayN[i][j] = kN;
            }
        }
        print(arrayN);
    }

    private static void taskO() {
        System.out.println("Array O looks like this: ");
        int[][] arrayO = new int[SIZE_X][SIZE_Y];
        int kO = 0;
        for (int j = 0; j < arrayO[0].length; j = j + 2) {
            for (int i = arrayO.length - 1; i >= 0; i--) {
                kO++;
                arrayO[i][j] = kO;
            }
            int kkO = arrayO.length;
            kO = kO + kkO;
        }
        kO = 0;
        int kkO = arrayO.length;
        for (int j = 1; j < arrayO[0].length; j = j + 2) {
            kO = kO + kkO;
            for (int i = 0; i < arrayO.length; i++) {
                kO = kO + 1;
                arrayO[i][j] = kO;
            }
        }
        print(arrayO);
    }

    private static void taskP() {
        System.out.println("МArray P looks like this: ");
        int[][] arrayP = new int[SIZE_X][SIZE_Y];
        int kP = 0;
        for (int i = arrayP.length - 1; i >= 0; i = i - 2) {
            for (int j = arrayP[0].length - 1; j >= 0; j--) {
                kP++;
                arrayP[i][j] = kP;
            }
            int kkP = arrayP[0].length;
            kP = kP + kkP;
        }
        kP = 0;
        int kkP = arrayP[0].length;
        for (int i = arrayP.length - 2; i >= 0; i = i - 2) {
            kP = kP + kkP;
            for (int j = 0; j < arrayP[0].length; j++) {
                kP = kP + 1;
                arrayP[i][j] = kP;
            }
        }
        print(arrayP);
    }

    private static void taskR() {
        System.out.println("МArray R looks like this: ");
        int[][] arrayR = new int[SIZE_X][SIZE_Y];
        int kR = 0;
        for (int j = arrayR[0].length - 1; j >= 0; j = j - 2) {
            for (int i = arrayR.length - 1; i >= 0; i--) {
                kR++;
                arrayR[i][j] = kR;
            }
            int kkR = arrayR.length;
            kR = kR + kkR;
        }
        kR = 0;
        int kkR = arrayR.length;
        for (int j = arrayR[0].length - 2; j >= 0; j = j - 2) {
            kR = kR + kkR;
            for (int i = 0; i < arrayR.length; i++) {
                kR = kR + 1;
                arrayR[i][j] = kR;
            }
        }
        print(arrayR);
    }
}