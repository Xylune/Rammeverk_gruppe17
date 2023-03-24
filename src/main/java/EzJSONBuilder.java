public class EzJSONBuilder {

    public boolean prettyPrinting;

    public EzJSONBuilder setPrettyPrinting() {
        this.prettyPrinting = true;
        return this;
    }

    public EzJSON create() {
        return new EzJSON(this);
    }

}
