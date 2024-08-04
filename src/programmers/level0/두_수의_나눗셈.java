package programmers.level0;

public class 두_수의_나눗셈 {

    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 16;
        double num3 = 0;
        int answer = 0;

        num3 = (double) num1 / num2 * 1000;
        answer =  (int) num3;

        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
        System.out.println("result : " + answer);

    }

}