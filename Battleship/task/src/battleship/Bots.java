package battleship;

public class Bots {

    public static String[][] bots_list =
            {
                    {"Aircraft Carrier", "5"},
                    {"Battleship", "4"},
                    {"Submarine", "3"},
                    {"Cruiser", "3"},
                    {"Destroyer", "2"}
            };


    public static int[] CoordinatForInt(String str) throws Exception {
        try {
            int[] xy = new int[4];
            String[] str_xy = str.split(" ");

            switch (str_xy[0].charAt(0)) {
                case 'A' -> xy[1] = 0;
                case 'B' -> xy[1] = 1;
                case 'C' -> xy[1] = 2;
                case 'D' -> xy[1] = 3;
                case 'E' -> xy[1] = 4;
                case 'F' -> xy[1] = 5;
                case 'G' -> xy[1] = 6;
                case 'H' -> xy[1] = 7;
                case 'I' -> xy[1] = 8;
                case 'J' -> xy[1] = 9;
            }
            xy[0] = Integer.parseInt(String.valueOf(new StringBuffer(str_xy[0]).deleteCharAt(0))) - 1;
            switch (str_xy[1].charAt(0)) {
                case 'A' -> xy[3] = 0;
                case 'B' -> xy[3] = 1;
                case 'C' -> xy[3] = 2;
                case 'D' -> xy[3] = 3;
                case 'E' -> xy[3] = 4;
                case 'F' -> xy[3] = 5;
                case 'G' -> xy[3] = 6;
                case 'H' -> xy[3] = 7;
                case 'I' -> xy[3] = 8;
                case 'J' -> xy[3] = 9;
            }
            xy[2] = Integer.parseInt(String.valueOf(new StringBuffer(str_xy[1]).deleteCharAt(0))) - 1;
            return xy;
        } catch (Exception e) {
            throw new Exception(e);
        }

    }

    public static int[] CoordinatShot(String str) throws Exception {
        try {
            int[] shot = {-1, -1};

            switch (str.charAt(0)) {
                case 'A' -> shot[1] = 0;
                case 'B' -> shot[1] = 1;
                case 'C' -> shot[1] = 2;
                case 'D' -> shot[1] = 3;
                case 'E' -> shot[1] = 4;
                case 'F' -> shot[1] = 5;
                case 'G' -> shot[1] = 6;
                case 'H' -> shot[1] = 7;
                case 'I' -> shot[1] = 8;
                case 'J' -> shot[1] = 9;

            }
            shot[0] = Integer.parseInt(String.valueOf(new StringBuffer(str).deleteCharAt(0))) - 1;
            if (shot[0] > 9) {
                shot[0] = -1;
            }

            return shot;
        } catch (Exception e) {
            throw new Exception(e);
        }

    }


}


