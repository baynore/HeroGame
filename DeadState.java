
public class DeadState implements HeroState {

    Hero hero;
    
    public DeadState(Hero hero) {
    
        this.hero = hero;
    
    }

    public void upArrowDepressed() {
    
        System.out.println("You're dead!");
    
    }

    public void upArrowReleased() {
    
        System.out.println("You're dead!");
    
    }

    public void downArrowDepressed() {
    
        System.out.println("You're dead!");
    
    }

    public void downArrowReleased() {
    
        System.out.println("You're dead!");
    
    }
    
    public void escButtonPressed() {}

    public void hitByFire() {
    
        System.out.println("You're dead!");
    
    }

    public void hitByThrownObject() {
    
        System.out.println("You're dead!");
    
    }

    public void hitByRolledObject() {
    
        System.out.println("You're dead!");

    }

}
