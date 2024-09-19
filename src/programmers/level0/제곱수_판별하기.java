package programmers.level0;

public class 제곱수_판별하기 {

    public static void main(String[] args) {

        int n = 976;
        int answer = 0;

        if(Math.sqrt(n) - (int) Math.sqrt(n) > 0 && Math.sqrt(n) - (int) Math.sqrt(n) < 1) {
            answer = 2;
        } else answer = 1;

        System.out.println("n : " + n);
        System.out.println("result : " + answer);

    }

}