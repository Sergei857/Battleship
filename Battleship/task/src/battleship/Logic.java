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
            return ("Error! Wrong ship location! Try again:");
        }
        // Проверка длины коробля
        if (!(x2 - x1 == 0 & y2 - y1 == long_bot - 1) & !(x2 - x1 == long_bot - 1 & y2 - y1 == 0)) {
            return ("Error! Wrong length of the " + Bots.bots_list[i][0] + "! Try again:");
        }


        return "NORM";
    }
}




