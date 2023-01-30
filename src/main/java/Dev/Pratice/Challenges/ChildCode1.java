package Dev.Pratice.Challenges;

public class ChildCode1 extends CodeChallenge15
    {
        @Override
        public void code15()
        {
            super.code15();
            System.out.println("Child");
        }

        public static void main(String[] args)
        {
            ChildCode1 code1=new ChildCode1();
            code1.code15();
            code1.challenge();
            code1.code15();
        }
    }
