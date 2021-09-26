package com.cursor;

public class Money {

    //реалізовано додавання сум
    public void addition(long grnPartValue1, byte coinsPartValue1, long grnPartValue2, byte coinsPartValue2) {
        long grnSum = grnPartValue1 + grnPartValue2;
        byte coinsSum = (byte) (coinsPartValue1 + coinsPartValue2);
        if (coinsSum >= 100) {
            grnSum++;
            coinsSum = (byte) (100 - coinsSum);
        }
        System.out.print("Addition: ");
        if (coinsSum < 10) {
            System.out.println(grnSum + "," + "0" + coinsSum);
        } else {
            System.out.println(grnSum + "," + coinsSum);
        }
    }

    //реалізовано віднімання сум
    public void subtraction(long grnPartValue1, byte coinsPartValue1, long grnPartValue2, byte coinsPartValue2) {
        long grnSum = grnPartValue1 - grnPartValue2;
        byte coinsSum = (byte) (coinsPartValue1 - coinsPartValue2);
        if (coinsSum < 0) {
            grnSum--;
            coinsSum = (byte) ((-1) * coinsSum);
            coinsSum = (byte) (100 - coinsSum);
        }
        System.out.print("Subtraction: ");
        if (coinsSum < 10) {
            System.out.println(grnSum + "," + "0" + coinsSum);
        } else {
            System.out.println(grnSum + "," + coinsSum);
        }
    }

    //реалізовано ділення сум
    public void division(long grnPartValue1, byte coinsPartValue1, long grnPartValue2, byte coinsPartValue2) {
        double dividedSum = (double) grnPartValue1 * 1000 + coinsPartValue1 * 100; // дільник
        double divider = (double) grnPartValue2 * 1000 + coinsPartValue2 * 100; // ділене
        double divisionResult = dividedSum / divider;// 12500/2500=5
        long grnValueLongResult = (long) divisionResult; //5
        byte coinsValueByteResult = (byte) ((divisionResult - grnValueLongResult) * 100);
        System.out.print("Division: ");
        if (coinsValueByteResult < 10) {
            System.out.println(grnValueLongResult + "," + "0" + coinsValueByteResult);
        } else {
            System.out.println(grnValueLongResult + "," + coinsValueByteResult);
        }
    }

    //розподіл суми на дробове число
    public void divideSumByFractional(long grnPartValue, byte coinsPartValue, double fractionalNumber) {
        double dividedSum = grnPartValue * 1000 + coinsPartValue * 100;
        double divider = fractionalNumber * 1000;
        double divisionResult = dividedSum / divider;
        long grnValueLongResult = (long) divisionResult;
        byte coinsValueByteResult = (byte) ((divisionResult - grnValueLongResult) * 100);
        System.out.print("Divide sum by a fractional number: ");
        if (coinsValueByteResult < 10) {
            System.out.println(grnValueLongResult + "," + "0" + coinsValueByteResult);
        } else {
            System.out.println(grnValueLongResult + "," + coinsValueByteResult);
        }
    }

    //множення суми на дробове число
    public void multiplByFractNum(long grnPartValue, byte coinsPartValue, double fractionalNumber) {
        double firstMultiplier = grnPartValue * 1000 + coinsPartValue * 100;
        double secondMultiplier = fractionalNumber * 1000;
        double multiplicationResult = (firstMultiplier * secondMultiplier) / 1000000;
        long grnValueLongResult = (long) multiplicationResult;
        byte coinsValueByteResult = (byte) ((multiplicationResult - grnValueLongResult) * 100);
        System.out.print("Multiplying sum by a fractional number: ");
        if (coinsValueByteResult < 10) {
            System.out.println(grnValueLongResult + "," + "0" + coinsValueByteResult);
        } else {
            System.out.println(grnValueLongResult + "," + coinsValueByteResult);
        }
    }

    public void comparisonOperations(long grnPartValue1, byte coinsPartValue1, long grnPartValue2, byte coinsPartValue2) {
        double sum1 = grnPartValue1 * 1000 + coinsPartValue1 * 100;
        double sum2 = grnPartValue2 * 1000 + coinsPartValue2 * 100;

        if (sum1 > sum2) {
            System.out.println(grnPartValue1 + "," + coinsPartValue1 + " < " + grnPartValue2 + "," + coinsPartValue2);
        } else if (sum1 < sum2) {
            System.out.println(grnPartValue2 + "," + coinsPartValue2 + " > " + grnPartValue1 + "," + coinsPartValue1);
        } else if (sum1 == sum2) {
            System.out.println(grnPartValue1 + "," + coinsPartValue1 + " = " + grnPartValue2 + "," + coinsPartValue2);
        }
    }
}