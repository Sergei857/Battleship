package battleship;

import java.lang.reflect.Array;

public class Pole {
    public void setPole(Character[][] pole) {
        this.pole = pole;
    }

    public void setCoorditat(int x, int y, char ch) {
        this.pole[x][y] = ch;
    }


    public Character getXYPole(int x, int y) {
        if (x < 0 | y < 0 | x > 9 | y > 9) return '~';
        return pole[x][y];
    }

    public static Character[][] empty_pole =
            {
                    {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~',},
                    {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~',},
                    {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~',},
                    {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~',},
                    {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~',},
                    {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~',},
                    {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~',},
                    {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~',},
                    {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~',},
                    {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~',},
            };
    public static Character[][] tuman_pole =
            {
                    {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~',},
                    {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~',},
                    {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~',},
                    {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~',},
                    {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~',},
                    {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~',},
                    {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~',},
                    {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~',},
                    {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~',},
                    {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~',},
            };


    public Character[][] pole = new Character[9][9];

    public Pole(Character[][] pole) {
        this.pole = pole;
    }
}
