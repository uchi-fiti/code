package listener;
import java.awt.event.*;
import java.util.EventListener;

import defilante.*;

public class FaritraListener implements ActionListener{
    ListeFaritra Faritra;
    ListeDistrict district;
    public FaritraListener(ListeFaritra fa ,ListeDistrict dt){
            Faritra = fa;
            district = dt; 
    }
        @Override
        public void actionPerformed(ActionEvent e) {
             String f = (String) Faritra.getSelectedItem();
             district.update(f);
        }
}