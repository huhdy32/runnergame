package runnergame.src;

public class MoveForward implements Mover{

    private User user;

    public MoveForward(User user) {
        this.user = user;
    }

    @Override
    public int[] position() {

        return new int[0];
    }
}
