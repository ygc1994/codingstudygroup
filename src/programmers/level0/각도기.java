package programmers.level0;

public class 각도기 {

    public static void main(String[] args) {

        int angle = 180;
        int answer = 0;

        if(angle > 0 && angle < 90) {
            answer = 1;

            System.out.println("angle이 " + angle + "이므로 예각입니다. 따라서 " + answer + "을 return합니다.");
        } else if(angle == 90) {
            answer = 2;

            System.out.println("angle이 " + angle + "이므로 직각입니다. 따라서 " + answer + "을 return합니다.");
        } else if(angle > 90 && angle < 180) {
            answer = 3;

            System.out.println("angle이 " + angle + "이므로 둔각입니다. 따라서 " + answer + "을 return합니다.");
        } else {
            answer = 4;

            System.out.println("angle이 " + angle + "이므로 평각입니다. 따라서 " + answer + "을 return합니다.");
        }

    }

}
