package programmers.level0;

public class 각도기 {

    public static void main(String[] args) {

        int angle = 180;
        int answer = 0;

        if(angle > 0 && angle < 90) answer = 1;
            else if(angle == 90) answer = 2;
            else if(angle > 90 && angle < 180) answer = 3;
            else answer = 4;

        System.out.println("angle : " + angle);
        System.out.println("result : " + answer);

    }

}