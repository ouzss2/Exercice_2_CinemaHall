public class Seat {
    private int row;
    private int number ;
    private boolean isAvailable;


    public Seat(int row,int number){
        this.row = row;
        this.number = number;
        this.isAvailable = true;
    }

    public int getNumber() {
        return number;
    }

    public int getRow() {
        return row;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return isAvailable ? "[O]":"[X]";
    }
}
