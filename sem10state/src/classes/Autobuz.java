package classes;

public class Autobuz {
    private StareAutobuz stare;
    private Integer nrAutobuz;

    public Autobuz(Integer nrAutobuz) {

        this.nrAutobuz = nrAutobuz;
        this.stare=new LaCapatDeLinie();
    }

    public StareAutobuz getStare() {
        return stare;
    }

    protected void setStare(StareAutobuz stare) {
        this.stare = stare;
    }

    public Integer getNrAutobuz() {
        return nrAutobuz;
    }

    public void pleacaInCursa(){
        StareAutobuz stare= new InCursa();
        stare.modificaStare(this);
    }
    public void ajungeLaCapatDeLinie(){
        StareAutobuz stare= new LaCapatDeLinie();
        stare.modificaStare(this);
    }
    public void trimiteInService(){
        StareAutobuz stare= new LaReparat();
        stare.modificaStare(this);
    }
    public void scoateDinService(){
        StareAutobuz stare= new LaCapatDeLinie();
        stare.modificaStare(this);
    }
}
