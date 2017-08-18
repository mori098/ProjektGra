import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        System.out.println("Witaj w grze!");
        Scanner scanner = new Scanner(System.in);


        String user;
        System.out.println("Wybierz postać którą chcesz być: ");


        System.out.println("1 - Warrior");
        System.out.println("2 - Elf");
        System.out.println("3 - Magus");

        user = scanner.nextLine();

        System.out.print("Wybrałeś postać: " + user);

        String response = "";

        System.out.println();

        do {
            System.out.println("Powiedz co chcesz zrobić: ");

            System.out.println("1 - wejdź do gry");
            System.out.println("2 - idź do sklepu");
            System.out.println("3 - ");


            response = scanner.nextLine();

            switch (response){
                case "1":{

                }
                case "2":{

                }
                case "3":{


                }


            }






        }while (!response.equals("Wyjście"));









    }
}
