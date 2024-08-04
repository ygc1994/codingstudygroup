package programmers.level0;

public class 숫자_비교하기 {

    public static void main(String[] args) {

        int num1 = 7;
        int num2 = 99;
        int answer = 0;

        if(num1 == num2) {
            answer = 1;

            System.out.println("num1이 " + num1 + "이고 num2가 " + num2 + "이므로 같습니다. 따라서 " + answer + "을 " +
                    "return합니다.");
        } else {
            answer = -1;

            System.out.println("num1이 " + num1 + "이고 num2가 " + num2 + "이므로 다릅니다. 따라서 " + answer + "을 " +
                    "return합니다.");
        }

    }

}