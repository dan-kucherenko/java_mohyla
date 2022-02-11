import java.util.Arrays;

public class StudentsGrades {
    private int[] grades;
    private int maxGrade;
    private int minGrade;
    private float averageGrade;
    private int studentsWithGradeAvPlus;
    private int studentsWithGradeAvLess;
    private int studentsWithExcellentGrade;
    private int studentsWithGoodGrade;
    private int studentsWithSatisfactoryGrade;
    private String allGrades;

    StudentsGrades(int[] grades) {
        for (int i : grades) {
            if (i >= 0 && i <= 100)
                this.grades = grades;

            else
                System.exit(1);
        }
        calculateData();
    }

    public int getGrades(int indexOfNum) {
        int grade = grades[indexOfNum - 1];
        return grade;
    }

    public int[] setGrades(int[] newGrades) {
        if (grades.length != newGrades.length)
            return null;
        else {
            for (int i = 0; i < grades.length; i++)
                grades[i] = newGrades[i];
            calculateData();
            return grades;
        }
    }

    public int[] addGrades(int newGrade) {
        if (newGrade >= 0 && newGrade <= 100) {
            grades = Arrays.copyOf(grades, grades.length + 1);
            grades[grades.length - 1] = newGrade;
            calculateData();
            return grades;
        } else
            return null;
    }

    public int maxGrade() {
        maxGrade = grades[0];
        for (int i : grades) {
            if (i > maxGrade)
                maxGrade = i;
        }
        return maxGrade;
    }

    public int minGrade() {
        minGrade = grades[0];
        for (int i : grades) {
            if (i < minGrade)
                minGrade = i;
        }
        return minGrade;
    }

    public float averageGrade() {
        int sumOfAllGrades = 0;
        int counter = 0;
        for (int i : grades) {
            sumOfAllGrades += i;
            counter++;
        }
        averageGrade = (float) sumOfAllGrades / counter;
        return averageGrade;
    }

    public int studentsWithGradeAvMore(double averageGrade) {
        studentsWithGradeAvPlus = 0;
        for (int i : grades) {
            if ((double) i > averageGrade)
                studentsWithGradeAvPlus++;
        }
        return studentsWithGradeAvPlus;
    }

    public int studentsWithGradeAvLess(double averageGrade) {
        studentsWithGradeAvLess = 0;
        for (int i : grades) {
            if (i < averageGrade)
                studentsWithGradeAvLess++;
        }
        return studentsWithGradeAvLess;
    }

    public int studentsWithExcellentGrade() {
        studentsWithExcellentGrade = 0;
        for (int i : grades) {
            if (i >= 91 && i <= 100)
                studentsWithExcellentGrade++;
        }
        return studentsWithExcellentGrade;
    }

    public int studentsWithGoodGrade() {
        studentsWithGoodGrade = 0;
        for (int i : grades) {
            if (i >= 71 && i <= 90)
                studentsWithGoodGrade++;
        }
        return studentsWithGoodGrade;
    }

    public int studentsWithSatisfactoryGrade() {
        studentsWithSatisfactoryGrade = 0;
        for (int i : grades) {
            if (i >= 60 && i <= 70)
                studentsWithSatisfactoryGrade++;
        }
        return studentsWithSatisfactoryGrade;
    }

    public String allGrades() {
        allGrades = "";
        for (int i : grades)
            allGrades += i + " ";
        return allGrades;
    }

    private void calculateData() {
        maxGrade();
        minGrade();
        averageGrade();
        studentsWithGradeAvMore(averageGrade);
        studentsWithGradeAvLess(averageGrade);
        studentsWithExcellentGrade();
        studentsWithGoodGrade();
        studentsWithSatisfactoryGrade();
        allGrades();
    }

    public int getMaxGrade() {return maxGrade;}
    public int getMinGrade(){return minGrade;}
    public float getAverageGrade(){return averageGrade;}
    public int getStudentsWithGradeAvPlus(){return studentsWithGradeAvPlus;}
    public int getStudentsWithGradeAvLess(){return studentsWithGradeAvLess;}
    public int getStudentsWithExcellentGrade(){return studentsWithExcellentGrade;}
    public int getStudentsWithGoodGrade(){return studentsWithGoodGrade;}
    public int getStudentsWithSatisfactoryGrade(){return studentsWithSatisfactoryGrade;}
    public String getAllGrades(){return allGrades;}


}