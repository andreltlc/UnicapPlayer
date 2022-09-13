public class Songs extends Artist {
  private String nameS;

    public Songs(String nameS, String name, boolean isBand, String[] members, int MemberNum) {
        super(name,isBand ,MemberNum, members );
        this.nameS = nameS;
    }



    public  String getNameS() {
        return this.nameS;
    }
}
