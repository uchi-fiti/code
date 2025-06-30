package defilante;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JComboBox;

import listener.FaritanyListener;
import model.Faritany;
import model.Faritra;

public class ListeFaritra extends JComboBox<String>{
    ListeFaritany listefaritany = new ListeFaritany();
    ArrayList<Faritra> Faritra = new ArrayList<>();
    // public ListeFaritra(ListeFaritany f){
        //         listefaritany = f;
        //         ListeFaritra();
        // }
        public ListeFaritra(){}
        public ListeFaritra(ListeFaritany f){
            listefaritany = f;
            FaritanyListener listener =new FaritanyListener(f,this);
            //  super();
             this.setBounds(300,20,100,20);
             listener.actionPerformed(null);
    }
    public void update(String fn) {
         this.removeAllItems();
         Faritra.clear();
          try {
                BufferedReader reader = new BufferedReader(new FileReader("../data/faritra.txt"));
                System.out.println(fn);
                String faritra;
                this.Faritra.add(new Faritra("Tous",fn));
                while( (faritra=reader.readLine())!=null){
                    String[] f = faritra.split("\n");
                    for(String v : f){
                        String[] a = v.split(";;");
                        if(a[0].equals(fn)){
                                      System.out.println(a[1]);
                                      this.Faritra.add(new Faritra(a[1],a[0]));           
                              }
                         }
                        }
                        setItems();
                     reader.close();              
            } catch (Exception e) {
                e.printStackTrace();
            }
        
    }
       public void setItems(){
              for(Faritra item : Faritra)
              {
                  this.addItem(item.getNom());
              }
              setSelectedIndex(0);
        }
  
   
}
