package programmers.level0;

public class 중복된_숫자_개수 {

    public static void main(String[] args) {

        int[] array = new int[] {0, 2, 3, 4};
        int n = 1;
        int answer = 0;

        System.out.print("array : [");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println("\b\b]");
        System.out.println("n : " + n);

        for (int i = 0; i < array.length; i++) {
            if(array[i] == n) answer++;
        }

        System.out.println("result : " + answer);

    }

}