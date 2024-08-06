package programmers.level0;

public class 중앙값_구하기 {

    public static void main(String[] args) {

        int[] array = new int[] {9, -1, 0};
        int answer = 0;
        int temp = 0;

        System.out.print("array : [");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println("\b\b]");

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if(array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        answer = array[array.length / 2];

        System.out.println("result : " + answer);

    }

}