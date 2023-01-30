package Dev.Pratice.Challenges;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class CodeChallenge2 {

    CodeChallenge2()
    {
      this(2,6);
    log.info("Default");

    }

    CodeChallenge2(int a)
    {

      log.info(a);

    }

    CodeChallenge2(int a, int b)
    {
        this(89);

      log.info(a+b);
    }

    public static void main(String[] args) {

        CodeChallenge2 p=new CodeChallenge2();


    }
}
