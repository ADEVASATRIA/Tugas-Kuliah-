package admin.quiz.game2;
import java.util.Scanner;
import java.util.*;

class quiz{
    private String question;
    private String answer;
    private String answer2;
    private String answer3;
    private String answer4;
    private String correctanswer;

    quiz(String question, String answer, String answer2, String answer3, String answer4,String correctanswer){
        this.question = question;
        this.answer = answer;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correctanswer = correctanswer;
    }
    
    public String getquestion(){
        return question;
    }
    public String getanswer(){
        return answer;
    }
    
    public String getanswer2(){
    return answer2;
    }
    public String getanswer3(){
        return answer3;
    }
    
    public String getanswer4(){
        return answer4;
    }
    
    public String getcorrectanswer(){
        return correctanswer;
    }
}
public class ADMINQUIZGAME2 {
    public static void main(String[] args) {
        List<quiz> c = new ArrayList<quiz>();
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int ch;
        int nomor = 0; 
        do{
            System.out.println("================================");
            System.out.println("| GAME *************** #ADMIN  |");
            System.out.println("| *** WHO WANTS ************** |");
            System.out.println("| ************ TO BE MILIONERE |");
            System.out.println("================================");
            System.out.println("| 1. Add Question  ");
            System.out.println("| 2. Delete Question ");
            System.out.println("| 3. Display The question ");
            System.out.println("| 0. EXIT");
            System.out.print("| Enter your choice : ");

            ch = s.nextInt();
            
            switch(ch){
                case 1:
                    nomor++;
                    System.out.println("\n\n");
                    System.out.print("Nomor soal : " + nomor + "\n");
                    System.out.print("Masukkan soal anda : ");
                    String question = s1.nextLine();
                    System.out.print("masukkan jawaban A  : ");
                    String answer = s1.nextLine();
                    System.out.print("Masukkan jawaban B : ");
                    String answer2 = s1.nextLine();
                    System.out.print("masukkan jawaban C : ");
                    String answer3 = s1.nextLine();
                    System.out.print("Masukkan jawaban D : ");
                    String answer4 = s1.nextLine();
                    System.out.print("Masukkan pilihan jawaban yang benar : ");
                    String correctanswer = s1.nextLine();
                    
                    c.add(new quiz(question,answer,answer2,answer3,answer4,correctanswer));
                    break;
                case 2:
                    System.out.println("========================================="); 
                   
                    break;
                case 3:
                    System.out.println("\n\n");
                    System.out.println("===============================================");
                    System.out.println("$ | Berikut Pertanyaan yang sudah di simpan | $");
                    System.out.println("===============================================");
                    
                    for(int i = 0; i < nomor; i++){
                        System.out.println((i+1) + ". " + c.get(i).getquestion() + "\n" + 
                                "   A. " + c.get(i).getanswer() + "\n" + "   B. " + c.get(i).getanswer2() + "\n" + 
                                "   C. " + c.get(i).getanswer3() + "\n" + "   D. " + c.get(i).getanswer4());
                        System.out.println("jawaban benar no " + (i+1) + " = " + c.get(i).getcorrectanswer() + "\n");
                        
                    }
                    
                    
                    break;
                    

                            
            }
        }while(ch!=0);
    } 
}
