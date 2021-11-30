package Core;

import Utility.Artist;
import Utility.ArtistType;

public class Poet extends Artist {
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
