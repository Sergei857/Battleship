package battleship;

public class Bots {

    public static String[][] bots_list =
            {
                    {"Enter the coordinates of the Aircraft Carrier (5 cells):", "5"},
                    {"Enter the coordinates of the Battleship (4 cells):", "4"},
                    {"Enter the coordinates of the Submarine (3 cells):", "3"},
                    {"Enter the coordinates of the Cruiser (3 cells):", "3"},
                    {"Enter the coordinates of the Destroyer (2 cells):", "2"}
            };


    public static int[] CoordinatForInt(String str) throws Exception {
        try {
            int[] xy = new int[4];
            String[] str_xy = str.split(" ");

            switch (str_xy[0].charAt(0)) {
                case 'A' -> xy[0] = 0;
                case 'B' -> xy[0] = 1;
                case 'C' -> xy[0] = 2;
                case 'D' -> xy[0] = 3;
                case 'E' -> xy[0] = 4;
                case 'F' -> xy[0] = 5;
                case 'G' -> xy[0] = 6;
                case 'H' -> xy[0] = 7;
                case 'I' -> xy[0] = 8;
                case 'J' -> xy[0] = 9;
            }
            xy[1] = Integer.parseInt(String.valueOf(new StringBuffer(str_xy[0]).deleteCharAt(0)));
            switch (str_xy[1].charAt(0)) {
                case 'A' -> xy[2] = 0;
                case 'B' -> xy[2] = 1;
                case 'C' -> xy[2] = 2;
                case 'D' -> xy[2] = 3;
                case 'E' -> xy[2] = 4;
                case 'F' -> xy[2] = 5;
                case 'G' -> xy[2] = 6;
                case 'H' -> xy[2] = 7;
                case 'I' -> xy[2] = 8;
                case 'J' -> xy[2] = 9;
            }
            xy[3] = Integer.parseInt(String.valueOf(new StringBuffer(str_xy[1]).deleteCharAt(0)));
            return xy;
        } catch (Exception e) {
            throw new Exception(e);
        }

    }
}


