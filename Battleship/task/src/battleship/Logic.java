package battleship;

import java.util.Map;

public class Logic {

    Map map


    public static String ChecBotForPole(int[] x1y1x2y2, int long_bot, Pole pole) {
        int x1 = x1y1x2y2[0];
        int y1 = x1y1x2y2[1];
        int x2 = x1y1x2y2[2];
        int y2 = x1y1x2y2[3];
        if (x2 < x1) {
            x1 = x1 + x2;
            x2 = x1 - x2;
            x1 = x1 - x2;
        }
        if (y2 < y1) {
            y1 = y1 + y2;
            y2 = y1 - y2;
            y1 = y1 - y2;
        }
        //Проверка длины
        if (!(x2 - x1 == 0 & y2 - y1 == long_bot - 1) & !(x2 - x1 == long_bot - 1 & y2 - y1 == 0)) {
            return "Error! Wrong length of the Submarine! Try again:";
        }
        // Генератор координат коробля  и проверка занятости места
        if (x2 == x1) {
            int x = x1;
            for (int y = y1; y <= y2; y++) {
                if (x == 0) {
                    if (y == 0) {

                        System.out.print(String.format("Координаты %d  %d \n", x, y));
                    }
                }

                System.out.print(" Пустое \n");
            }
        }
        return "NORM";
    }
}

