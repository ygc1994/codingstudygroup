package programmers.level0;

public class 숫자_비교하기 {

    public static void main(String[] args) {

        int num1 = 7;
        int num2 = 99;
        int answer = 0;

        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);

        if(num1 == num2) {
            answer = 1;

            System.out.println("result : " + answer);
        } else {
            answer = -1;

            System.out.println("result : " + answer);
        }

    }

}