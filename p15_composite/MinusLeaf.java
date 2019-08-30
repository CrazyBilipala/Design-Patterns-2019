package p15_composite;

public class MinusLeaf implements Tree {

    @Override
    public void add(Tree tree) {

    }

    @Override
    public void remove(Tree tree) {

    }

    @Override
    public void operation(double a, double b) {
        System.out.println("减法计算结果："+(a-b));
    }
}
