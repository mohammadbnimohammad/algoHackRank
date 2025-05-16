import java.io.*;

import java.util.regex.*;

public class ValidUserName {
    public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader reader =new BufferedReader
                (new InputStreamReader(System.in));

        Integer n=Integer.parseInt(reader.readLine());

        String regex = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";

        Pattern pattern=Pattern.compile(regex);
        for (int i = 0; i < n; i++) {
            String userName=reader.readLine();

            Matcher matcher=pattern.matcher(userName);

            if (matcher.matches()) {
                System.out.println("Valid");
            }else{
                System.out.println("Invalid");
            }
        }
        reader.close();
    }
}
