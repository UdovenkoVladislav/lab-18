import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletFrame extends Applet implements ActionListener {

    Frame f;

    public void init(){

        f = new NotepadFrame("Notepad");
        f.setSize(460,240);
        f.setVisible(true);
    }

    public void start(){
        f.setVisible(true);
    }

    public void stop(){
        f.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}