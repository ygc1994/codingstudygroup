package programmers.level0;

public class 배열의_평균값 {

    public static void main(String[] args) {

        int[] numbers = new int [] {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        double answer = 0;
        int sum = 0;


        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        answer = (double) sum / numbers.length;

        System.out.println("numbers의 원소들의 평균 값은 " + answer + "입니다.");
    }
}
