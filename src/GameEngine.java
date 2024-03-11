
import java.util.Random;

public class GameEngine {
    public static String[][] updatePole(String[][] pole, char x, int y, String s){
        if(x >= 'A' && x <= 'C' && y >= 1 && y <= 3 ){
            int columnIndex = x - 'A';
            pole[y-1][columnIndex] = s;
        }
        return pole;
    }

    public static void vivodPolya(String[][] pole) {
        int rows = pole.length;
        int cols = pole[0].length;

        System.out.print("  ");
        for (int i = 0; i < cols; i++) {
            System.out.print((char) ('A' + i) + " ");
        }

        System.out.print("  ");
        for (int i = 0; i < cols; i++) {
            System.out.print("  ");
        }
        System.out.println();

        for (int i = 0; i < rows; i++) {
            System.out.print((i + 1) + "|");

            for (int j = 0; j < cols; j++) {
                if (pole[i][j] != null) {
                    System.out.print(pole[i][j] + " ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println("|");
        }

        System.out.print("  ");
        for (int i = 0; i < cols; i++) {
            System.out.print("  ");
        }
        System.out.println();
    }

    /*
    {  0{0 1 2}
       1{0 1 2}
       2{0 1 2}  }
     */
    public static boolean proverkaUsloviya(String[][] pole, String playerMark) {
        for (int i = 0; i < 3; i++) {
            if (pole[i][0] != null && pole[i][0].equals(playerMark) &&
                    pole[i][1] != null && pole[i][1].equals(playerMark) &&
                    pole[i][2] != null && pole[i][2].equals(playerMark)) {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (pole[0][i] != null && pole[0][i].equals(playerMark) &&
                    pole[1][i] != null && pole[1][i].equals(playerMark) &&
                    pole[2][i] != null && pole[2][i].equals(playerMark)) {
                return true;
            }
        }
        if (pole[0][0] != null && pole[0][0].equals(playerMark) &&
                pole[1][1] != null && pole[1][1].equals(playerMark) &&
                pole[2][2] != null && pole[2][2].equals(playerMark)) {
            return true;
        }
        if (pole[0][2] != null && pole[0][2].equals(playerMark) &&
                pole[1][1] != null && pole[1][1].equals(playerMark) &&
                pole[2][0] != null && pole[2][0].equals(playerMark)) {
            return true;
        }
        return false;
    }

    public static String[][] makeRandomMove(String[][] pole, String playerMark) {
        Random random = new Random();
        int x, y;

        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (pole[y][x] != null);

        pole[y][x] = playerMark;

        return pole;
    }

    public static boolean isBoardFull(String[][] pole) {
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[i].length; j++) {
                if (pole[i][j] == null) {
                    return false;
                }
            }
        }
        System.out.println(
                "╔════╗╔══╗╔═══╗\n" +
                "╚═╗╔═╝╚╗╔╝║╔══╝\n" +
                "──║║───║║─║╚══╗\n" +
                "──║║───║║─║╔══╝\n" +
                "──║║──╔╝╚╗║╚══╗\n" +
                "──╚╝──╚══╝╚═══╝");
        return true;
    }


}
