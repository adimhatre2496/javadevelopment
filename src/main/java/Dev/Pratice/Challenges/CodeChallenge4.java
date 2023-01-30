package Dev.Pratice.Challenges;

import lombok.extern.log4j.Log4j2;

import java.util.Random;
@Log4j2
public class CodeChallenge4
    {
      static void generate()
        {
            Random r=new Random();
            int num;
            for (int i=1; i<=20; i++)
            {
                do
                {
                    num=r.nextInt(200);
                }
                while (num<100);
              log.info(num);

            }
        }

        public static void main(String[] args)
        {
          CodeChallenge4.generate();
        }

    }
