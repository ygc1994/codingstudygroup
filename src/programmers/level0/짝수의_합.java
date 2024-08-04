package programmers.level0;

public class 짝수의_합 {

    public static void main(String[] args) {

        int n = 4;
        int answer = 0;

        System.out.print("n이 " + n + "이므로 ");

        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                answer += i;

                System.out.print(i + " + ");
            }
        }

        System.out.println("\b\b" + "= " + answer + "을 return 합니다.");

    }

}