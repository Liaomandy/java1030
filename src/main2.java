public class main2 {
    public static void main(String[]args){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("請輸入成績");
        int grade=sc.nextInt();
        if(grade>=80)
        {
         System.out.println("A");
        }
        else
            if (grade >= 70 | grade < 80) {
            System.out.println("B");
        }
        else
            if (grade >= 60 | grade < 70) {
            System.out.println("C");
        }
        else
         if(grade<60){
         System.out.println("F");
        }
        }
}
