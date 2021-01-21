
public class DivingState implements HeroState {

    Hero hero;
    
    public DivingState(Hero hero) {
    
        this.hero = hero;
    
    }

    public void upArrowDepressed() {}

    public void upArrowReleased() {
    
        System.out.println("You are now diving");
        hero.setState(hero.getDuckingState());
    
    }

    public void downArrowDepressed() {}

    public void downArrowReleased() {
    
        System.out.println("You are now jumping");
        hero.setState(hero.getJumpingState());
    
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
    
        System.out.println("You dodged a fire attack!");
    
    }

    public void hitByThrownObject() {
    
        System.out.println("You dodged a thrown object!");
    
    }

    public void hitByRolledObject() {
    
        System.out.println("Nice try, you died!");
        hero.setState(hero.getDeadState());

    }   

}
