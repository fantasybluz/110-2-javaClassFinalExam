import java.util.*;

class student_grade {
    String id;
    String name;
    String depart;
    int grade;
    int bonus;
    int final_grade;
}

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("請輸入共有幾位同學資料需要輸入:");
        int dataCase = sc.nextInt();
        student_grade[] table_1 = new student_grade[dataCase];
        int value, tax, k = 0;
        String sel, temp;
        sel = sc.nextLine();
        while (k < dataCase) {
            table_1[k] = new student_grade();
            System.out.printf("請輸入學號:");
            table_1[k].id = sc.nextLine();
            System.out.printf("請輸入姓名:");
            table_1[k].name = sc.nextLine();
            System.out.printf("請輸入班級:");
            table_1[k].depart = sc.nextLine();
            System.out.printf("請輸入原始成績:");
            table_1[k].grade = sc.nextInt();
            System.out.printf("請輸入課程加分:");
            table_1[k].bonus = sc.nextInt();
            table_1[k].final_grade =  table_1[k].grade + table_1[k].bonus;
            sc.nextLine();
            k ++;
        }
        System.out.println("學生登記表如下");
        System.out.printf("學號\t 姓名\t班級\t原始成績 加分\t最終成績\n");
        for (int i=0; i<k; i++) {  
            System.out.printf("%s ", table_1[i].id);
            System.out.printf("%s\t", table_1[i].name);
            System.out.printf("%s", table_1[i].depart);
            System.out.printf("%d\t ", table_1[i].grade);
            System.out.printf("%d\t", table_1[i].bonus);
            System.out.printf("%d\n", table_1[i].final_grade);
        }
    }
}