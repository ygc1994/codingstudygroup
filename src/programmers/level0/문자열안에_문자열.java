package programmers.level0;

public class 문자열안에_문자열 {

    public static void main(String[] args) {

        String str1 = "ppprrrogrammers";
        String str2 = "pppp";
        int answer = 0;
        int count = 0;

        answer = 2;

        for (int i = 0; i < str1.length(); i++) {
            for (int j = count; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    count++;

                    if (count == str2.length()) answer = 1;

                    break;
                } else count = 0;
            }
        }
//        if(str1.contains(str2)) {
//            answer = 1;
//        } else answer = 2;

        System.out.println("str1 : " + '\"' + str1 + '\"');
        System.out.println("str2 : " + '\"' + str2 + '\"');
        System.out.println("result : " + answer);

    }

}