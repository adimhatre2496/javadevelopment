package Dev.Pratice.Challenges;

public class CodeChallenge14
    {
        private int a;
        private CodeChallenge14(){
            System.out.println("hii");
        }
        private void accessModifier(){
           a=10;
            System.out.println(a);
        }

        public static void main(String[] args) {
            CodeChallenge14 challenge14=new CodeChallenge14();
            challenge14.accessModifier();
        }
    }