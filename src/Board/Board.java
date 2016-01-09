package Board;

import Map.Map;
import Player.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board extends JPanel implements ActionListener {

    private Timer timer;

    private Map m;
    private Player p;


    public Board(){

        m = new Map();
        p = new Player();
        addKeyListener(new Al());
        setFocusable(true);
        timer = new Timer(25, this);
        timer.start();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
    public void paint(Graphics graphics) {
        super.paint(graphics);
    //-First test subject for Player image
        graphics.setColor(Color.black);
        graphics.fillRect(45, 60, 32, 32);

        for (int y = 0; y < 14; y++) {
            for (int x = 0; x < 14; x++) {
                if (m.getMap(x, y).equals("g")) {
                    graphics.drawImage(m.getgrass(), x * 32, y * 32, null);
                }
                if (m.getMap(x, y).equals("w")) {
                    graphics.drawImage(m.getwall(), x * 32, y * 32, null);
                }
            }
        }

        graphics.drawImage(p.getPlayer(), p.getX(), p.getY(), null);
    }
    //-> Gives player object ability to move (Al = ActionListener)
    public class Al extends KeyAdapter{

        public void keyPressed(KeyEvent e){
            int keycode = e.getKeyCode();

            if(keycode == KeyEvent.VK_A){
                p.move(0, -32, 0, -1);
            }
            if(keycode == KeyEvent.VK_D){
                p.move(0, 32, 0, 1);
            }
            if(keycode == KeyEvent.VK_W){
                p.move(-32, 0, -1, 0);
            }
            if(keycode == KeyEvent.VK_S){
                p.move(32, 0, 32, 0);
            }
        }


        public void keyReleased(KeyEvent e){

        }
}}