package p14_memento;

public class App {
    public static void main(String[] args) {
//        1. 创建发起者，赋予最高记录88
        Originator originator = new Originator();
        originator.setRecode(88);
        System.out.println("当前记录为："+originator.getRecode());
//        2. 备份状态，并将状态保存到状态管理者
        Memento memento = originator.createMemento();
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(memento);
//        3. 破纪录了，最高记录改为91
        originator.setRecode(91);
        System.out.println("当前记录为："+originator.getRecode());
//        由于统计问题，本次最高记录91无效，需要回改到88
        originator.recover(caretaker.getMemento());
        System.out.println("当前记录为："+originator.getRecode());
    }
}
