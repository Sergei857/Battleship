package battleship;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        Pole user_pole = new Pole(Pole.empty_pole);
        PrintPole.print_pole(user_pole);

        for (int i = 0; i <= Bots.bots_list.length; i++) {

            System.out.print("\n" + Bots.bots_list[i][0] + "\n");
            String str_coorinat = CoordinateInput();
            int[] x1y1x2y2 = Bots.CoordinatForInt(str_coorinat);
            System.out.print(Arrays.toString(x1y1x2y2) + "\n");
            String str_logic = Logic.ChecBotForPole(x1y1x2y2, Integer.parseInt(Bots.bots_list[i][1]));
            if (!str_logic.equals("0")) {
                System.out.print(str_logic + "\n");
                i--;
            }

        }PrintPole.print_pole(user_pole);
    }

    public static String CoordinateInput() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }
}
