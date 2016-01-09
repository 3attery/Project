package Player;

import javax.swing.*;
import java.awt.*;

public class Player {
    private int x, y, tileX, tileY;

    private Image Player;
//-Player method, giving its coordinates and movement
    public Player(){

        ImageIcon img = new ImageIcon("C://Users//Martin//IdeaProjects//Maze//src//player.png");
        Player = img.getImage();
        x = 32;
        y = 32;

        tileX = 1;
        tileY = 1;
    }

    public Image getPlayer(){
        return Player;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int gettileX(){
        return tileX;
    }
    public int gettileY(){
        return tileY;
    }


    public void move(int dx, int dy, int tx, int ty){

        y += dx;
        x += dy;

        tileX += tx;
        tileY += ty;

    }
}
