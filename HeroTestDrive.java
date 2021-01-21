import java.lang.Thread;

public class HeroTestDrive {

    public static void main(String[] args) {
    
        Hero hero = new Hero("Alec");
        hero.setState(hero.getStandingState());

        System.out.println("Welcome to the world, " + hero.getName() + ". Good luck!");

        hero.downArrowDepressed();
        hero.downArrowReleased();
        hero.upArrowDepressed();
        hero.hitByRolledObject();
        hero.upArrowReleased();
        hero.upArrowDepressed();
        hero.downArrowDepressed();
        hero.hitByFire();
        hero.upArrowReleased();
        hero.downArrowReleased();
        hero.escButtonPressed();

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        hero.hitByFire();

    }

}
