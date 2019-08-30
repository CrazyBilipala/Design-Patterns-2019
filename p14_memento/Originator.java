package p14_memento;

public class Originator {
    private int recode;

    public Memento createMemento(){
        Memento memento = new Memento();
        memento.setRecord(this.recode);
        return memento;
    }

    public void recover(Memento memento){
        this.recode = memento.getRecord();
    }

    public int getRecode() {
        return recode;
    }

    public void setRecode(int recode) {
        this.recode = recode;
    }
}
