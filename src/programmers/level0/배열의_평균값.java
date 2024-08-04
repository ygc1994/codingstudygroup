package programmers.level0;

public class 배열의_평균값 {

    public static void main(String[] args) {

        int[] numbers = new int [] {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        double answer = 0;
        int sum = 0;

        System.out.print("numbers : [");

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

            System.out.print(numbers[i] + ", ");
        }

        answer = (double) sum / numbers.length;

        System.out.println("\b\b]");
        System.out.println("result : " + answer);

    }

}