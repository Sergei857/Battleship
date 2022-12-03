package battleship;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        Pole user_pole = new Pole(Pole.empty_pole);
        Pole tuman_pole = new Pole(Pole.tuman_pole);
        System.out.println("Player 1, place your ships to the game field\n");
        PrintPole.print_pole(user_pole);

        for (int i = 0; i <= Bots.bots_list.length - 1; i++) {

            System.out.print("\n" + "Enter the coordinates of the " + Bots.bots_list[i][0] + " (" + Bots.bots_list[i][1] + " cells):" + "\n\n");
            String str_coorinat = CoordinateInput();
            int[] x1y1x2y2 = Bots.CoordinatForInt(str_coorinat);
            //System.out.print(Arrays.toString(x1y1x2y2) + "\n");
            String str_logic = Logic.ChecBotForPole(x1y1x2y2, Integer.parseInt(Bots.bots_list[i][1]), user_pole, i);
            if (!str_logic.equals("0")) {
                System.out.print(str_logic + "\n");
                i--;
            } else {
                System.out.print("\n");
                PrintPole.print_pole(user_pole);
            }
        }
        System.out.println("\nPress Enter and pass the move to another player");
        String str_coorinat = CoordinateInput();
        String ster_enter = str_coorinat;

        System.out.println("Player 2, place your ships to the game field\n");


        Pole user_pole_p2 = new Pole(Pole.empty_pole_p2);
        Pole tuman_pole_p2 = new Pole(Pole.tuman_pole_p2);
        PrintPole.print_pole(user_pole_p2);

        for (int i = 0; i <= Bots.bots_list.length - 1; i++) {

            System.out.print("\n" + "Enter the coordinates of the " + Bots.bots_list[i][0] + " (" + Bots.bots_list[i][1] + " cells):" + "\n\n");
            String str_coorinat_p2 = CoordinateInput();
            int[] x1y1x2y2 = Bots.CoordinatForInt(str_coorinat_p2);
            //System.out.print(Arrays.toString(x1y1x2y2) + "\n");
            String str_logic = Logic.ChecBotForPole(x1y1x2y2, Integer.parseInt(Bots.bots_list[i][1]), user_pole_p2, i);
            if (!str_logic.equals("0")) {
                System.out.print(str_logic + "\n");
                i--;
            } else {
                System.out.print("\n");
                PrintPole.print_pole(user_pole_p2);
            }
        }

        System.out.println("\nPress Enter and pass the move to another player");
        String str_coorinat3 = CoordinateInput();


        //Pole tuman_pole = new Pole(Pole.empty_pole);
        //System.out.print("\nThe game starts!\n\n");


        //System.out.print("\n");
        StringBuilder str_O = new StringBuilder("");
        StringBuilder str_2 = new StringBuilder("");
        while (true) {
            PrintPole.print_pole(tuman_pole_p2);
            System.out.println("---------------------");
            PrintPole.print_pole(user_pole);
            System.out.print("\nPlayer 1, it's your turn:\n\n");
            String str_shot_coorinat = CoordinateInput();
            int[] xy_shot = Bots.CoordinatShot(str_shot_coorinat);
            if (xy_shot[0] != -1 & xy_shot[1] != -1) {
                if (user_pole_p2.getXYPole(xy_shot[1], xy_shot[0]) == '~') {
                    user_pole_p2.setCoorditat(xy_shot[1], xy_shot[0], 'M');
                    tuman_pole_p2.setCoorditat(xy_shot[1], xy_shot[0], 'M');
                    //System.out.print("\n");
                    //PrintPole.print_pole(tuman_pole_p2);
                    System.out.print("\nYou missed.");
                    //PrintPole.print_pole(user_pole);

                } else if (user_pole_p2.getXYPole(xy_shot[1], xy_shot[0]) == 'O' | user_pole_p2.getXYPole(xy_shot[1], xy_shot[0]) == 'X') {
                    user_pole_p2.setCoorditat(xy_shot[1], xy_shot[0], 'X');
                    tuman_pole_p2.setCoorditat(xy_shot[1], xy_shot[0], 'X');
                    System.out.print("\n");
                    //PrintPole.print_pole(tuman_pole);
                    System.out.print("You hit a ship!");
                    System.out.print("You sank a ship!");
                    //PrintPole.print_pole(user_pole);
                    System.out.print("\n");


                }
                str_O = new StringBuilder("");
                for (int k = 0; k <= 9; k++) {
                    for (int n = 0; n <= 9; n++) {
                        str_O.append(user_pole_p2.getXYPole(k, n));

                    }
                }
                //System.out.print(str_O);
                if (!str_O.toString().contains("O")) {
                    System.out.print("You sank the last ship. You won. Congratulations!");
                    break;
                }

                System.out.println("Press Enter and pass the move to another player");
                String str_coorinat_5 = CoordinateInput();


                PrintPole.print_pole(tuman_pole);
                System.out.println("---------------------");
                PrintPole.print_pole(user_pole_p2);
                System.out.print("\nPlayer 2, it's your turn:\n\n");
                String str_shot_coorinat_2 = CoordinateInput();
                int[] xy_shot_2 = Bots.CoordinatShot(str_shot_coorinat_2);
                if (xy_shot_2[0] != -1 & xy_shot_2[1] != -1) {
                    if (user_pole.getXYPole(xy_shot_2[1], xy_shot_2[0]) == '~') {
                        user_pole.setCoorditat(xy_shot_2[1], xy_shot_2[0], 'M');
                        tuman_pole.setCoorditat(xy_shot_2[1], xy_shot_2[0], 'M');
                        //System.out.print("\n");
                        //PrintPole.print_pole(tuman_pole_p2);
                        System.out.print("\nYou missed.");
                        //PrintPole.print_pole(user_pole_p2);

                    } else if (user_pole.getXYPole(xy_shot_2[1], xy_shot_2[0]) == 'O' | user_pole.getXYPole(xy_shot_2[1], xy_shot_2[0]) == 'X') {
                        user_pole.setCoorditat(xy_shot_2[1], xy_shot_2[0], 'X');
                        tuman_pole.setCoorditat(xy_shot_2[1], xy_shot_2[0], 'X');
                        System.out.print("\n");
                        //PrintPole.print_pole(tuman_pole);
                        System.out.print("You hit a ship!");
                        System.out.print("You sank a ship!");
                        //PrintPole.print_pole(user_pole);
                        System.out.print("\n");


                    }
                    str_2 = new StringBuilder("");
                    for (int k = 0; k <= 9; k++) {
                        for (int n = 0; n <= 9; n++) {
                            str_2.append(user_pole.getXYPole(k, n));

                        }
                    }
                    //System.out.print(str_O);
                    if (!str_2.toString().contains("O")) {
                        System.out.print("You sank the last ship. You won. Congratulations!");
                        break;
                    }
                    System.out.println("Press Enter and pass the move to another player");
                    String str_coorinat_6 = CoordinateInput();

                }
            }
        }
    }

    public static String CoordinateInput() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }
}
