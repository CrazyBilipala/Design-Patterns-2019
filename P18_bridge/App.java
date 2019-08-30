package P18_bridge;

public class App {
    public static void main(String[] args) {
//        定义歌手
        Singer jiTai = new JiTai("鸡太","中国");
        Singer meiMei = new MeiMei("美美","中国香港");
//        定义技能
        Skill sing = new Sing("唱歌");
        Skill show = new Show("装帅/卖萌");
        Skill office = new Office("使用office软件");
//        学习技能
        jiTai.addSkill(sing);
        jiTai.addSkill(show);

        meiMei.addSkill(sing);
        meiMei.addSkill(show);
        meiMei.addSkill(office);
//        技能展示
        jiTai.showSkills();
        meiMei.showSkills();

    }
}
