
public class JumpingState implements HeroState {

    Hero hero;
    
    public JumpingState(Hero hero) {
    
        this.hero = hero;
    
    }

    public void upArrowDepressed() {}

    public void upArrowReleased() {
    
        System.out.println("You are now standing");
        hero.setState(hero.getStandingState());
    
    }

    public void downArrowDepressed() {
    
        System.out.println("You are now diving");
        hero.setState(hero.getDivingState());
    
    }

    public void downArrowReleased() {}
    
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
    
        System.out.println("You couldn't handle the heat. You died!");
        hero.setState(hero.getDeadState());
    
    }

    public void hitByThrownObject() {
    
        System.out.println("You died by a thrown object!");
        hero.setState(hero.getDeadState());
    
    }

    public void hitByRolledObject() {
        
        System.out.println("You jumped over a rolled object!");

    }

}
