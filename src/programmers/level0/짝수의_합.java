package programmers.level0;

public class 짝수의_합 {

    public static void main(String[] args) {

        int n = 4;
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0) answer += i;
        }

        System.out.println("n : " + n);
        System.out.println("result : " + answer);

    }

}