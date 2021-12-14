package Core;

import Utility.Artist;
import Utility.ArtistType;

import java.util.ArrayList;

public class Poet extends Artist {

    ArrayList<String> speech;
    
    public Poet(){
        super("Poet", ArtistType.POET);
        joinTheChat(getName());
    }

    public Poet(String name){
        super(name, ArtistType.POET);
    }
    public Poet(String name, ArtistType artistType){
        super(name, artistType);
    }

    public void ReadPoems(Poems poem){
        System.out.println("Poet " + getName() + " начал(а) читать стихи " + poem.getName());
    }

    public void Shout(String speech) {
        if (speech.length() < 5) {
            throw new DirectorExeption("Speech is too short");
        }
        else {
            System.out.println("Poet " + getName() + " прокричал(а) " + speech);
        }
        /*for (int i = 0; i < speech.size(); i++) {
            if (i == speech.size() - 1) {
                System.out.print(speech.get(i) + " ");
            }
        }*/
    }

    @Override
    public String toString() {
        return "Poet '"+ getName() + "' ";
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Poet){
            if (obj.hashCode()==this.hashCode()){
                return true;
            }
        }
        return false;
    }
}
