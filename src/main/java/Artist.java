public class Artist   {
    private String name;
    private boolean isBand;
    private String[] memberBand;
    private int MembersNum;
    public Artist(String name, Boolean isBand, int MembersNum, String[] memberBand) {
        this.isBand = isBand;

        if(isBand == true){
            this.name = name;
            this.MembersNum = MembersNum;
            this.memberBand = new String[MembersNum];
        }
        else{
            this.name = name;
            this.MembersNum = 0;
            this.memberBand = new String[MembersNum];
        }
    }



    public String getName() {
        return this.name;
    }

    public boolean isBand() {
        return isBand;
    }

    public String[] getMemberBand() {
        return memberBand;
    }
}