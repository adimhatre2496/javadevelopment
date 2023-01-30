package Dev.Pratice.Challenges;

import lombok.extern.log4j.Log4j2;

@Log4j2
    public class CodeChallenge9 
    {
    
        public static void code()
        {
            for (int i=1;i<=50;i++)
            {
                if(i%3==0 || i%5==0)
                {
                    if(i%3==i%5)
                    {
                        continue;
                    }
                  log.info(i);
                }
            }
        }
    
        public static void main(String[] args) 
        {
    
            CodeChallenge9.code();
    
        }
    
    
    }
