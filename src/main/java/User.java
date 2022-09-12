public class User {
    protected String name;
    protected Boolean IsBand;

    public User(String name, Boolean IsBand) {
        this.name = name;
        this.IsBand = IsBand;
    }

    public Boolean getBand() {
        return IsBand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
