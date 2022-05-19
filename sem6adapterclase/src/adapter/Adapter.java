package adapter;

import validatoaresubterane.ValidatorMetrou;
import validatoareterestre.ValidatorTerestru;

public class Adapter extends ValidatorMetrou implements ValidatorTerestru {


    @Override
    public void valideazaBilet() {
        super.valideazaCalatorie();
    }
}
