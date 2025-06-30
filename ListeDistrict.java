package defilante;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JComboBox;

import listener.*;
import model.*;
// import code.model.Faritra;

public class ListeDistrict extends JComboBox<String>{
    ListeFaritra listefaritra;
    ArrayList<District> District = new ArrayList<>();
    // public ListeFaritra(ListeFaritany f){
        //         listefaritany = f;
        //         ListeFaritra();
        // }
        public ListeDistrict(ListeFaritra f){
            listefaritra=f;
            FaritraListener listener =new FaritraListener(f,this);
            //  super();
             this.setBounds(450,20,100,20);
             listener.actionPerformed(null);
    }
    public void update(String fn){
         this.removeAllItems();
          if(District !=null )District.clear();
          try {
                BufferedReader reader = new BufferedReader(new FileReader("../data/district.txt"));
                System.out.println(fn);
                String district;
                this.District.add(new District("Tous",fn));
                while( (district=reader.readLine())!=null){
                    String[] f = district.split("\n");
                    for(String v : f){
                        String[] a = v.split(";;");
                        if(a[0].equals(fn)){
                                      System.out.println(a[1]);
                                      this.District.add(new District(a[1],a[0]));           
                              }
                         }
                        }
                        setItems();
                     reader.close();              
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
    public void setItems() {
            for(District item : District)
            {
                this.addItem(item.getNom());
            }
            setSelectedIndex(0);
    }
}
