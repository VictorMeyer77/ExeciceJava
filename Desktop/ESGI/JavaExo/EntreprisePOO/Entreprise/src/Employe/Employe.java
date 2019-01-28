package Employe;

import Projet.Projet;
import Service.Service;

import java.util.ArrayList;

public class Employe {

    private String name;
    private int earn;
    private Service serv;
    private ArrayList<Projet> listProjet;




    public Employe(String name, int earn, Service serv){

        listProjet = new ArrayList<Projet>();
        this.name = name;
        setEarn(earn);
        setService(serv);
        serv.addEmploye(this);
    }

    public String getName(){
        return this.name;
    }

    public int getEarn(){
        return this.earn;
    }

    public void setEarn(int newEarn){
        this.earn = newEarn;
    }

    public void setService(Service newServ){

        this.serv = newServ;
    }

    public Service getService(){
        return serv;
    }

    public void addProjet(Projet projet){
        listProjet.add(projet);
    }

    public void removeProjet(String name){

        try{
            for (int i = 0; i < listProjet.size(); i += 1){
                if(listProjet.get(i).getName().equals(name)){

                    listProjet.remove(i);
                    return;

                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void printProjet(){

        for (int i = 0; i < listProjet.size(); i++){

            System.out.println(listProjet.get(i).getName());

        }

    }


}
