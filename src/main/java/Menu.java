import java.util.ArrayList;

public class Menu {
    private static ArrayList<Artist> ArtistsANDBands;
    private ArrayList<Songs> Songs;
    private ArrayList<String> band;

    public Menu() {
        this.ArtistsANDBands = new ArrayList();
        this.Songs = new ArrayList();
        this.band = new ArrayList();
    }
    // Artists
    private static Artist getArtistsANDBAnds(String name) {

        for (Artist artistsAndBands :
                ArtistsANDBands) {
            if(artistsAndBands.getName().equals(name)){
                return artistsAndBands;
            }
        }
        return null;
    }
    private boolean ArtistExistence(String name){
        if(getArtistsANDBAnds(name) == null){
            return false;
        }
        return true;
    }
    public void createArtistOrBand(String name, boolean IsBand, int MemberNum, String[] MemberBand){
        if (!ArtistExistence(name)){
            ArtistsANDBands.add(new Artist(name, IsBand ,MemberNum,MemberBand));
        }
    }
    // Songs
    private Songs getSongs(String nameS) {

        for (Songs song :
                Songs) {
            if(song.getNameS().equals(nameS)){
                return song;
            }
        }
        return null;
    }
    private boolean SongExistence(String nameS){
        if(getSongs(nameS) == null){
            return false;
        }
        return true;
    }
    public void createSongs(String nameS, String name, boolean isBand, String[] members, int MemberNum){
        if (!SongExistence(nameS)){
            ArtistsANDBands.add(new Songs( nameS, name,  isBand, members,MemberNum));
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.createArtistOrBand("Gun's and Roses", true,2, new String[]{"axl", "slash"});
        System.out.println(getArtistsANDBAnds("Gun's and Roses"));
    }



}
