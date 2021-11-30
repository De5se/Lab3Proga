package Core;

import Utility.Artist;
import Utility.ArtistType;

public class Director extends Artist {

    public Director(){
        super("Director", ArtistType.DIRECTOR);
        joinTheChat(getName());
    }

    public Director(String name){
        super(name, ArtistType.DIRECTOR);
    }
    public Director(String name, ArtistType artistType){
        super(name, artistType);
    }

    public void StickUp(){
        System.out.println("Director " + getName() + " поднял дирежерскую палочку");
    }

    @Override
    public String toString() {
        return "Director '"+ getName() + "' ";
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Director){
            if (obj.hashCode()==this.hashCode()){
                return true;
            }
        }
        return false;
    }
}
