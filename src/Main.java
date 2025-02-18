import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Row :");
        int row = scanner.nextInt();
        System.out.println("Numlber of deats per row");
        int nbr = scanner.nextInt();

        CinemaHall cinemaHall = new CinemaHall(row,nbr);
        boolean keepGoing = true;
        while (keepGoing){
            System.out.println("-- Systeme de reservation de billets de cinema --");
            System.out.println("1. Available Seats ");
            System.out.println("2. Reserv Seat");
            System.out.println("3. Quitter ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1 :
                    cinemaHall.displaySeats();
                    break;
                case 2 :
                    System.out.println("Row ");
                    int row2 = scanner.nextInt();
                    System.out.println("Seat number ");
                    int nbrs = scanner.nextInt();
                    cinemaHall.reserveSeat(row,nbrs);
                    break;
                case 3:
                    keepGoing = false;
                    System.out.println(" Good Bye ");
                    break;
                default:
                    System.out.println("Choix Invalide ");
                    break;

            }
        }
        scanner.close();
    }
}
