package Main;

import Employe.Employe;
import Projet.Projet;
import Service.Service;

public class Main {

    public static void main(String[] args){
        Service compta = new Service("Comptabilité", 30000);
        Service marketing = new Service("marketing", 50000);

        Employe marketingResp = new Employe("Joséphine", 4000, marketing);
        Employe comptaResp = new Employe("Mathieu", 2800, compta);
        Employe comptaExpert = new Employe("Richard", 3000, compta);

        Projet campagne = new Projet("Campagne", marketingResp);
        campagne.addService(compta);

        compta.printListEmploye();
        System.out.println(compta.getAvgEarn());

        campagne.printEmploye();
        marketingResp.printProjet();
    }

}
