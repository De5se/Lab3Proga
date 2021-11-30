package Core;

import Utility.DescriptionInterface;

public class Babies implements DescriptionInterface {
    private String name;

    public  Babies(){
        this.name = "babies";
        joinTheChat(name);
    }

    public Babies(String name){
        this.name = name;
        joinTheChat(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void joinTheChat(String name) {
        System.out.println("Babies " + getName() + " have(s) joined the chat");
    }

    public void clap(boolean isLoudly, boolean isLong){
        System.out.print("Babies " + name);

        if (isLong){
            System.out.print(" долго");
        }

        if (isLoudly){
            System.out.print(" громко");
        }

        System.out.println(" захлопали в ладоши");
    }

    public void BravoShout(){
        System.out.println("Babies " + name + " кричали \"Браво!\"");
    }


    @Override
    public String toString() {
        return "Babies '"+ getName() + "' ";
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Babies){
            if (obj.hashCode()==this.hashCode()){
                return true;
            }
        }
        return false;
    }

}
