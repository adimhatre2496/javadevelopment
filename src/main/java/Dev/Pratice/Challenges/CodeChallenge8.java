package Dev.Pratice.Challenges;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class CodeChallenge8 {

    void method1()
    {
        this.method2();
      log.info("non static method");
    }

    static void method2()
    {
      log.info("static method");
    }

    void access()
    {
        this.method1();
    }

    public static void main(String[] args) {

        CodeChallenge8 challenge8=new CodeChallenge8();
        challenge8.access();
    }

}
