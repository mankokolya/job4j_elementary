package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void move() {
        System.out.println("Bus is moving");
    }

    @Override
    public void passengers(int passengersNumber) {
        System.out.println("There is(are) " + passengersNumber + " passenger(s) in the bus!");
    }

    @Override
    public double fillTank(double fuelQuantity, double fuelPrice) {
        return fuelQuantity * fuelPrice;
    }

    public static void main(String[] args) {
        Bus number1 = new Bus();
        number1.move();
        number1.passengers(34);
        System.out.println(number1.fillTank(50.5, 1.84) + "$");
    }
}
