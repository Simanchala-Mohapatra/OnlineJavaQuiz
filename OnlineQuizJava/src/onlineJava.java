import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Question {
    private String questionText;
    private List<String> options;
    private int correctAnswerIndex;

    public Question(String questionText, List<String> options, int correctAnswerIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getOptions() {
        return options;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }
}

class Quiz {
    private List<Question> questions;
    private int score;

    public Quiz(List<Question> questions) {
        this.questions = questions;
        this.score = 0;
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            List<String> options = question.getOptions();
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + ". " + options.get(i));
            }

            System.out.print("Enter your choice (1-" + options.size() + "): ");
            int userChoice = scanner.nextInt();

            if (userChoice == question.getCorrectAnswerIndex() + 1) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer was: " +
                        options.get(question.getCorrectAnswerIndex()) + "\n");
            }
        }

        System.out.println("Quiz completed! Your score: " + score + "/" + questions.size());
    }
}

 public class onlineJava {
    public static void main(String[] args) {
        List<Question> quizQuestions = new ArrayList<>();
        // Add your questions here (create Question objects)
        // Example:
        // quizQuestions.add(new Question("What is 2 + 2?", List.of("3", "4", "5"), 1));
        // Add more questions as needed
        quizQuestions.add(new Question("What is the sum of 10 and 12 ?", List.of("11","22","17"), 1));
        quizQuestions.add(new Question("Who is the prime minister of india ?", List.of("Mr.Narendra Modi","Amit Shah","Draupadi Murmu"), 0));
        quizQuestions.add(new Question("Who is the most successfull captain of the indian cricket history ?", List.of("MS Dhoni","Sachin Tendulkar","Sourav Ganguly"), 0));
        quizQuestions.add(new Question("Which Programming Language is Widely Used In Web Development ?", List.of("Python","JavaScript","C++"), 1));
        quizQuestions.add(new Question("Which Among The Options is a Front-End Framework ?", List.of("DJango","REACT","Ruby-On-Rails"), 1));
        quizQuestions.add(new Question("Which Among The Options is a Back-End Framework ", List.of("Vue.JS","SPRING BOOT","Angular"), 1));
        quizQuestions.add(new Question("Which language is widely used in Android Development ? ", List.of("JAVA","Python","HTML"), 0));
        quizQuestions.add(new Question("Which language is used in ios app development ?", List.of("GoLang","Swift","Rust"), 1));
        quizQuestions.add(new Question("Which Is An Object Oriented Programming Language ? ", List.of("HTML","C","JAVA"), 2));
        quizQuestions.add(new Question("Which Company Developed Chat-Gpt ?", List.of("Google","Open-Ai","Apple"), 1));
        
        Quiz quiz = new Quiz(quizQuestions);
        quiz.startQuiz();
    }
}
