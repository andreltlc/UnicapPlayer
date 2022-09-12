import java.util.ArrayList;

public class Artist extends User {
    private ArrayList<User> artists;

    public Artist(String name, Boolean IsBand) {
        super(name, IsBand);
    }

    public ArrayList<User> Artist(String name){
        if(IsBand == true){
            setName(name);
            return this.artists= new ArrayList();
        }else {
            setName(name);
            return this.artists =  new ArrayList(1);
        }

    }
}