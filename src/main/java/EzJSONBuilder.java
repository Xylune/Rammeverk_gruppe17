public class EzJSONBuilder {

    public boolean prettyPrinting;

    public EzJSONBuilder setPrettyPrinting() {
        this.prettyPrinting = true;
        return this;
    }

    public EzJSON create() {
        EzJSON ezJSON = new EzJSON(this);
        return ezJSON;
    }

}
