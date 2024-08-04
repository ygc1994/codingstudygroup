package programmers.level0;

public class 양꼬치 {

    public static void main(String[] args) {

        int n = 64;
        int k = 6;
        int answer = 0;

        answer = n * 12000 + (k - n / 10) * 2000;

        String str = String.format("%,d", answer);

        System.out.println("n : " + n);
        System.out.println("k : " + k);
        System.out.println("result : " + str);

    }

}