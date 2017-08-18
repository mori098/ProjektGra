import java.util.Scanner;

public class Sklep {




    public void visitShop (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w sklepie!");

        String response = "";
    do {
            System.out.println("Wybierz co chcesz kupić: ");

        System.out.println("1 - Sword");
        System.out.println("2 - Wand");
        System.out.println("3 - Dagger");
        System.out.println("4 - HP pot");
        System.out.println("5 - Mana pot");

        response = scanner.nextLine();

        if(playerBagCapacity < weight){
            System.out.println("Nie możesz unieść tego przedmiotu!");

        }




    }

    }






