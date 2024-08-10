package programmers.level0;

public class 점의_위치_구하기 {
    public static void main (String[] args) {

        int[] dot = new int[] {-7, 9};
        int answer = 0;

        if(dot[0] > 0 && dot[1] > 0) {
            answer = 1;
        } else if (dot[0] < 0 && dot[1] > 0) {
            answer = 2;
        } else if (dot[0] < 0 && dot[1] < 0) {
            answer = 3;
        } else answer = 4;

        System.out.println("dot : [" + dot[0] + ", " + dot[1] + "]");
        System.out.println("result : " + answer);

    }

}