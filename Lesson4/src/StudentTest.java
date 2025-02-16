

public class StudentTest {
    int studentIdNamber = 1680090;
    String name = "Alex";
    String surName = "Smirnov";
    int beginningOftraining = 2005;
    int endOfTraining = 2010;
    int averageGradeInMathematic = 4;
    int averageScoreIneconomics = 4;
    int averageGradeInAForeignLanguage = 4;


    public static void main(String[] args) {
        StudentTest student = new StudentTest();
        StudentTest student2 = new StudentTest();
        student2.studentIdNamber = 1680080;
        student2.name = "Pavel";
        student2.surName = "Ivanov";
        student2.beginningOftraining = 2010;
        student2.endOfTraining = 2015;
        student2.averageGradeInMathematic = 5;
        student2.averageScoreIneconomics = 5;
        student2.averageGradeInAForeignLanguage = 5;


        StudentTest student3 = new StudentTest();
        student3.studentIdNamber = 168070;
        student3.name = "Misha";
        student3.surName = "Durov";
        student3.beginningOftraining = 2020;
        student3.endOfTraining = 2025;
        student3.averageGradeInMathematic = 3;
        student3.averageScoreIneconomics = 3;
        student3.averageGradeInAForeignLanguage = 3;
        System.out.println("Средняя арифметическая оценка:" + student.name + ": " + (student.averageGradeInMathematic + student.averageScoreIneconomics + student.averageGradeInAForeignLanguage) / 3);
        System.out.println("Средняя арифметическая оценка:" + student2.name + ": " + (student2.averageGradeInMathematic + student2.averageScoreIneconomics + student2.averageGradeInAForeignLanguage) / 3);
        System.out.println("Средняя арифметическая оценка:" + student3.name + ": " + (student3.averageGradeInMathematic + student3.averageScoreIneconomics + student3.averageGradeInAForeignLanguage) / 3);
        //System.out.println(student3.averageGradeInAForeignLanguage);


    }
}