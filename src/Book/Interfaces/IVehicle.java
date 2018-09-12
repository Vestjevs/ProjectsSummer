package Book.Interfaces;

public interface IVehicle {

    int range();

    double fuelneeded(int miles);

    int getPassengers();

    void setPassengers(int p);

    int getFuel();

    void setFuel(int f);

    int getMpg();

    void setMpg(int m);
}
