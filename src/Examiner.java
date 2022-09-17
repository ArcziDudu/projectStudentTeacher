public interface Examiner {
    Exam[] createExams(int numberOfStudents);
    void evaluateExams(Exam[] exams);
}
