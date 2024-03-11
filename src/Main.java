import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean checker = false;
        while(!checker){
            System.out.print("Для початку гри введіть /start: ");
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
            System.out.println("Напишіть /restart для рестарту гри, щоб закрити натисніть ENTER");
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
