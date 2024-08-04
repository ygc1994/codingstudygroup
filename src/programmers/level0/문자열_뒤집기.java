package programmers.level0;

public class 문자열_뒤집기 {

    public static void main(String[] args) {

        String my_string = "bread";
        String answer = "";

        for (int i = my_string.length() - 1; i >= 0; i--) {
            answer += my_string.charAt(i);
        }

        System.out.println("my_string : \"" + my_string + '\"');
        System.out.println("result : \"" + answer + '\"');

    }

}