package com.tw;

public class MultiplicationTable {
    public String create(int startNumber, int endNumber) {
        return generateMultiplicationTable(startNumber, endNumber);
    }

    // personal codes
    private String generateMultiplicationTable(int startNum, int endNum) {
        boolean isNotBigger;
        boolean isWithinBound;

        isNotBigger = checkIfNotBigger(startNum, endNum);
        isWithinBound = checkIfWithinBound(startNum, 1, 1000) && checkIfWithinBound(endNum, 1, 1000);

        if (isNotBigger && isWithinBound) {
            return printMultiplicationTable(startNum, endNum);
        } else {
            return null;
        }

    }

    private String printMultiplicationTable(int startNum, int endNum) {
        String output = "";

        for (int x = startNum; x <= endNum; x++) {
            for (int y = startNum; y <= x; y++) {
                output += y + "*" + x + "=" + (x*y);
                if (y != x) {
                    output += " ";
                }
            }
            if (x != endNum) {
                output += "\n";
            }
        }

        return output;
    }

    private boolean checkIfWithinBound(int number, int lowerBound, int upperBound) {
        return number >= lowerBound && number <= upperBound;
    }

    private boolean checkIfNotBigger(int startNum, int endNum) {
        return startNum <= endNum;
    }
}
