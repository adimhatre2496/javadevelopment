package Dev.Pratice.Challenges;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class CodeChallenge6
    {
        static//static block
        { // only execute once at class loading
          log.info("hiio");
        }

        // instance block
        {// its runs for every object create for it
          log.info("Hello");
        }

        public static void main(String[] args)
        {
            CodeChallenge6 v=new CodeChallenge6();
            CodeChallenge6 v1=new CodeChallenge6();

        }
    }
