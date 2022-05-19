package classes;

public class InCursa implements StareAutobuz {

    @Override
    public void modificaStare(Autobuz autobuz) {
        if(autobuz.getStare() instanceof LaCapatDeLinie){
            autobuz.setStare(this);
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+" a pornit in cursa");
        }
        else{
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+" nu poate sa plece in cursa");
        }
    }
}