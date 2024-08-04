package programmers.level0;

public class 특정_문자_제거하기 {

    public static void main(String[] args) {

        String my_string = "BCBdbe";
        String letter = "B";
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) != letter.charAt(0)) answer += my_string.charAt(i);
        }

        System.out.println("my_string : " + my_string);
        System.out.println("letter : " + letter);
        System.out.println("result : " + answer);

    }

}