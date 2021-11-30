package Core;

import Utility.DescriptionInterface;

public class RepkaDance implements DescriptionInterface {
    private String name;

    public RepkaDance(){
        this.name = "RepkaDance";
        joinTheChat(name);
    }

    public RepkaDance(String name){
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
        return "RepkaDance '"+ getName() + "' ";
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RepkaDance){
            if (obj.hashCode()==this.hashCode()){
                return true;
            }
        }
        return false;
    }
}
