package programmers.level0;

public class 배열_두배_만들기 {

    public static void main(String[] args) {

        int[] numbers = new int[] {1, 2, 100, -99, 1, 2, 3};
        int[] answer = new int[] {};

        answer = new int[numbers.length];

        System.out.print("numbers : [");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }

        System.out.println("\b\b]");

        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }

        System.out.print("result : [");

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + ", ");
        }

        System.out.println("\b\b]");

    }

}