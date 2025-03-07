
class Bycyle {

    int gear;
    int speed;

    public Bycyle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public Bycyle() {
        this.gear = 4;
        this.speed = 50;
    }

    public String toString() {
        return ("bike is in the gerar: " + gear + " and speed is: " + speed);
    }
}

class seatHeight extends Bycyle {

    int height;

    public seatHeight(int height, int gear, int speed) {
        this.height = height;
        super(gear, speed);
    }

    

    public seatHeight() {
    }

    @Override
    public String toString() {
        return (super.toString() + " \nAnd Height of the seat is : " + height);
    }

}

public class test {

    public static void main(String[] args) {
        seatHeight s = new seatHeight(12,3,6);
        System.out.println(s.toString());
    }
}
