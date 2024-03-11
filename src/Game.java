import java.util.Scanner;

public class Game {
    public static void game(){
        Scanner scan = new Scanner(System.in);
        String[][] arrForGame = new String[3][3];
        boolean checker2 = false;
        int i = 1;
        while (!checker2) {
            GameEngine.vivodPolya(arrForGame);
            if (i % 2 != 0) {
                System.out.print("Type coordinate(for example, A2): ");
                String input = scan.nextLine();
                if (input.length() == 2) {
                    char x = input.charAt(0);
                    int y = Character.getNumericValue(input.charAt(1));
                    GameEngine.updatePole(arrForGame, x, y, "X");
                    i++;
                    checker2 = GameEngine.proverkaUsloviya(arrForGame, "X");
                    if (checker2) break;
                } else {
                    System.out.println("Wrong format.");
                }
            } else {
                GameEngine.makeRandomMove(arrForGame, "O");
                i++;
                checker2 = GameEngine.proverkaUsloviya(arrForGame, "O");
                if (checker2) break;

            }

            checker2 = GameEngine.isBoardFull(arrForGame);

        }
        if(!GameEngine.isBoardFull(arrForGame)){
            if(i % 2 == 0){
                GameEngine.vivodPolya(arrForGame);
                System.out.println(
                        "╔╗╔╗╔══╗╔╗╔╗───╔╗╔╗╔╗╔══╗╔╗─╔╗\n" +
                        "║║║║║╔╗║║║║║───║║║║║║╚╗╔╝║╚═╝║\n" +
                        "║╚╝║║║║║║║║║───║║║║║║─║║─║╔╗─║\n" +
                        "╚═╗║║║║║║║║║───║║║║║║─║║─║║╚╗║\n" +
                        "─╔╝║║╚╝║║╚╝║───║╚╝╚╝║╔╝╚╗║║─║║\n" +
                        "─╚═╝╚══╝╚══╝───╚═╝╚═╝╚══╝╚╝─╚╝\n");
            }
            else{
                GameEngine.vivodPolya(arrForGame);
                System.out.println(
                        "╔╗╔╗╔══╗╔╗╔╗───╔╗──╔══╗╔══╗╔═══╗\n" +
                        "║║║║║╔╗║║║║║───║║──║╔╗║║╔═╝║╔══╝\n" +
                        "║╚╝║║║║║║║║║───║║──║║║║║╚═╗║╚══╗\n" +
                        "╚═╗║║║║║║║║║───║║──║║║║╚═╗║║╔══╝\n" +
                        "─╔╝║║╚╝║║╚╝║───║╚═╗║╚╝║╔═╝║║╚══╗\n" +
                        "─╚═╝╚══╝╚══╝───╚══╝╚══╝╚══╝╚═══╝\n");
            }
        }
    }
}
