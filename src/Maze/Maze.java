package Maze;

//Game's plan
//Board - Done
//-Setting up a board's size - Complete
//Board's file location - Complete
//-Setting board's file location, open , read and close - Complete
//Object - Complete
//--Putting sprites on the screen - Complete
//--Moving directions - Complete
//--Starting point - Complete
//Walls - Complete
//Walls blocking Object - Not Complete!
// Finish - Not Complete!
//- Reaches final destination and says You Win! - Not complete!


//-Codes what I didn't know:
// <- Video Tutorials ->
// Java Progremine algajatele -> https://www.youtube.com/playlist?list=PLWkgPad9kpY1Ns3Q23g1qAlE9vQbmpSKn
// Patrick WashingtonDC -> https://www.youtube.com/watch?v=3u1fu6f8Hto
// Java 2D Game Development Tutorials -> https://www.youtube.com/watch?v=A3PnnEUkZwo
// How to make a Java 2D Maze Game ->  https://www.youtube.com/watch?v=I4ZbXNh1XfM
// Java Maze Game Tutorial -> https://www.youtube.com/watch?v=64V8CC7nSok
// <- Specific Codes ->
// http://i200.itcollege.ee/
// www.java2s.com
// ImageIO: read(File Input) -> http://www.java2s.com/Code/JavaAPI/javax.imageio/ImageIOreadFileinput.htm
// ActionListener -> http://www.java2s.com/Code/JavaAPI/java.awt/implementsActionListener.htm



import Board.Board;
import javax.swing.*;

public class Maze {
    public static void main(String[] args){
        new Maze();
    }

    public Maze(){
        JFrame f = new JFrame();
        f.setTitle("Maze Game");
        f.add(new Board());
        f.setSize(464, 485);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

