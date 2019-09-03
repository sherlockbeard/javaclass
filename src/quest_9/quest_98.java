package quest_9;



public class quest_98 {
    final static int SLOW =1;
    final static int MEDIUM=2;
    final static int FAST=3;

    public static void main(String[] args) {
     Fan f1 = new Fan(FAST,true,10,"yellow");
     Fan f2 = new Fan(MEDIUM,true,5,"Blue");

     f1.toString();
     f2.toString();

    }
    static class Fan {
        private int speed;
        private boolean on;
        private double radius;
        String colour;

        Fan() {
            speed = SLOW;
            on = false;
            radius = 5;
            colour = "blue";
        }

        public Fan(int speed, boolean on, double radius, String colour) {
            this.speed = speed;
            this.on = on;
            this.radius = radius;
            this.colour = colour;
        }

        public int getSpeed() {
            return speed;
        }

        public boolean isOn() {
            return on;
        }

        public double getRadius() {
            return radius;
        }

        public String getColour() {
            return colour;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public void setOn(boolean on) {
            this.on = on;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public void setColour(String colour) {
            this.colour = colour;
        }

        public String toString() {
            if (on == false) {
                System.out.println("fan is not on");
            } else {
                System.out.println("fan speed " + getSpeed() + " fan radius " + getRadius() + " fan colour " + getColour());
            }
            return null;
        }
    }
    }
