public interface Fly {

    /**
     * the animal take Off
     */
    void takeOff();

    /**
     * the animal ascend in the air
     */
    int ascend(int meters);

    /**
     * the animal descend
     */
    int descend(int meters);

    void land ();

    default void glide() {
        
        System.out.println("It glides into the air.");
  
    }
}