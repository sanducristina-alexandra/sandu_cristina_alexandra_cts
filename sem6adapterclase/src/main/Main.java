package main;

import adapter.Adapter;
import validatoaresubterane.ValidatorMetrou;
import validatoaresubterane.ValidatorSubteran;
import validatoareterestre.ValidatorAutobuz;
import validatoareterestre.ValidatorTerestru;

public class Main {
    public static void main(String[] args) {
        ValidatorTerestru validatorAutobuz = new ValidatorAutobuz();
        validatorAutobuz.valideazaBilet();
        validatorAutobuz.valideazaAbonament();

        ValidatorSubteran validatorMetru = new Adapter();
        validatorMetru.valideazaAbonament();
        validatorMetru.valideazaCalatorie();
    }
}
