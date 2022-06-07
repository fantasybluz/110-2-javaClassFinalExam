import java.util.*;

class student {
    String student_id;
    String studentName;
    String depart;
    int grade;
    int chinese;
    int math;
}

public class arrayObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student[] class_A = new student[2];
        int i = 0;
        int step = class_A.length;
        System.out.println("是否繼續輸入? 1/0");
        int stop = sc.nextInt();
        sc.nextLine();
        while (i < step && stop == 1) {
            class_A[i] = new student();
            System.out.println("請輸入學號");
            class_A[i].student_id = sc.nextLine();
            System.out.println("請輸入姓名");
            class_A[i].studentName = sc.nextLine();
            System.out.println("請輸入科系");
            class_A[i].depart = sc.nextLine();
            System.out.println("請輸入年級");
            class_A[i].grade = sc.nextInt();
            System.out.println("請輸入國文成績");
            class_A[i].chinese = sc.nextInt();
            System.out.println("請輸入數學成績");
            class_A[i].math = sc.nextInt();
            System.out.println("是否繼續輸入? 1/0");
            stop = sc.nextInt();
            sc.nextLine();
            i++;
        }
        System.out.printf("學號\t\t姓名\t科系\t年級\t國文\t數學\n");
        for(int a =0;a<class_A.length;a++)
        {
            System.out.printf("%s \t", class_A[a].student_id);
            System.out.printf("%s \t", class_A[a].studentName);
            System.out.printf("%s \t", class_A[a].depart);
            System.out.printf("%s \t", class_A[a].grade);
            System.out.printf("%s \t", class_A[a].chinese);
            System.out.printf("%s \t\n", class_A[a].math);
        }
    }
}
