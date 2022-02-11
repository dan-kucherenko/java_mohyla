public class TestStudentGrades {
    public static void main(String[] args) {
        int[] grades = {44, 99, 25, 17, 75, 64};
        int[] newGrades = {23, 86, 52, 13, 58, 9};
        StudentsGrades sg = new StudentsGrades(grades);
        System.out.println("Бажаний символ" + sg.getGrades(3));
        sg.setGrades(newGrades);
        sg.addGrades(4);
        System.out.println("Найбільша оцінка: " + sg.getMaxGrade());
        System.out.println("Найменша оцінка: " + sg.getMinGrade());
        System.out.println("Середня оцінка в группі: " + sg.averageGrade());
        System.out.println("Студентів з оцінкою вище середньої: " + sg.getStudentsWithGradeAvPlus());
        System.out.println("Студентів з оцінкою нижче середньої: " + sg.getStudentsWithGradeAvLess());
        System.out.println("Студентів з відмінною оцінкою: " + sg.getStudentsWithExcellentGrade());
        System.out.println("Студентів з оцінкою \"добре\": " + sg.getStudentsWithGoodGrade());
        System.out.println("Студентів з оцінкою \"задовільна\": " + sg.getStudentsWithSatisfactoryGrade());
        System.out.println("Усі оцінки: " + sg.getAllGrades());
    }
}
