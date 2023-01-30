package Dev.Pratice.Challenges;

import java.util.Scanner;

public class ChildCode3 extends CodeChallenge17 {

 int b;

    ChildCode3(int a,int b) {
        super(a);
        this.b=b;
        System.out.println(b);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int  a= sc.nextInt();
       int  b= sc.nextInt();

       ChildCode3 code3=new ChildCode3(a,b);

        System.out.println(a+b);





    }
}
