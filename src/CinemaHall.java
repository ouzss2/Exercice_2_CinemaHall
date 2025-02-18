public class CinemaHall {

    private Seat seats[][];

    public CinemaHall(int row , int seatperRw){
        seats = new Seat[row][seatperRw];
        for (int i =0;i< row;i++){
            for (int j = 0;j<seatperRw;j++){
                seats[i][j] = new Seat(i+1,j+1);
            }
        }
    }

    public void displaySeats(){
        System.out.println("Etat Actuelle :");
        for (int i=0;i< seats.length;i++){
            for (int j =0;j< seats[i].length;j++){
                System.out.print(seats[i][j] +" seat number"+i+j) ;
            }
            System.out.println();
        }
    }

    public boolean reserveSeat(int row,int nbr){
        if (row <=0 || row > seats.length || nbr <= 0 || nbr > seats[0].length){
            System.out.println("Numero invalide ");
            return  false;
        }

        if (seats[row -1 ][nbr -1 ].isAvailable()){
            seats[row -1  ][nbr -1 ].setAvailable(false);
            System.out.println("Reservation reussie ");
            return true;
        }else {
            System.out.println("Seat deja reserve ");
            return false;
        }
    }

}
