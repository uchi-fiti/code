package listener;
import java.awt.event.*;
import java.util.EventListener;

import defilante.*;

public class FaritanyListener implements ActionListener{
    ListeFaritany faritany;
    ListeFaritra faritra;
    public FaritanyListener(ListeFaritany fn ,ListeFaritra fr){
            faritany = fn;
            faritra = fr; 
    }
        @Override
        public void actionPerformed(ActionEvent e){
             String f = (String) faritany.getSelectedItem();
             faritra.update(f);
        }
}
