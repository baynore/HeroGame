import java.lang.Thread;

public interface HeroState {
    
    //Hero hero;
    
    public void upArrowDepressed();
    public void upArrowReleased();
    public void downArrowDepressed();
    public void downArrowReleased();
    public void escButtonPressed();
    public void hitByFire();
    public void hitByThrownObject();
    public void hitByRolledObject();
    //public Hero getHero();

}
