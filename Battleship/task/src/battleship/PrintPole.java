package battleship;

public class PrintPole {

    static String let_of_line = "ABCDEFGHIJ";
    public static void print_pole(Pole pole_for_print) {
        System.out.print("  1 2 3 4 5 6 7 8 9 10");
        for (int ch_line = 0; ch_line <= 9; ch_line++) {
            Character[] char_line = pole_for_print.pole[ch_line];
            System.out.print("\n");
            System.out.print(let_of_line.charAt(ch_line));
            for (char ch_one : char_line) {
                System.out.print(" " + ch_one);
            }
        }
        System.out.print("\n");
    }
}
