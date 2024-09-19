package programmers.level0;

public class 피자_나눠_먹기_1 {

    public static void main(String[] args) {

        int n = 15;
        int answer = 0;

        answer = n / 7;

        if(n % 7 > 0) answer++;

        System.out.println("n : " + n);
        System.out.println("result : " + answer);

    }

}