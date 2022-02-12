import java.util.Arrays;

public class StudentGradesGeneric<T extends Number> {
    //Number -> Integer,Double,Float...
    private T[] grades;
    private T maxGrade;
    private T minGrade;
    private float averageGrade;
    private int studentsWithGradeAvPlus;
    private int studentsWithGradeAvLess;
    private int studentsWithExcellentGrade;
    private int studentsWithGoodGrade;
    private int studentsWithSatisfactoryGrade;
    private String allGrades;

    StudentGradesGeneric(T[] grades) {
        for (T i : grades) {
            if (i.floatValue() >= 0 && i.floatValue() <= 100)
                this.grades = grades;
            else
                System.exit(1);
        }
        calculateData();
    }

    public T getGrades(int indexOfNum) {
        T grade = grades[indexOfNum - 1];
        return grade;
    }

    public T[] setGrades(T[] newGrades) {
        if (grades.length != newGrades.length)
            return null;
        else {
            for (int i = 0; i < grades.length; i++)
                grades[i] = newGrades[i];
            calculateData();
            return grades;
        }

    }

    public T[] addGrades(T newGrade) {
        if (newGrade.intValue() >= 0 && newGrade.intValue() <= 100) {
            grades = Arrays.copyOf(grades, grades.length + 1);
            grades[grades.length - 1] = newGrade;
            calculateData();
            return grades;
        } else
            return null;
    }

    public T maxGrade() {
        maxGrade = grades[0];
        for (T i : grades) {
            if (i.floatValue() > maxGrade.floatValue())
                maxGrade = i;
        }
        return maxGrade;
    }

    public T minGrade() {
        minGrade = grades[0];
        for (T i : grades) {
            if (i.floatValue() < minGrade.floatValue())
                minGrade = i;
        }
        return minGrade;
    }

    public float averageGrade() {
        float sumOfAllGrades = 0;
        int counter = 0;
        for (T i : grades) {
            sumOfAllGrades += i.floatValue();
            counter++;
        }
        averageGrade = (float) sumOfAllGrades / counter;
        return averageGrade;
    }

    public int studentsWithGradeAvMore(float averageGrade) {
        studentsWithGradeAvPlus = 0;
        for (T i : grades) {
            if (i.floatValue() > averageGrade)
                studentsWithGradeAvPlus++;
        }
        return studentsWithGradeAvPlus;
    }

    public int studentsWithGradeAvLess(double averageGrade) {
        studentsWithGradeAvLess = 0;
        for (T i : grades) {
            if (i.floatValue() < averageGrade)
                studentsWithGradeAvLess++;
        }
        return studentsWithGradeAvLess;
    }

    public int studentsWithExcellentGrade() {
        studentsWithExcellentGrade = 0;
        for (T i : grades) {
            if (i.intValue() >= 91 && i.intValue() <= 100)
                studentsWithExcellentGrade++;
        }
        return studentsWithExcellentGrade;
    }

    public int studentsWithGoodGrade() {
        studentsWithGoodGrade = 0;
        for (T i : grades) {
            if (i.intValue() >= 71 && i.intValue() <= 90)
                studentsWithGoodGrade++;
        }
        return studentsWithGoodGrade;
    }

    public int studentsWithSatisfactoryGrade() {
        studentsWithSatisfactoryGrade = 0;
        for (T i : grades) {
            if (i.intValue() >= 60 && i.intValue() <= 70)
                studentsWithSatisfactoryGrade++;
        }
        return studentsWithSatisfactoryGrade;
    }

    public String allGrades() {
        allGrades = "";
        for (T i : grades)
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

    public T getMaxGrade() {return maxGrade;}

    public T getMinGrade() {return minGrade;}

    public float getAverageGrade() {return averageGrade;}

    public int getStudentsWithGradeAvPlus() {return studentsWithGradeAvPlus;}

    public int getStudentsWithGradeAvLess() {return studentsWithGradeAvLess;}

    public int getStudentsWithExcellentGrade() {return studentsWithExcellentGrade;}

    public int getStudentsWithGoodGrade() {return studentsWithGoodGrade;}

    public int getStudentsWithSatisfactoryGrade() {return studentsWithSatisfactoryGrade;}

    public String getAllGrades() {return allGrades;}
}
