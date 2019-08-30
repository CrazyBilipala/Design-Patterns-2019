package p22_fly_weight;

import java.util.Hashtable;

public class WorkShop {
    private Hashtable<String,Star> starModel = new Hashtable<String,Star>();

    public WorkShop() {
        starModel.put("singer",new Singer());
        starModel.put("dancer",new Dancer());
    }

    public Star up(String key){
        if (starModel.containsKey(key)){
            return starModel.get(key);
        }else {
            System.out.println("无法生产该类明星");
            return null;
        }
    }
}
