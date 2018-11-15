public abstract class Robot {

    public Robot(int x, int y, boolean lightLover) {
        position = Position(x, y);
    }

    public void move(int x, int y) {
        position.x += x;
        position.y += y;
    }

    public position getPosition() {
        return null;
    }

    public void refuel();

    private int fuel = 25;

    private boolean lightLover;

    private position = Position(0, 0);

}
