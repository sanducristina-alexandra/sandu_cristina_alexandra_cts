package main;

import clase.*;

public class Main {
    public static void main(String[] args) {

        ModPlata modPlata1 = new CardBancar();
        Validator validator = new Validator(2,modPlata1);
        validator.platesteCalatorie();
        validator.setModPlata(new Sms());
        validator.platesteCalatorie();
        validator.setModPlata(new CardCalatorii());
        validator.platesteCalatorie();
    }
}


