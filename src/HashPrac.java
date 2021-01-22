import com.sun.org.apache.xpath.internal.operations.Equals;
import jersey.repackaged.com.google.common.hash.Hashing;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class HashPrac {

    public static void main(String[] args) throws ParseException {

        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int num=1;

//        for (int i =1; i<=n;i++)
//        {
//            for (int k=1;k<=n-i;k++)
//                System.out.print("  ");
//            for (int j=1;j<=i;j++) {
//                System.out.print(num + "  ");
//                num++;
//            }
//
//            System.out.println();
//
//        }

        for (int i=1; i<=n;i++)
        {
            for (int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1;i<n;i++)
        {
            for (int k=1;k<=n-i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }




    }
}
