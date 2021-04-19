import java.util.ArrayList;

public class Prog2 {
    public static void main(String[] args) throws Exception {
        Std me = new Std("JJ");
        me.setCourse(new Java("1091", 90), new CSharp(90));
        System.out.println(me);
        Std friend = new Std("Tom");
        friend.setCourse(new CSharp("1091", 80), new Java(90), new Math());
        System.out.println(friend);
        Std std2 = new Std("Mary");
        std2.setCourse(new Math(70), new Java());
        System.out.println(std2);
    }
}

class Std{
    private String name;
    ArrayList<Score> scores = new ArrayList<Score>();
    public Std(String name){
        this.name = name;
    }
    
    public void setCourse(Score... args) {
        for(Score score : args){
            scores.add(score);
        }
    }

    @Override
    public String toString(){
        int total = 0;
        for(Score score : scores){
            total += score.courses;
        }
        return this.name + "," + scores.size() + "科平均是" + (float)total/scores.size();
    
    }

}
class Score{
    String semester = "";
    int courses = 60;

    public Score(){};

    public Score(int courses){
        this.courses = courses;
    }

    public Score(String semester,int courses){
        this.courses = courses;
    }
}

class Java extends Score{
    public Java(){};

    public Java(int courses) {
        super(courses);
    }
    public Java(String semester,int courses) {
        super(semester, courses);
    }
}
class CSharp extends Score{
    public CSharp(){};

    public CSharp(int courses) {
        super(courses);
    }
    public CSharp(String semester,int courses) {
        super(semester, courses);
    }

}
class Math extends Score{
    public Math(){};

    public Math(int courses) {
        super(courses);
    }
    public Math(String semester,int courses) {
        super(semester, courses);
    }
}