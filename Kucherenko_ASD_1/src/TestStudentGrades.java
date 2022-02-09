public class TestStudentGrades {
    public static void main(String[] args) {
        int[] grades = {44, 99, 25, 17, 29};
        int[] newGrades = {23, 86, 52, 13};
        StudentsGrades sg = new StudentsGrades(grades);
        sg.getGrades(3);
        sg.setGrades(newGrades);
        sg.addGrades(4);
        System.out.println("Найбільша оцінка: " + sg.maxGrade());
        System.out.println("Найменша оцінка: " + sg.minGrade());
        System.out.println("Середня оцінка в группі: " + sg.averageGrade());
        System.out.println("Студентів з оцінкою вище середньої: " + sg.studentsWithGradeAvMore(sg.averageGrade()));
        System.out.println("Студентів з оцінкою нижче середньої: " + sg.studentsWithGradeAvLess(sg.averageGrade()));
        System.out.println("Студентів з відмінною оцінкою: " + sg.studentsWithExcellentGrade());
        System.out.println("Студентів з оцінкою \"добре\": " + sg.studentsWithGoodGrade());
        System.out.println("Студентів з оцінкою \"задовільна\": " + sg.studentsWithSatisfactoryGrade());
        System.out.println("Усі оцінки: " + sg.allGrades());
    }
}
