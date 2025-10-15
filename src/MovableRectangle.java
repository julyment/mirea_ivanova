public class MovableRectangle implements Movable{
    MovablePoint topleft;
    MovablePoint bottomright;

    public MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed){
        this.topleft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        this.bottomright = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topleft=" + topleft +
                ", bottomright=" + bottomright +
                '}';
    }

    @Override
    public void moveUp() {
        topleft.moveUp();
        bottomright.moveUp();
    }

    @Override
    public void moveDown() {
        topleft.moveDown();
        bottomright.moveDown();
    }

    @Override
    public void moveLeft() {
        topleft.moveLeft();
        bottomright.moveLeft();
    }

    @Override
    public void moveRight() {
        topleft.moveRight();
        bottomright.moveRight();
    }
}

