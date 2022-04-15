package hello;

import java.io.Serializable;

public class FaixaEtariaBean implements Serializable {

    private String msg;

    public FaixaEtariaBean() {
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String value) {
        int idade = Integer.parseInt(value);

        if(idade <= 19)
           msg = "Jovem";
        else if(idade >= 20 && idade <= 59)
           msg = "Adulto";
        else if(idade >= 60)
           msg = "Idoso";
    }
}
