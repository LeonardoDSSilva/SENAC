
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class App extends JPanel {

    public App(){

        JFrame frame = new JFrame("App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(this);
        frame.setVisible(true);

        this.setFocusable(true);
        this.requestFocusInWindow();
        this.setBackground(Color.lightGray);

        JButton button = new JButton("Clique aqui");
        button.setBounds(10, 10, 100, 25);
        button.setBackground(Color.GREEN);

        button.addActionListener((e) -> {
            if (this.getBackground() == Color.YELLOW)
                this.setBackground(Color.RED);
            else
                this.setBackground(Color.YELLOW);
        });
        this.add(button);
    }

    public static void main(String[] args) throws Exception {
        new App();
    }

    @Override
    public void paintComponent(java.awt.Graphics g){
        int width = getWidth();
        int height = getHeight();

        super.paintComponent(g);
        g.setColor(Color.CYAN);
        g.fillRect((width/2)-50, (height/2)-50, 100, 100);
        
        g.setColor(Color.BLACK);
        g.drawString("POO", width/2, height/2);

    }
}
