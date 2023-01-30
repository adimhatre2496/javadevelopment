package Dev.Pratice.Challenges;

public class ChildCode2 extends CodeChallenge16{
    @Override
    public void codeParent() {
        super.codeParent();
        System.out.println("hello");
    }

    public static void main(String[] args) {
        ChildCode2 code2=new ChildCode2();
        code2.codeParent();
    }
}
