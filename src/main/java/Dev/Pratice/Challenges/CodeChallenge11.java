package Dev.Pratice.Challenges;

public class CodeChallenge11
    {
        static int sum;
        static void list(){

            int a[]={12,52,14,2,4};

            for (int p: a)
            {
                sum= sum+p;
            }

            System.out.println(sum);
        }

        public static void main(String[] args)
        {
            CodeChallenge11.list();
        }
    }
