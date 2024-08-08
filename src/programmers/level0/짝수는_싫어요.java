package programmers.level0;

public class 짝수는_싫어요 {

    public static void main(String[] args) {

        int n = 15;
        int[] answer = {};
        int count = 0;

        if(n % 2 == 0) {
            answer = new int[n / 2];
        } else answer = new int[n / 2 + 1];

        for (int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                answer[count] = i;
                count++;
            }
        }

        System.out.println("n = " + n);
        System.out.print("result : [");

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + ", ");
        }

        System.out.println("\b\b]");

    }

}