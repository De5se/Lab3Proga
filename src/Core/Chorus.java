package Core;

import Utility.Artist;
import Utility.ArtistType;

public class Chorus extends Artist {
    public Chorus(){
        super("Chorus", ArtistType.CHORUS);
        joinTheChat(getName());
    }

    public Chorus(String name){
        super(name, ArtistType.CHORUS);
    }
    public Chorus(String name, ArtistType artistType){
        super(name, artistType);
    }

    public void Sing(){
        System.out.println(this.toString() + " исполнили несколько пессен");
    }

    @Override
    public String toString() {
        return "Chorus '"+ getName() + "' ";
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Chorus){
            if (obj.hashCode()==this.hashCode()){
                return true;
            }
        }
        return false;
    }
}
