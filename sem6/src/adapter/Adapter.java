package adapter;

import validatoaresubterane.ValidatorMetrou;
import validatoaresubterane.ValidatorSubteran;
import validatoareterestre.ValidatorTerestru;

public class Adapter implements ValidatorTerestru {
    ValidatorSubteran validatorMetrou;

    public Adapter(ValidatorSubteran validatorMetrou) {
        super();
        this.validatorMetrou = validatorMetrou;
    }

    @Override
    public void valideazaBilet() {
        validatorMetrou.valideazaCalatorie();
    }

    @Override
    public void valideazaAbonament() {
       validatorMetrou.valideazaAbonament();
    }
}
