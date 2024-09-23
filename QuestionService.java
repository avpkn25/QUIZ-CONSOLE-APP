import java.util.Scanner;

public class QuestionService {
    Question [] questions = new Question[5];
    String [] selection = new String[5];
    QuestionService(){
        questions[0] = new Question(1, "size of int", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "size of double", "2", "6", "4", "8", "8");
        questions[2] = new Question(3, "size of char", "2", "6", "4", "8", "2");
        questions[3] = new Question(4, "size of long", "2", "6", "4", "8", "8");
        questions[4] = new Question(5, "size of boolean", "1", "2", "4", "8", "1");
    }

    public void playQuiz(){
        int i = 0;
        Scanner sc = new Scanner(System.in);
        for(Question q : questions){
            System.out.println("Question :"+q.getId()+" What is the "+q.getQuestion()+" data type?");
            System.out.println(q.getOption1()+" "+q.getOption2()+" "+q.getOption3()+" "+q.getOption4());
            selection[i++] = sc.nextLine();
        }

        System.out.println("Your answers are: ");
        for(int j = 0; j < selection.length; j++){
            System.out.println("Question :"+(j+1)+" Your Answer: "+selection[j]+" and Correct answer: "+questions[j].getAnswer());
        }
        sc.close();
    }
    public void printScore(){
        int score = 0;
        int i = 0;
        for(Question q : questions){
            if(selection[i++].equals(q.getAnswer())){
                score++;
            }
        }
        System.out.println("Your Score is: "+score);
    }
}
