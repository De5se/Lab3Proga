package Core;

import Utility.Artist;
import Utility.ArtistType;

public class DancingEnsemble extends Artist {
    public DancingEnsemble(){
        super("DancingEnsemble", ArtistType.ENSEMBLE);
        joinTheChat(getName());
    }

    public DancingEnsemble(String name){
        super(name, ArtistType.ENSEMBLE);
    }
    public DancingEnsemble(String name, ArtistType artistType){
        super(name, artistType);
    }

    public void DescribeClose(Dresses dresses){
        System.out.println(this.toString() + " нарядились в " + dresses.getName());
    }


    public void Dance(){
        System.out.println(this.toString() + "танцевали разные танцы");
    }

    public void Dance(RepkaDance repkaDance){
        System.out.println(this.toString() + "танцевали " + repkaDance.getName());
    }


    @Override
    public String toString() {
        return "DancingEnsemble '"+ getName() + "' ";
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DancingEnsemble){
            if (obj.hashCode()==this.hashCode()){
                return true;
            }
        }
        return false;
    }
}
