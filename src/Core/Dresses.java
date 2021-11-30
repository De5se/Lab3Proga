package Core;

import Utility.DescriptionInterface;

public class Dresses implements DescriptionInterface {
    private String name;

    public Dresses(){
        this.name = "Dress";
        joinTheChat(name);
    }

    public Dresses(String name){
        this.name = name;
        joinTheChat(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void joinTheChat(String name) {
        System.out.println(this.toString() + " have(s) joined the chat");
    }

    @Override
    public String toString() {
        return "Dresses '"+ getName() + "' ";
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Dresses){
            if (obj.hashCode()==this.hashCode()){
                return true;
            }
        }
        return false;
    }
}
