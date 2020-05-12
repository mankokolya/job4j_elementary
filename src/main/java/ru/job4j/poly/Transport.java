package ru.job4j.poly;

public interface Transport {
    void move();
    void passengers(int passengersNumber);
    double fillTank(double fuelQuantity, double fuelPrice);
}
