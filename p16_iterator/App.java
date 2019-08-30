package p16_iterator;

import java.util.Iterator;

public class App {
    public static void main(String[] args) {
//        创建队伍
        Team team = new Team();
//        创建小明，小红，小王，坏叔叔。
        Student ming = new Student("小明");
        Student hong = new Student("小红");
        Student wang = new Student("小王");
        Student uncle = new Student("坏叔叔");
//        排队
        team.add(ming);
        team.add(hong);
        team.add(wang);
        team.add(uncle);

//        遍历报到
        Iterator<Student> studentIterator = team.iterator();
        while (studentIterator.hasNext()){
            System.out.println(studentIterator.next().getName()+ "：到");
        }

//        坏叔叔不能排在学生队伍里
        team.remove(uncle);
//        再次报到
        Iterator<Student> newStudentIterator = team.iterator();
        while (newStudentIterator.hasNext()){
            System.out.println(newStudentIterator.next().getName()+ "：到");
        }
    }
}
