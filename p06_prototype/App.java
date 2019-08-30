package p06_prototype;

public class App {
    public static void main(String[] args) {
        Student zhangSan = new Student();
        zhangSan.setName("zhangsan");
        Student lisi = null;
        try {
            lisi = (Student) zhangSan.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        lisi.setName("lisi");
        System.out.println(zhangSan.getName());

    }
}
