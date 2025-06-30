package model;

public class Faritra {
    String nom;
    String nomFaritany;
    
    public void setNom(String n){
        this.nom = n;
    }
    public String getNom(){
        return nom;
    }
    public Faritra(String nom,String nomfaritany){
        this.nom=nom;
        nomFaritany = nomfaritany;
    }
}
