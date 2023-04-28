package activity16;

public class arrayDemo3 {
    public static void main(String[] args) {
        String[][] array1 = { {"I'm ", "turning", " green"}, {"please ","help"," me"} };
        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array1[i].length; j++) {
                System.out.printf("%s", array1[i][j]);
            }
            System.out.println();

        }
        }
    }

