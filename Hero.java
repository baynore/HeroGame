
public class Hero {

    HeroState standing;
    HeroState jumping;
    HeroState diving;
    HeroState ducking;
    HeroState shield;
    HeroState dead;

    HeroState state = standing;
    String name;
    int credits;

    public Hero(String name) {
        
        this.name = name;
        credits = 3;
         
        standing = new StandingState(this);
        jumping = new JumpingState(this);
        diving = new DivingState(this);
        ducking = new DuckingState(this);
        shield = new ShieldState(this);
        dead = new DeadState(this);
    
    }
    
    public void setState(HeroState state) {
        this.state = state;
    }
    
    public HeroState getStandingState() {
        return standing;
    }
    
    public HeroState getJumpingState() {
        return jumping;
    }

    public HeroState getDivingState() {
        return diving;
    }

    public HeroState getDuckingState() {
        return ducking;
    }

    public HeroState getShieldState() {
        return shield;
    }

    public HeroState getDeadState() {
        return dead;
    }

    public void upArrowDepressed() {
        state.upArrowDepressed();        
    }

    public void upArrowReleased() {
        state.upArrowReleased();
    }
    
    public void downArrowDepressed() {
        state.downArrowDepressed();
    }

    public void downArrowReleased() {
        state.downArrowReleased();
    }

    public void escButtonPressed() {
        state.escButtonPressed();
    }

    public void hitByFire() {
        state.hitByFire();
    }

    public void hitByThrownObject() {
        state.hitByThrownObject();
    }

    public void hitByRolledObject() {
        state.hitByRolledObject();
    }

    //public Hero getHero() {
    //    return hero;
    //}
    
    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

}
