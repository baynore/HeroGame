
public class ShieldState implements HeroState {

    Hero hero;
    
    public ShieldState(Hero hero) {
    
        this.hero = hero;
    
    }

    public void upArrowDepressed() {}

    public void upArrowReleased() {}

    public void downArrowDepressed() {}

    public void downArrowReleased() {}
    
    public void escButtonPressed() {}

    public void hitByFire() {
    
        System.out.println("You are now shielded");
        hero.setState(hero.getShieldState()); 
    }

    public void hitByThrownObject() {
    
        System.out.println("You are now shielded");
        hero.setState(hero.getShieldState());    
    }

    public void hitByRolledObject() {
        
        System.out.println("You are now shielded");
        hero.setState(hero.getShieldState());
    }

}
