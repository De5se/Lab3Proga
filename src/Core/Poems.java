package Core;

import Utility.DescriptionInterface;

public class Poems implements DescriptionInterface {
    private String name;

    public  Poems(){
        this.name = "Poems";
        joinTheChat(name);
    }

    public Poems(String name){
        this.name = name;
        joinTheChat(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void joinTheChat(String name) {
        System.out.println("Poems " + getName() + " have(s) joined the chat");
    }

    public void FinishPoems(String finishString){
        System.out.println("Poems " + getName() + " закончились словами" + " \"" + finishString + "\"");
    }

    public void LikePoems(){
        System.out.println("Poems " + getName() + " были хороши");
    }

    @Override
    public String toString() {
        return "Poems '"+ getName() + "' ";
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Poems){
            if (obj.hashCode()==this.hashCode()){
                return true;
            }
        }
        return false;
    }
}
