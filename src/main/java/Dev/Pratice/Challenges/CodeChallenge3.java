package Dev.Pratice.Challenges;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2
public class CodeChallenge3
    {
       static void checkNumber()
       {
           int num;
            Scanner sc=new Scanner(System.in);

          log.info("Enter the Number");
            num=sc.nextInt();
            if (num%2==0)
            {
                if (num<=10)
                {
                  log.info("hii");
                }
                else if (num>10 && num<=20)
                {
                  log.info("Hey");
                }
                else
                {
                  log.info("bye");
                }

            }

            else
            {
              log.info("hello");
            }

        }

        public static void main(String[] args)
        {
           CodeChallenge3.checkNumber();
        }

    }
