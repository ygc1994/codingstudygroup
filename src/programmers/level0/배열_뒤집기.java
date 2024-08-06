package programmers.level0;

public class 배열_뒤집기 {

    public static void main(String[] args) {

        int[] num_list = new int [] {1, 0, 1, 1, 1, 3, 5};
        int[] answer = {};
        int num = 0;

        answer = new int[num_list.length];

        System.out.print("num_list : [");

        for (int i = 0; i < num_list.length; i++) {
            System.out.print(num_list[i] + ", ");
        }

        System.out.println("\b\b]");

        for (int i = num_list.length - 1; i >= 0; i--) {
            answer[num] = num_list[i];
            num++;
        }

        System.out.print("result : [");

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + ", ");
        }

        System.out.println("\b\b]");

    }

}