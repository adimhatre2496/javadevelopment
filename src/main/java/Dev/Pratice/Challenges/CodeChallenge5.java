package Dev.Pratice.Challenges;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class CodeChallenge5
    {
        static int interger;
        static char charater;
        static float decimal;
        static boolean truth;
        CodeChallenge5()
        {
          log.info(interger+ "\n" +charater+ "\n" +decimal+ "\n" +truth);
        }

        public static void main(String[] args)
        {
            CodeChallenge5 p=new CodeChallenge5();
        }

    }
