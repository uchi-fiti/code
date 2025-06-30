package defilante;
// import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JComboBox;

import model.Faritany;

public class ListeFaritany extends JComboBox<String> {
    ArrayList<Faritany> faritany = new ArrayList<>();
    
        public ListeFaritany(){
                //  super();
                 this.setBounds(150,20,100,20);
                 setItems();
        }
        public ArrayList<Faritany> getFaritany(){
             return faritany;
        }
        public void setItems(){
             setFaritany("../data/faritany.txt");
              for(Faritany item : faritany)
              {
                  this.addItem(item.getNom());
              }
              setSelectedIndex(0);
        }
        public void setFaritany(String datafile){
            try {
                BufferedReader reader = new BufferedReader(new FileReader(datafile));
                // System.out.println(reader.ready());
                String faritany;
                          while( (faritany=reader.readLine())!=null){
                           String[] f = faritany.split("\n");
                               for(String bloc : f) {
                                    this.faritany.add(new Faritany(bloc));           
                         }
                        }

                     reader.close();              
            } catch (Exception e) {
                e.printStackTrace();
            }
        
        }
    }