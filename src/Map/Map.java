package Map;

import javax.swing.ImageIcon;
import java.io.File;
import java.util.Scanner;

public class Map {

    private Scanner m;
    private String Map[] = new String[14];

    private java.awt.Image grass;
    private java.awt.Image wall;
//-method images and File reading
    public Map(){

        ImageIcon img = new ImageIcon("C://Users//Martin//IdeaProjects//Maze//src//grass.png");
        grass = img.getImage();
        img = new ImageIcon("C://Users//Martin//IdeaProjects//Maze//src//wall.png");
        wall = img.getImage();
        openFile();
        readFile();
        closeFile();
    }
//-takes image grass and inserts it
    public java.awt.Image getgrass(){
        return grass;
//-takes image wall and inserts it
    }
    public java.awt.Image getwall(){
        return wall;
    }
//-takes Map's size [14] width and length and inserts the coordinate
    public String getMap(int x, int y){
        String index = Map[y].substring(x, x + 1);
        return index;
    }
//-open File command, read File command & close File command
    public void openFile(){

        try{
            m = new Scanner(new File("C://Users//Martin//IdeaProjects//Maze/src//Map.txt"));
        }catch(Exception e){
            System.out.println("error loading map");
        }
    }
    public void readFile(){
        while(m.hasNext()){
            for (int i = 0; i < 14 ; i++) {
                Map[i] = m.next();
            }

            }
        }
    public void closeFile(){
        m.close();
    }


}

