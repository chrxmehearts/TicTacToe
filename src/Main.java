import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean checker = false;
        while(!checker){
            System.out.print("Type /start to start game: ");
            String s = scan.nextLine();
            if(s.equals("/start")){
                checker = true;
            }
        }
        System.out.println(
                "╔══╗╔════╗╔══╗╔═══╗╔════╗\n" +
                "║╔═╝╚═╗╔═╝║╔╗║║╔═╗║╚═╗╔═╝\n" +
                "║╚═╗──║║──║╚╝║║╚═╝║──║║\n" +
                "╚═╗║──║║──║╔╗║║╔╗╔╝──║║\n" +
                "╔═╝║──║║──║║║║║║║║───║║\n" +
                "╚══╝──╚╝──╚╝╚╝╚╝╚╝───╚╝");
        boolean flag = true;
        while(flag) {
            Game.game();
            System.out.println("Type /restart to restart game or ENTER to close");
            String s = scan.nextLine();
            if(s.equals("/restart")) {
                flag = true;
            } else {
                flag = false;
            }
        }
        System.out.println(
                "███████████████████████████████████████\n" +
                "█────█────█────█────██────██──█──█───█\n" +
                "█─████─██─█─██─█─██──█─██──██───██─███\n" +
                "█─█──█─██─█─██─█─██──█────████─███───█\n" +
                "█─██─█─██─█─██─█─██──█─██──███─███─███\n" +
                "█────█────█────█────██────████─███───█\n" +
                "███████████████████████████████████████");

    }
}
