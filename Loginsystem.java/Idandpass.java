package Loginsystem.java;
import java.util.HashMap;

public class Idandpass {
    HashMap<String,String> hm=new HashMap<String,String>();
    Idandpass()
    {
        hm.put("Leela","45llp");
        hm.put("sonia","skyisbeautiful1");
        hm.put("kitti","jollylife");
    }
    protected HashMap getLoginInfo(){
        return hm;
    }
}
