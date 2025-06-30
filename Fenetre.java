package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import defilante.ListeDistrict;
import defilante.ListeFaritany;
import defilante.ListeFaritra;
import listener.FaritanyListener;
import listener.FaritraListener;

public class Fenetre extends JFrame{
     public Fenetre(){
         setSize(700,700);
         setTitle("component");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
            JPanel p = new JPanel(); 
            ListeFaritany faritany = new ListeFaritany();
            ListeFaritra faritra = new ListeFaritra(faritany);
            faritany.addActionListener(new FaritanyListener(faritany,faritra));
            ListeDistrict district = new ListeDistrict(faritra);
            faritra.addActionListener(new FaritraListener(faritra, district));
            add(faritany);
            add(faritra);
            add(district);
            add(p);
            setVisible(true);
     }
}
