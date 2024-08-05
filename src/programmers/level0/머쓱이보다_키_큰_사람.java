package programmers.level0;

public class 머쓱이보다_키_큰_사람 {

    public static void main(String[] args) {

        int[] array = new int[] {180, 120, 140};
        int height = 190;
        int answer = 0;

        System.out.print("array : [");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println("\b\b]");
        System.out.println("height : " + height);

        for (int i = 0; i < array.length; i++) {
            if(array[i] > height) answer++;
        }

        System.out.println("result : " + answer);

    }

}