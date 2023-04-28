package stringArrayList;
import java.util.ArrayList;
public class StringArrayList {


    private ArrayList<Integer> scores = new ArrayList<>();
    private ArrayList<Character> letterGrades = new ArrayList<>();
    private ArrayList<Double> gpas = new ArrayList<>();
    private ArrayList<String> courseNames = new ArrayList<>();

    public void addScore (int score){
        this.scores.add(score);
    }
    public void removeScore (int score){
           scores.remove(score);
    }
    public int getScore (int index){
        return scores.get(index);
    }
    public int getSizeOfScoreList (){
        return scores.size();
    }

    public void addCourse (String courseNames){
        this.courseNames.add(courseNames);
    }
    public void addGrade (char grade){
        this.letterGrades.add(grade);
    }
    public void addGPA (double gpa){
        this.gpas.add(gpa);
    }
    public void displayScores1 (){
        System.out.printf("Scores: %n");
        for (Object score : scores){
            System.out.printf("%d%n", score);
        }
    }
    public void displayScores2() {
        System.out.printf("Scores: %n");
        for (int i = 0; i < scores.size(); i++) {
            System.out.printf("%d%f", scores.get(i));
        }
    }}