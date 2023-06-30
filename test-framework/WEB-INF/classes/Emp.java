package models;

import etu2033.annotation.url;
import etu2033.framework.servlet.ModelView;

public class Emp{
    String nom;
    String prenom;

// sprint5: maka modelView anaovana dispatcher
    @url(value="emp-nomComplet")
    public ModelView getNomComplet(){
        ModelView modelView = new ModelView();
        modelView.setUrl("nomComplet.jsp");
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
}