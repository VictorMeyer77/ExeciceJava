package Service;

import Employe.Employe;

import java.util.ArrayList;

public class Service {

    public String name;
    public int capital;
    private ArrayList<Employe> listEmploye;

    public Service(String name, int capital){

        listEmploye = new ArrayList<Employe>();
        setCapital(capital);
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setCapital(int capital){
        this.capital = capital;
    }

    public int getCapital(){
        return capital;
    }

    public void addEmploye(Employe emp){
        listEmploye.add(emp);
    }

    public void removeEmploye(String name){

        try{
            for(int i = 0; i < listEmploye.size(); i ++){

                if(listEmploye.get(i).getName().equals(name)){
                    listEmploye.remove(i);
                    return;
                }

            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<Employe> getListEmploye(){
        return listEmploye;
    }

    public void printListEmploye(){

        for(int i = 0; i < listEmploye.size(); i += 1){
            System.out.println(listEmploye.get(i).getName());
        }

    }

    public double getAvgEarn(){

        double somme = 0.f;
        int i;

        for(i = 0; i < listEmploye.size(); i ++){
            somme += (double)listEmploye.get(i).getEarn();
        }

        return somme/i;

    }
}
