public class main1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("請輸入成績");
        int grade = sc.nextInt();
        if (grade > 100)
            System.out.println("ERROR!!");
        if (grade < 0)
            System.out.println("ERROR!!");
        if (grade >= 60)
            System.out.println("成積及格:" + grade);
        if (grade == 100)
            System.out.println("good");
        if (grade < 60)
            System.out.println("成績不及格:" + grade);
    }
}


