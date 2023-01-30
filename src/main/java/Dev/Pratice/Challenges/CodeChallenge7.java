package Dev.Pratice.Challenges;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class CodeChallenge7
    {
        public static void change(String s)
        {
            try {
                int p = Integer.parseInt(s);
              log.info(p);
            }
            catch (Exception e){
              log.error("Enter The Valid input"+e);
            }
        }

        public static void main(String[] args)
        {
            Scanner scanner=new Scanner(System.in);
            String x , y;
            System.out.println("Input to Numbers");
            x=scanner.nextLine();
            y=scanner.nextLine();

            CodeChallenge7.change(x);
            CodeChallenge7.change(y);

        }
    }
