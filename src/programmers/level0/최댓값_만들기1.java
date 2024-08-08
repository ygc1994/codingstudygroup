package programmers.level0;

public class 최댓값_만들기1 {

    public static void main(String[] args) {

        int[] numbers = new int[] {0, 31, 24, 10, 1, 9};
        int answer = 0;

        System.out.print("numbers : [");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }

        System.out.println("\b\b]");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if(i != j) answer = Math.max(answer, numbers[i] * numbers[j]);
            }
        }

        System.out.println("result : " + answer);

    }

}