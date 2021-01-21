
public class DuckingState implements HeroState {

    Hero hero;
    
    public DuckingState(Hero hero) {
    
        this.hero = hero;
    
    }

    public void upArrowDepressed() {
    
        System.out.println("You are now diving");
        hero.setState(hero.getDivingState());
    
    }

    public void upArrowReleased() {}

    public void downArrowDepressed() {}

    public void downArrowReleased() {
    
        System.out.println("You are now standing");
        hero.setState(hero.getStandingState());
    
    }
    
    public void escButtonPressed() {
    
	if (hero.getCredits() > 0) {
            hero.setState(hero.getShieldState());
            hero.setCredits(hero.getCredits() - 1);

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
               Thread.currentThread().interrupt(); 
            }
        
        }
        else
            System.out.println("You are out of shield credits!");
    
    }

    public void hitByFire() {
    
        System.out.println("You died by fire!");
        hero.setState(hero.getDeadState());
    
    }

    public void hitByThrownObject() {
    
        System.out.println("You dodged a thrown object!");
    
    }

    public void hitByRolledObject() {
    
        System.out.println("You rolled over and died!");
        hero.setState(hero.getDeadState());

    }

}
