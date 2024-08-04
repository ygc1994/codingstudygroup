package programmers.level0;

public class 두_수의_나눗셈 {

    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 16;
        double num3 = 0;
        int answer = 0;

        num3 = (double) num1 / num2 * 1000;
        answer =  (int) num3;

        if(num3 - answer == 0) {
            System.out.println("num1이 " + num1 + ", num2가 " + num2 + "이므로 " + num1 + " / " + num2 + " = " + num3 /
                    1000 + "에 1,000을 곱하면 " + answer + "이 됩니다.");
        } else System.out.println("num1이 " + num1 + ", num2가 " + num2 + "이므로 " + num1 + " / " + num2 + " = " + num3 /
                1000 + "에 1,000을 곱하면 " + num3 + "이 되며, 정수 부분은 " + answer + "입니다.");

    }

}