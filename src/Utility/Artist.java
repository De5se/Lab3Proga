package Utility;


public abstract class Artist implements ArtistInterface{
    private String name;
    private ArtistType artistType;

    public Artist(){
        this.name = "Artist";
        this.artistType = ArtistType.UNKNOWM;
        joinTheChat(name);
    }

    public Artist(String name){
        this.name = name;
        this.artistType = ArtistType.UNKNOWM;
        joinTheChat(name);

    }
    public Artist(String name, ArtistType artistType){
        this.name = name;
        this.artistType = artistType;
        joinTheChat(name);

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void joinTheChat(String name) {
        System.out.println("Artist " + artistType + ' '+ getName() + " have(s) joined the chat");
    }

    public void finishPerformance(){
        System.out.println("Artist " + getName() + " have(s) finished performance");
    }

    @Override
    public void GetType(){
        System.out.println(getName() + " is " + artistType);
    }

}
