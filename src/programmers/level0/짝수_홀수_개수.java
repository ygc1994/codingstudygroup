package programmers.level0;

public class 짝수_홀수_개수 {

    public static void main(String[] args) {

        int[] num_list = new int[] {1, 3, 5, 7};
        int[] answer = {};
        int even_number_count = 0;
        int odd_number_count = 0;

        System.out.print("num_list : [");

        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                even_number_count++;
            } else odd_number_count++;

            System.out.print(num_list[i] + ", ");
        }

        answer = new int[] {even_number_count, odd_number_count};

        System.out.println("\b\b" + ']');
        System.out.print("result : [");

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + ", ");
        }

        System.out.println("\b\b" + ']');

    }

}