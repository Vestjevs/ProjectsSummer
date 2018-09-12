package Book.Implements;

public enum TrafficLightColor {
    RED(12000), GREEN(10000), YELLOW(2000);

    private int d;

    TrafficLightColor(int delay) {
        d = delay;
    }
    int getDelay(){
        return d;
    }


}
