public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    /**
     * the animal take Off
     */
    public void takeOff() {
        System.out.println("I BELIEVE I CAN FLYYY");
    }

    /**
     * the animal ascend in the air
     */
    public int ascend(int meters) {
        System.out.println("Let's down !");
        this.altitude = this.altitude + meters;
        System.out.println("I'm now at " + meters + " meters");
        return meters;
    }

    /**
     * the animal descend
     */
    public int descend(int meters) {
        System.out.println("Let's down !");
        this.altitude = this.altitude - meters;
        System.out.println("I'm now at " + meters + " meters");
        return meters;
    }

    public void land () {

        if (this.altitude <= 5 ) {
            System.out.println("Home sweet home !");
            this.altitude = 0;
        } else {
            System.out.println("I cannot land right now ! I'm too high");
        }

        
    }

}
