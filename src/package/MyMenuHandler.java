import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMenuHandler implements ActionListener {

    NotepadFrame notepadFrame;
    FileDialog opener = new FileDialog(notepadFrame,"Open");
    FileDialog saver = new FileDialog(notepadFrame,"Save");;

    public MyMenuHandler(NotepadFrame notepadFrame){
        this.notepadFrame=notepadFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String arg = e.getActionCommand();
        if(arg.equals("Открыть")){
            opener.setVisible(true);
        }
        if(arg.equals("Сохранить")){
            saver.setVisible(true);
        }
        if(arg.equals("Создать")){
            opener.setVisible(true);
        }
    }
}
