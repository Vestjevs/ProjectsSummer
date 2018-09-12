package SimpleGames;

public interface GUIElement {

    int getWidth();

    int getHeight();

    int getX();

    int getY();

    Sprite getSprite(); //

    int receiveClick(int x, int y, int button);

    default boolean isHit(int xClick, int yClick) {
        return ( (xClick > getX()) && (xClick < getX() + this.getWidth()) )
                && ( (yClick > getY()) && (yClick < getY() + this.getHeight()) );
    }

}
