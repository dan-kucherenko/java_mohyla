import java.util.Arrays;

public class StudentsGrades {
    private int[] grades;

    public StudentsGrades(int[] grades) {
        int[] var2 = grades;
        int var3 = grades.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            int i = var2[var4];
            if (i >= 0 && i <= 100) {
                this.grades = grades;
            } else {
                System.out.println("Помилка у введених даних");
                System.exit(1);
            }
        }

    }

    public int getGrades(int indexOfNum) {
        int grade = this.grades[indexOfNum - 1];
        return grade;
    }

    public int[] setGrades(int[] newGrades) {
        if (this.grades.length != newGrades.length) {
            return null;
        } else {
            int[] var2 = this.grades;
            int var3 = var2.length;

            for (int var4 = 0; var4 < var3; ++var4) {
                int i = var2[var4];
                this.grades[i] = newGrades[i];
            }

            return this.grades;
        }
    }

    public int[] addGrades(int newGrade) {
        if (newGrade >= 0 && newGrade <= 100) {
            this.grades = Arrays.copyOf(this.grades, this.grades.length + 1);
            this.grades[this.grades.length - 1] = newGrade;
            return this.grades;
        } else {
            return null;
        }
    }

    public int maxGrade() {
        int maxGrade = this.grades[0];
        int[] var2 = this.grades;
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            int i = var2[var4];
            if (i > maxGrade) {
                maxGrade = i;
            }
        }

        return maxGrade;
    }

    public int minGrade() {
        int minGrade = this.grades[0];
        int[] var2 = this.grades;
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            int i = var2[var4];
            if (i < minGrade) {
                minGrade = i;
            }
        }

        return minGrade;
    }

    public float averageGrade() {
        int sumOfAllGrades = 0;
        int counter = 0;
        int[] var4 = this.grades;
        int var5 = var4.length;

        for (int var6 = 0; var6 < var5; ++var6) {
            int i = var4[var6];
            sumOfAllGrades += i;
            ++counter;
        }

        float averageGrade = (float) sumOfAllGrades / (float) counter;
        return averageGrade;
    }

    public int studentsWithGradeAvMore(double averageGrade) {
        int studentsWithGradeAvPlus = 0;
        int[] var4 = this.grades;
        int var5 = var4.length;

        for (int var6 = 0; var6 < var5; ++var6) {
            int i = var4[var6];
            if ((double) i > averageGrade) {
                ++studentsWithGradeAvPlus;
            }
        }

        return studentsWithGradeAvPlus;
    }

    public int studentsWithGradeAvLess(double averageGrade) {
        int studentWithGradeAvLess = 0;
        int[] var4 = this.grades;
        int var5 = var4.length;

        for (int var6 = 0; var6 < var5; ++var6) {
            int i = var4[var6];
            if ((double) i < averageGrade) {
                ++studentWithGradeAvLess;
            }
        }

        return studentWithGradeAvLess;
    }

    public int studentsWithExcellentGrade() {
        int studentsWithExcellentGrade = 0;
        int[] var2 = this.grades;
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            int i = var2[var4];
            if (i >= 91 && i <= 100) {
                ++studentsWithExcellentGrade;
            }
        }

        return studentsWithExcellentGrade;
    }

    public int studentsWithGoodGrade() {
        int studentsWithGoodGrade = 0;
        int[] var2 = this.grades;
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            int i = var2[var4];
            if (i >= 71 && i <= 90) {
                ++studentsWithGoodGrade;
            }
        }

        return studentsWithGoodGrade;
    }

    public int studentsWithSatisfactoryGrade() {
        int studentsWithSatisfactoryGrade = 0;
        int[] var2 = this.grades;
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            int i = var2[var4];
            if (i >= 60 && i <= 70) {
                ++studentsWithSatisfactoryGrade;
            }
        }

        return studentsWithSatisfactoryGrade;
    }

    public String allGrades() {
        String allGrades = "";
        int[] var2 = this.grades;
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            int i = var2[var4];
            allGrades += i + " ";
        }

        return allGrades;
    }
}