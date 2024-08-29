package baekjoon.bronzeI;

import java.util.Scanner;

public class 동전_게임 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();

        String[] tc;
        int[][] tcc;
        int row = 0;
        String coin = "";

        tc = new String[P];
        tcc = new int[P][8];

        sc.nextLine();

        for (int i = 0; i < P; i++) {
            tc[i] = sc.nextLine();
        }

        while(row < P) {
            for (int i = 0; i < 38; i++) {
                coin = tc[row].substring(i, i + 3);

                switch (coin) {
                    case "TTT": tcc[row][0]++; break;
                    case "TTH": tcc[row][1]++; break;
                    case "THT": tcc[row][2]++; break;
                    case "THH": tcc[row][3]++; break;
                    case "HTT": tcc[row][4]++; break;
                    case "HTH": tcc[row][5]++; break;
                    case "HHT": tcc[row][6]++; break;
                    case "HHH": tcc[row][7]++; break;
                }
            }

            row++;
        }

        for (int i = 0; i < P; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tcc[i][j] + " ");
            }

            System.out.println();
        }

    }

}