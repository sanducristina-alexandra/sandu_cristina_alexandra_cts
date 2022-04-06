package Main;

import adapter.Adapter;
import validatoaresubterane.ValidatorMetrou;
import validatoaresubterane.ValidatorSubteran;
import validatoareterestre.ValidatorAutobuz;
import validatoareterestre.ValidatorTerestru;

public class Main {
    public static void valideazaBilet(ValidatorTerestru validator){
        validator.valideazaBilet();
    }
    public static void main(String[] args) {
        ValidatorSubteran validatorMetrou = new ValidatorMetrou();
        ValidatorTerestru validatorAutobuz = new ValidatorAutobuz();
        Adapter adapter = new Adapter(validatorMetrou); //ii dam obiectul pe care il adaptam
        valideazaBilet(adapter);
    }
}
