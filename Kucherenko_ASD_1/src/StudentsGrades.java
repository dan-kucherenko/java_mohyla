import java.util.Arrays;

public class StudentsGrades {
    private int[] grades;

    StudentsGrades(int[] grades) {
        for (int i : grades) {
            if (i >= 0 && i <= 100)
                this.grades = grades;
            else
                System.exit(1);
        }
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
            return grades;
        }
    }

    public int[] addGrades(int newGrade) {
        if (newGrade >= 0 && newGrade <= 100) {
            grades = Arrays.copyOf(grades, grades.length + 1);
            grades[grades.length - 1] = newGrade;
            return grades;
        } else
            return null;
    }

    public int maxGrade() {
        int maxGrade = grades[0];
        for (int i : grades) {
            if (i > maxGrade)
                maxGrade = i;
        }
        return maxGrade;
    }

    public int minGrade() {
        int minGrade = grades[0];
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
        float averageGrade = (float) sumOfAllGrades / counter;
        return averageGrade;
    }

    public int studentsWithGradeAvMore(double averageGrade) {
        int studentsWithGradeAvPlus = 0;
        for (int i : grades) {
            if ((double) i > averageGrade)
                studentsWithGradeAvPlus++;
        }
        return studentsWithGradeAvPlus;
    }

    public int studentsWithGradeAvLess(double averageGrade) {
        int studentWithGradeAvLess = 0;
        for (int i : grades) {
            if (i < averageGrade)
                studentWithGradeAvLess++;
        }
        return studentWithGradeAvLess;
    }

    public int studentsWithExcellentGrade() {
        int studentsWithExcellentGrade = 0;
        for (int i : grades) {
            if (i >= 91 && i <= 100)
                studentsWithExcellentGrade++;
        }
        return studentsWithExcellentGrade;
    }

    public int studentsWithGoodGrade() {
        int studentsWithGoodGrade = 0;

        for (int i : grades) {
            if (i >= 71 && i <= 90)
                studentsWithGoodGrade++;
        }
        return studentsWithGoodGrade;
    }

    public int studentsWithSatisfactoryGrade() {
        int studentsWithSatisfactoryGrade = 0;
        for (int i : grades) {
            if (i >= 60 && i <= 70)
                studentsWithSatisfactoryGrade++;
        }
        return studentsWithSatisfactoryGrade;
    }

    public String allGrades() {
        String allGrades = "";
        for (int i : grades)
            allGrades += i + " ";
        return allGrades;
    }
}