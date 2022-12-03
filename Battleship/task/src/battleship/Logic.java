package battleship;

import java.util.Map;

public class Logic {

    public static String ChecBotForPole(int[] x1y1x2y2, int long_bot, Pole pole, int i) {
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
        // Проверка линейности коробля
        if (x1 != x2 & y1 != y2) {
            return ("\nError! Wrong ship location! Try again:");
        }
        // Проверка длины коробля
        if ((x2 - x1 == 0 & y2 - y1 == long_bot - 1) | (x2 - x1 == long_bot - 1 & y2 - y1 == 0)) {
            // Проверка занятости на поле
            if ((x1 == x2 & pole.getXYPole(y1 - 1, x1) == '~' & pole.getXYPole(y2 + 1, x1) == '~')) {
                for (int k = y1; k <= y2; k++) {
                    if (pole.getXYPole(k, x2) == '~' & pole.getXYPole(k, x2 + 1) == '~' & (pole.getXYPole(k, x2 - 1) == '~')) {
                        pole.setCoorditat(k, x2, 'O');
                    } else {
                        return "\nError! You placed it too close to another one. Try again:";
                    }
                }
            } else if ((y1 == y2 & pole.getXYPole(y1, x1 - 1) == '~' & pole.getXYPole(y2, x2 + 1) == '~')) {
                for (int k = x1; k <= x2; k++) {
                    if (pole.getXYPole(y2, k) == '~' & pole.getXYPole(y2 + 1, k) == '~' & (pole.getXYPole(y2 - 1, k) == '~')) {
                        pole.setCoorditat(y2, k, 'O');
                    } else {
                        return "\nError! You placed it too close to another one. Try again:";
                    }
                }
            } else {
                return "\nError! You placed it too close to another one. Try again:";
            }
            return "0";

        } else return ("\nError! Wrong length of the " + Bots.bots_list[i][0] + "! Try again:");


    }
}




