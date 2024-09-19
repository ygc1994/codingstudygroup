package baekjoon.bronzeII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

/* 나머지 - 백준 (3052) */
public class 나머지 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int intnum = 0;
        /* HashSet은 자바 Collection 중 Set의 파생 클래스
        * Set을 집합이라고 생각하면 되는데, HashSet의 경우 중복되는 원소를 넣을 경우 하나만 저장
        * HashSet은 순서 개념이 없어서 Collections.sort() 메소드를 사용할 수 X, 만약 정렬을 하고 싶다면 리스트로 변환 후 정렬
        * LinkedHashSet은 HashSet이 가지는 기능을 모두 가지고 있으며 추가적으로 저장 순서를 유지하는 특징 */
        LinkedHashSet<Integer> remainder = new LinkedHashSet<>();

        /* 수 10개를 입력 받은 뒤, 이를 42로 나눈 나머지를 입력 */
        for (int i = 0; i < 10; i++) {
            intnum = Integer.parseInt(br.readLine());

            /* 입력 받은 값의 나머지 값을 add() 메소드를 통해 remainder에 저장
            * 나머지에서 서로 다른 개수를 세면 되는 것이기 때문에, LinkedHashSet을 이용하면 자연스럽게 나머지가 remainder 원소에
            * 이미 저장되어 있어 중복일 경우 저장이 되지 않고 remainder에 없으면 저장 */
            remainder.add(intnum % 42);
        }

        /* 즉, remainder에 저장하면서 들어간 원소의 개수가 remainder의 크기가 되는 것이고, 이는 결국 서로 다른 나머지의 개수가 되는 것 */
        System.out.println(remainder.size());

    }

}