
public class StandingState implements HeroState {

    Hero hero;
    
    public StandingState(Hero hero) {
    
        this.hero = hero;
    
    }

    public void upArrowDepressed() {
    
        System.out.println("You are now jumping");
        hero.setState(hero.getJumpingState());
    
    }

    public void upArrowReleased() {}

    public void downArrowDepressed() {
         
        System.out.println("You are now ducking");
        hero.setState(hero.getDuckingState());
    
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
    
        System.out.println("You died by fire!");
        hero.setState(hero.getDeadState());
    
    }

    public void hitByThrownObject() {
    
        System.out.println("You took an arrow to the knee!");
        hero.setState(hero.getDeadState());
    
    }

    public void hitByRolledObject() {
    
        System.out.println("You died by a rolled object!");
        hero.setState(hero.getDeadState());
    
    }

}
