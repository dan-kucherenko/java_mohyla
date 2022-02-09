import java.util.Arrays;

public class TestStudentGrades {
    public static void main(String[] args) {
        int[] grades = {44, 99, 25, 17, 29};
        int[] newGrades = {23, 86, 52, 13};
        StudentsGrades sg = new StudentsGrades(grades);
        //getter
        sg.getGrades(3);
        //setter
        sg.setGrades(newGrades);
        //adder
        sg.addGrades(4);
        //1-й метод знаходження найбільшого числа
        System.out.println("Найбільша оцінка: " + sg.maxGrade());
        //2-й метод знаходження найменшого числа
        System.out.println("Найменша оцінка: " + sg.minGrade());
        //3-й метод знаходження середньої оцінки
        System.out.println("Середня оцінка в группі: " + sg.averageGrade());
        //4-й метод знаходження студентів з оцінкою вище середньої
        System.out.println("Студентів з оцінкою вище середньої: " + sg.studentsWithGradeAvMore(sg.averageGrade()));
        //5-й метод знаходження студентів з оцінкою нижче середньої
        System.out.println("Студентів з оцінкою нижче середньої: " + sg.studentsWithGradeAvLess(sg.averageGrade()));
        //6-й метод знаходження студентів з відмінною оцінкою
        System.out.println("Студентів з відмінною оцінкою: " + sg.studentsWithExcellentGrade());
        //7-й метод знаходження студентів з оцінкою "добре"
        System.out.println("Студентів з оцінкою \"добре\": " + sg.studentsWithGoodGrade());
        //8-й метод знаходження студентів з оцінкою "задовільна"
        System.out.println("Студентів з оцінкою \"задовільна\": " + sg.studentsWithSatisfactoryGrade());
        //усі оцінки групи
        System.out.println("Усі оцінки: " + sg.allGrades());
    }
}
