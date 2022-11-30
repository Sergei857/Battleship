package battleship;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        Pole user_pole = new Pole(Pole.empty_pole);
        PrintPole.print_pole(user_pole); // Создание пустого поля
        for (String[] bot_for_input : Bots.bots_list) {
            System.out.print("\n" + bot_for_input[0] + "\n");
        }
    }

    public static void String() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder(reader.readLine());
        System.out.println(stringBuilder.reverse());
        reader.close();
    }
}
