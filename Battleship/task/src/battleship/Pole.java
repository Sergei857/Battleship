package battleship;

import java.lang.reflect.Array;

public class Pole {
    public void setPole(Character[][] pole) {
        this.pole = pole;
    }

    public Character getXYPole(int x,int y) {
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

    public Character[][] pole = new Character[9][9];

    public Pole(Character[][] pole) {
        this.pole = pole;
    }
}
