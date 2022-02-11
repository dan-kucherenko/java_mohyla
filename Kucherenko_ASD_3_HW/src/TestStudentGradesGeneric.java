public class TestStudentGradesGeneric {
    public static void main(String[] args) {
        Float[] grades = {12.45f, 32.86f, 98.5f, 3.5f};
        Float[] newGrades = {45.12f, 86.32f, 5.85f, 5.3f};
        StudentGradesGeneric<Float> sgg = new StudentGradesGeneric<>(grades);
        sgg.getGrades(3);
        sgg.setGrades(newGrades);
        sgg.addGrades(4.5f);
        System.out.println("Найбільша оцінка: " + sgg.maxGrade());
        System.out.println("Найменша оцінка: " + sgg.minGrade());
        System.out.println("Середня оцінка в группі: " + sgg.averageGrade());
        System.out.println("Студентів з оцінкою вище середньої: " + sgg.studentsWithGradeAvMore(sgg.averageGrade()));
        System.out.println("Студентів з оцінкою нижче середньої: " + sgg.studentsWithGradeAvLess(sgg.averageGrade()));
        System.out.println("Студентів з відмінною оцінкою: " + sgg.studentsWithExcellentGrade());
        System.out.println("Студентів з оцінкою \"добре\": " + sgg.studentsWithGoodGrade());
        System.out.println("Студентів з оцінкою \"задовільна\": " + sgg.studentsWithSatisfactoryGrade());
        System.out.println("Усі оцінки: " + sgg.allGrades());

    }
}
