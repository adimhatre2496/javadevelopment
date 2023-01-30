package Dev.Pratice.Challenges;
import lombok.extern.log4j.Log4j2;

import java.util.*;
@Log4j2
public class CodeChallenge10
    {
        public static void displayLimits()
        {
          log.info("Min value of Short "+Short.MIN_VALUE+" Max value of Short "+Short.MAX_VALUE);
          log.info("Min Value of Integer "+Integer.MIN_VALUE+" Max value of Integer "+Integer.MAX_VALUE);
          log.info("Min Value of Byte "+Byte.MIN_VALUE+" Max value of Byte "+Byte.MAX_VALUE);
          log.info("Min Value of Long "+Long.MIN_VALUE+" Max value of Long "+Long.MAX_VALUE);
        }

        public static void main(String[] args)
        {
            CodeChallenge10.displayLimits();
        }
    }
