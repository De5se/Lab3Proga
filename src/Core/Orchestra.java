package Core;

import Utility.Artist;
import Utility.ArtistType;

public class Orchestra extends Artist {

    public Orchestra(){
        super("Orchestra", ArtistType.ORCHESTRA);
        joinTheChat(getName());
    }

    public Orchestra(String name){
        super(name, ArtistType.ORCHESTRA);
    }
    public Orchestra(String name, ArtistType artistType){
        super(name, artistType);
    }

    public void Play(){
        System.out.println("Orchestra " + getName() + " заиграл");
    }

    @Override
    public String toString() {
        return "Orchestra '"+ getName() + "' ";
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Orchestra){
            if (obj.hashCode()==this.hashCode()){
                return true;
            }
        }
        return false;
    }
}
