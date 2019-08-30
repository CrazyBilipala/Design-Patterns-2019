package p15_composite;

public class AddLeaf implements Tree {

    @Override
    public void add(Tree tree) {

    }

    @Override
    public void remove(Tree tree) {

    }

    @Override
    public void operation(double a, double b) {
        System.out.println("加法计算结果："+(a+b));
    }
}
