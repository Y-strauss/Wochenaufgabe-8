public class Racecar {
    private double speed;
    private double distance;

    public Racecar() {
        speed = 0.0;
        distance = 0.0;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDistance() {
        return distance;
    }

    public void accelerate(double speedDelta) {
        
        if (speedDelta > 0) {
            speed += speedDelta;
        }
    }

    public void decelerate(double speedDelta) {
        if (speedDelta > 0) {
            if (speed - speedDelta < 0) {
                speed = 0;
            } 
            else {
                speed -= speedDelta;
        }
        }
    }

     public void drive(double seconds) {
        if (seconds > 0) {
            distance += speed * seconds;
        }
}
    public String toString() {
        return "Speed: " + speed + "m/s, Distance: " + distance + "m";
 }
}




