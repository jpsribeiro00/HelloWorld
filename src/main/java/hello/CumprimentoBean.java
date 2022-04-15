package hello;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.beans.*;
import java.io.Serializable;
import java.util.Calendar;

public class CumprimentoBean implements Serializable {

    private String msg;

    public CumprimentoBean() {
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String value) {
        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);

        switch (value){
            case "":
            case "pt":
                if(timeOfDay >= 0 && timeOfDay < 12){
                    msg = "Bom dia";
                    break;
                }
                else if(timeOfDay >= 12 && timeOfDay < 18){
                    msg = "Boa tarde";
                    break;
                }
                else if(timeOfDay >= 18 && timeOfDay <= 24){
                    msg = "Boa noite";
                    break;
                }
            case "en":
                if(timeOfDay >= 0 && timeOfDay < 12){
                    msg = "Good Morning";
                    break;
                }
                else if(timeOfDay >= 12 && timeOfDay < 18){
                    msg = "Good afternoon";
                    break;
                }
                else if(timeOfDay >= 18 && timeOfDay <= 24){
                    msg = "Good night";
                    break;
                }
            case "de":
                if(timeOfDay >= 0 && timeOfDay < 12){
                    msg = "Guten Morgen";
                    break;
                }
                else if(timeOfDay >= 12 && timeOfDay < 18){
                    msg = "Guten Tag";
                    break;
                }
                else if(timeOfDay >= 18 && timeOfDay <= 24){
                    msg = "Gute Nacht";
                    break;
                }
            case "fr":
                if(timeOfDay >= 0 && timeOfDay < 12){
                    msg = "bon Matin";
                    break;
                }
                else if(timeOfDay >= 12 && timeOfDay < 18){
                    msg = "Bon après-midi";
                    break;
                }
                else if(timeOfDay >= 18 && timeOfDay <= 24){
                    msg = "bonne nuit";
                    break;
                }
            case "es":
                if(timeOfDay >= 0 && timeOfDay < 12){
                    msg = "buen día";
                    break;
                }
                else if(timeOfDay >= 12 && timeOfDay < 18){
                    msg = "buenas tardes";
                    break;
                }
                else if(timeOfDay >= 18 && timeOfDay <= 24){
                    msg = "buenas noches";
                    break;
                }
            case "jp":
                if(timeOfDay >= 0 && timeOfDay < 12){
                    msg = "Ohayō";
                    break;
                }
                else if(timeOfDay >= 12 && timeOfDay < 18){
                    msg = "Konnichiwa";
                    break;
                }
                else if(timeOfDay >= 18 && timeOfDay <= 24){
                    msg = "Oyasuminasai";
                    break;
                }
        }
    }
}
