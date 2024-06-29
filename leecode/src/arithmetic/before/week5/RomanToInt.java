package arithmetic.before.week5;

import java.util.Scanner;

public class RomanToInt {
    public int romanToInt(String romanNumeral) {
        int result = 0;
        int previousValue = getValue(romanNumeral.charAt(0));
        for (int i = 1; i < romanNumeral.length(); i++) {
            int currentValue = getValue(romanNumeral.charAt(i));
            if (previousValue < currentValue) {
                result -= previousValue;
            } else {
                result += previousValue;
            }
            previousValue = currentValue;
        }
        result += previousValue;
        return result;
    }

    private int getValue(char romanDigit) {
        switch (romanDigit) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(new RomanToInt().romanToInt(sc.next()));
    }
}
