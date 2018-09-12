package Book.Implements;

public enum Transport {
    CAR(65, 4), TRUCK(55, 3), AIRPLANE(600, 100), TRAIN(70, 300), BOAT(22, 10), WALKER,
    MOONWALKER(50);

    private int speed;
    private int passangers;

    Transport(int s, int p) {
        speed = s;
        passangers = p;
    }

    Transport(int k) {

    }

    Transport() {

    }

    int getSpeed() {
        return speed;
    }

    public int getPassangers() {
        return passangers;
    }
}
