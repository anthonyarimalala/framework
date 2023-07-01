package models;

import etu2033.annotation.url;
import etu2033.framework.servlet.ModelView;

public class Emp{
    String nom;
    String prenom;

    public Emp(){
    }

    // sprint8: parametre fonction
    @url(value="emp-parametre")
    public ModelView getBoucle(int arg0){
        ModelView modelView = new ModelView();
        String nbr = "0";
        for(int i=1; i<arg0 ; i++){
            nbr = nbr +"-"+String.valueOf(i);
        }
        modelView.addItem("boucle",nbr);
        modelView.setUrl("parametre.jsp");
        return modelView;
    }

    // sprint7: maka donnée formulaire atao anaty Classe
    @url(value="emp-recupInputDonnee")
    public ModelView getInputDonnees(){
        ModelView modelView = new ModelView();
        modelView.setUrl("recupInputDonnee.jsp");
        return modelView;
    }

    // sprint6: maka donnée anle modelView ho dispatchena
    @url(value="emp-recupDonnee")
    public ModelView getDonnees(){
        ModelView modelView = new ModelView();
        modelView.setUrl("recupDonnee.jsp");
        modelView.addItem("nom","Randriarimalala");
        modelView.addItem("prenom","Anthony");
        String nomComplet = this.nom +" "+ this.prenom;
        return modelView;
    }


    // sprint5: maka modelView anaovana dispatcher
    @url(value="emp-nomComplet")
    public ModelView getNomComplet(){
        ModelView modelView = new ModelView();
        modelView.setUrl("nomComplet.jsp");
        return modelView;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
}