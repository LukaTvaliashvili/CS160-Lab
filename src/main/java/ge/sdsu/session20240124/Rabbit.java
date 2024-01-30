package ge.sdsu.session20240124;

public class Rabbit extends Animal {

    private boolean canJump;

    public Rabbit(boolean canJump){
        super(2, true, true);
        this.canJump = canJump;
    }

    @Override
    public String toString() {
        return "Rabbit{" +
                "canJump=" + canJump +
                '}';
    }

    public boolean isCanJump() {
        return canJump;
    }

    public void setCanJump(boolean canJump) {
        this.canJump = canJump;
    }

    public boolean lovesCarrot(){
        return true;
    }
}
