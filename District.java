package model;

public class District {
    String nom;
    String nomFaritra;
    public District(String nom,String nomfaritra){
          this.nom = nom;
          nomFaritra=nomfaritra;
    }
    public String getNom(){
        return nom;
    }
    public String getNomFaritra(){
        return nomFaritra;
    }
}
