import java.util.Arrays;

public class StudentGradesGeneric<T extends Number> {
    //Number -> Integer,Double,Float...
    private T[] grades;

    StudentGradesGeneric(T[] grades) {
        for (T i : grades) {
            if (i.intValue() >= 0 && i.intValue() <= 100)
                this.grades = grades;
            else
                System.exit(1);
        }
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
            return grades;
        }
    }

    public T[] addGrades(T newGrade) {
        if (newGrade.intValue() >= 0 && newGrade.intValue() <= 100) {
            grades = Arrays.copyOf(grades, grades.length + 1);
            grades[grades.length - 1] = newGrade;
            return grades;
        } else
            return null;
    }

    public T maxGrade() {
        T maxGrade = grades[0];
        for (T i : grades) {
            if (i.floatValue() > maxGrade.floatValue())
                maxGrade = i;
        }
        return maxGrade;
    }

    public T minGrade() {
        T minGrade = grades[0];
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
        float averageGrade = (float) sumOfAllGrades / counter;
        return averageGrade;
    }

    public int studentsWithGradeAvMore(float averageGrade) {
        int studentsWithGradeAvPlus = 0;
        for (T i : grades) {
            if (i.floatValue() > averageGrade)
                studentsWithGradeAvPlus++;
        }
        return studentsWithGradeAvPlus;
    }

    public int studentsWithGradeAvLess(double averageGrade) {
        int studentWithGradeAvLess = 0;
        for (T i : grades) {
            if (i.floatValue() < averageGrade)
                studentWithGradeAvLess++;
        }
        return studentWithGradeAvLess;
    }

    public int studentsWithExcellentGrade() {
        int studentsWithExcellentGrade = 0;
        for (T i : grades) {
            if (i.intValue() >= 91 && i.intValue() <= 100)
                studentsWithExcellentGrade++;
        }
        return studentsWithExcellentGrade;
    }

    public int studentsWithGoodGrade() {
        int studentsWithGoodGrade = 0;

        for (T i : grades) {
            if (i.intValue() >= 71 && i.intValue() <= 90)
                studentsWithGoodGrade++;
        }
        return studentsWithGoodGrade;
    }

    public int studentsWithSatisfactoryGrade() {
        int studentsWithSatisfactoryGrade = 0;
        for (T i : grades) {
            if (i.intValue() >= 60 && i.intValue() <= 70)
                studentsWithSatisfactoryGrade++;
        }
        return studentsWithSatisfactoryGrade;
    }

    public String allGrades() {
        String allGrades = "";
        for (T i : grades)
            allGrades += i + " ";
        return allGrades;
    }
}
