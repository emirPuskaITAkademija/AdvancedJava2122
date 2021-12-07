package one.collection;

public class BrojevnaKutija<B extends Number> {
    private B broj;

    public void setBroj(B broj) {
        this.broj = broj;
    }

    public B getBroj() {
        return broj;
    }
}
