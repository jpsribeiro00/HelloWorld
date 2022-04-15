package hello;
import java.io.Serializable;


public class TratamentoBean implements Serializable{

    private String msg;
    private String lang;

    public TratamentoBean() {
    }

    public String getMsg() {
        return msg;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String value) {
        lang = value;
    }

    public void setMsg(String value) {
        switch (value){
            case "":
            case "n":
                msg = "";
                break;
            case "sr":
                msg = TratMasculino();
                break;
            case "sa":
                msg = TratFeminino();
                break;
        }
    }

    public String TratMasculino(){
        String x = "";

        switch(lang){
            case "":
            case "pt":
                x = "Sr.";
                break;
            case "en":
                x = "Mr.";
                break;
            case "de":
                x = "Hr.";
                break;
            case "fr":
                x = "M.";
                break;
            case "es":
                x = "Sr.";
                break;
            case "jp":
                x = "Sama";
                break;
        }

        return x;
    }

    public String TratFeminino(){
        String x = "";

        switch(lang){
            case "":
            case "pt":
                x = "Sra.";
                break;
            case "en":
                x = "Mrs.";
                break;
            case "de":
                x = "Hmm.";
                break;
            case "fr":
                x = "Mme.";
                break;
            case "es":
                x = "Sra.";
                break;
            case "jp":
                x = "Sama";
                break;
        }

        return x;
    }
}
