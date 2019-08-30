package p24_visitor;

import java.util.ArrayList;
import java.util.List;

public class OperateObject {
    private List<Singer> singers = new ArrayList<>();

    public void add(Singer singer){
        singers.add(singer);
    }

    public void remove(Singer singer){
        singers.remove(singer);
    }

    public void operate(Visitor visitor){
        for (Singer singer:singers){
            singer.accept(visitor);
        }
    }


}
