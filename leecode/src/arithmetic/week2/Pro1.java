/*
package arithmetic.week2;

import java.util.Scanner;

public class Pro1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int time = sc.nextInt();
        for (int i = 0; i < time; i++) {

            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            int distance = Math.abs(x1 - x2) + Math.abs(y1 - y2);
            int monkey = sc.nextInt();
            int brotherMove = sc.nextInt();

            int minCount = 99999;
            for (int j = 0; j < monkey; j++) {
                int monkeyMove = sc.nextInt();
                int monkeyGong = sc.nextInt();
                int Hp = sc.nextInt();

                int count = 0;
                while(brotherMove + monkeyMove < distance){
                    distance -= brotherMove;
                    count++;
                }
                int tmp = Hp /



            }



        }
    }
}
*/
