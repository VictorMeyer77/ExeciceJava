package Word;


import java.util.ArrayList;

public class Word {

    private String chain;
    public ArrayList<String> neighbors;

    Word(String word){

        neighbors = new ArrayList<String>();
        setChain(word);
        findNeighbors();
    }

    private void findNeighbors() {

        char charTemp;
        StringBuffer neighWord;

        try {

            for (int i = 0; i < chain.length(); i += 1) {

                for(int asci = 65; asci < 91; asci += 1){
                    
                    neighWord = new StringBuffer(chain);
                    
                    if((int)chain.charAt(i) != asci){
                        charTemp = (char)asci;
                        neighWord.replace(i, i + 1, Character.toString(charTemp));
                        neighbors.add(neighWord.toString().toLowerCase());
                    }

                }

            }

        } catch (Exception e){

            e.printStackTrace();
        }

    }

    private ArrayList<String> getAllNeighbors(){
        
        ArrayList<String> allNeighbors = neighbors;
        int nbNeight = allNeighbors.size();
        int nb = 0;
        ArrayList<String> neighSquare;
        Word neight;

        try {

            while(nbNeight > 0){
                
                nb = 0;
                for(int i = 0; i < allNeighbors.size(); i += 1){
                    
                    neight = new Word(allNeighbors.get(i));
                    neighSquare = neight.getNeightbors();

                    for(int j = 0; j < neighSquare.size(); j += 1){

                        if(allNeighbors.contains(neighSquare.get(j))){
                            continue;
                        }
                        else{
                            nb += 1;
                            allNeighbors.add(neighSquare.get(j));
                        }

                    }
                    
                }
                nbNeight = nb;
            }


        } catch (Exception e2){
            
            e2.printStackTrace();
            
        }

        return allNeighbors;
    }

    public void printNeight(){

        try {

            for (int i = 0; i < neighbors.size(); i += 1) {

                System.out.println(neighbors.get(i));

            }
        } catch (Exception e1){

            e1.printStackTrace();
        }
    }

    public ArrayList<String> getNeightbors(){

        return neighbors ;

    }

    public String getChain(){

        return chain;

    }

    public void setChain(String new_chain){

        chain = new_chain;

    }


    public static void main(String[] args){

        Word mot = new Word("bbb");
        //mot.printNeight();
        ArrayList<String> lt = mot.getAllNeighbors();
        System.out.println(lt);

    }
}
