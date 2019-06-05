import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyWindowAdapter extends WindowAdapter {

    NotepadFrame notepadFrame;

    public MyWindowAdapter(NotepadFrame notepadFrame) {
        this.notepadFrame = notepadFrame;
    }

    @Override
    public void windowClosing(WindowEvent e) {
        notepadFrame.dispose();
    }
}
