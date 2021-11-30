package Core;

import Utility.DescriptionInterface;

public class Applauses implements DescriptionInterface {
    private String name;

    public  Applauses(){
        this.name = "Applauses";
        joinTheChat(name);
    }

    public Applauses(String name){
        this.name = name;
        joinTheChat(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void joinTheChat(String name) {
        System.out.println("Applauses " + getName() + " have(s) joined the chat");
    }

    public void muteApplauses(){
        System.out.println("Aplauses " + getName() + " стихли");
    }

    @Override
    public String toString() {
        return "Applauses '"+ getName() + "' ";
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Applauses){
            if (obj.hashCode()==this.hashCode()){
                return true;
            }
        }
        return false;
    }
}
