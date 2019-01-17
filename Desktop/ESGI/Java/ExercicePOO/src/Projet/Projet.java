package Projet;

import Employe.Employe;
import Service.Service;

import java.util.ArrayList;

public class Projet {

    public String name;
    public ArrayList<Service> listServ;
    public Employe chef;

    public Projet(String name, Employe chef){

        listServ = new ArrayList<Service>();
        this.name = name;

        setChef(chef);
        listServ.add(chef.getService());
        chef.addProjet(this);

    }

    public String getName(){
        return name;
    }

    public void addService(Service serv){
        listServ.add(serv);
    }

    public void removeService(String name){

        try{
            for (int i = 0; i < listServ.size(); i += 1){
                if(listServ.get(i).getName().equals(name)){

                    listServ.remove(i);
                    return;

                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void printEmploye(){

        for(int i = 0; i < listServ.size(); i += 1){

            listServ.get(i).printListEmploye();

        }

    }

    public void setChef(Employe chef){
        this.chef = chef;
    }

    public Employe getChef(){
        return chef;
    }

    public ArrayList<Service> getListServ(){
        return listServ;
    }


}
