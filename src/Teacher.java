public class Teacher extends Person implements Examiner {
    public Teacher(String name, String surname) {
        super(name, surname);
        System.out.println("creatin teacher: " + name + " " + surname);
    }

    public Exam[] createExams(int numberOfStudents) {
        Exam[] exams = new Exam[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            exams[i] = createExam();
        }
        System.out.println("teacher created " + numberOfStudents + "exams");
        return exams;
    }

    private Exam createExam() {
        Exam exam = new Exam(5);
        exam.addQuestion(new Question(1, "1st Question content!", new String[]{"1st answer", "2nd answer", "3rd  answer"}, 1));
        exam.addQuestion(new Question(2, "1st Question content!", new String[]{"1st answer", "2nd answer", "3rd  answer"}, 2));
        exam.addQuestion(new Question(3, "1st Question content!", new String[]{"1st answer", "2nd answer", "3rd  answer"}, 0));
        exam.addQuestion(new Question(4, "1st Question content!", new String[]{"1st answer", "2nd answer", "3rd  answer"}, 1));
        exam.addQuestion(new Question(5, "1st Question content!", new String[]{"1st answer", "2nd answer", "3rd  answer"}, 0));
        return exam;
    }

    @Override
    public void evaluateExams(Exam[] exams) {
for(Exam exam : exams){
    System.out.println("teacher evaluating " + exam.getOwner() + " exam");
    exam.calculatePoints();
    System.out.println(exam.getOwner().toString() + " point scored: " + exam.getPointScored());
    System.out.println();
}
    }
}
