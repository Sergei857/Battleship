package battleship;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        Pole user_pole = new Pole(Pole.empty_pole);
        PrintPole.print_pole(user_pole); // Создание пустого поля
        for (int i = 0; i <= Bots.bots_list.length; i++) {
            System.out.print("\n" + Bots.bots_list[i][0] + "\n");
            String str_coorinat = CoordinateInput();
            //System.out.print(str_coorinat);

            try {
                System.out.print(Arrays.toString(Bots.CoordinatForInt(str_coorinat)));

            } catch (Exception e) {
                System.out.print("Error! :\n");
                i--;
            }

        }
    }

    public static String CoordinateInput() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }
}
