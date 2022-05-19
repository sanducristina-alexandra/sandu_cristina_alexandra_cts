package classes;

public class LaReparat implements StareAutobuz{

    @Override
    public void modificaStare(Autobuz autobuz) {
        if(autobuz.getStare() instanceof LaCapatDeLinie){
            autobuz.setStare(this);
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+" este la reparat");
        }else{
            System.out.println("Autobuzul"+autobuz.getNrAutobuz()+"nu este la capat de linie");
        }
    }
}