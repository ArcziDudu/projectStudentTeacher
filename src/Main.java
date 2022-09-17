public class Main {
    public static void main(String[] args) {
       start();
    }

    private static void start() {
        Examiner teacher = new Teacher("Krzysztof", "Jarzyna");
        Examinated[] students = new Student[]{
                new Student("Rafał", "Mazgaj"),
                new Student("Roman", "Zupa"),
                new Student("Michał", "Cukierek")
        };
        System.out.println();
        Exam[] exams = teacher.createExams(students.length);
        for(int i = 0; i< students.length; i++){
            students[i].writeExam(exams[i]);
        }
        System.out.println();
        teacher.evaluateExams(exams);
    }
}