package baekjoon.bronzeII;

import java.util.Scanner;

/* 손익분기점 - 백준 (1712) */
public class 손익분기점 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        long B = sc.nextInt();
        long C = sc.nextInt();

        /* 고정 비용은 몇 대를 생산하던 변하지 않는 비용
        * n개를 생산할 때, 이익이 발생하는 시점의 n을 찾는 문제
        * 즉, n x 상품 가격(C) > 고정 비용(A) + (n x 가변 비용(B))
        * n x 상품 가격(C)는 총 수입, 고정 비용(A) + 가변 비용(B)이 총 비용
        * 상품 판매 개수(판매량)은 고정 비용은 고정값이니, 상품 가격과 가변 비용에 따라서 달라진다는 의미
        * 중요한 것은, n은 총 비용과 총 수익이 같아지는 지점, 이익이 나는 지점이라 하면 n에 1이 더해진 값
        * 즉 A / (C - B) + 1이 바로 이익이 발생하는 판매량의 개수
        * 문제를 보면 하나 조건이, 이익이 발생하는 지점(손익분기점)이 없다면 -1을 출력
        * A / (C - B) + 1 > 0 의미는 이익이 발생한다는 의미
        * 반대로 말하자면 저 수식이 음수가 된다면 이익이 발생하지 않는다는 의미
        * 즉 C - B < 0, 그리고 C와 B가 같다면 분모는 0이 되어 나눌 수 없는 식
        * 그렇기에 이익이 발생하지 않는 경우를 수식으로 보자면 C - B <= 0
        * 그리고 위 수식을 더 간단히 하자면 결과적으로는 C <= B
        * 즉, 입력 받은 자연수 C와 B가 C ≤ B 를 만족한다면 이익이 발생하지 않는 조건이므로 -1을 출력 */
        if (C <= B) {
            System.out.println("-1");
        } else {
            System.out.println(A / (C - B) + 1);
        }

    }

}