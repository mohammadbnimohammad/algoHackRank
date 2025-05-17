import java.io.*;
import java.util.regex.*;


public class TagContentExtractor {

        public static void main(String[] args)throws IOException {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

            BufferedReader reader = new BufferedReader
                    (new InputStreamReader(System.in));

            Integer n=Integer.parseInt(reader.readLine());

            Pattern htmlPattern=Pattern.compile("<(.+)>([^<]+)</\\1>");

            for (int i = 0; i < n; i++) {
                String htmlstr=reader.readLine();
                Matcher strMatcher=htmlPattern.matcher(htmlstr);
                boolean isCorrect=false;
                while(strMatcher.find()){
                    System.out.println(strMatcher.group(2));
                    isCorrect=true;
                }
                if(!isCorrect){
                    System.out.println("None");
                }
            }
            reader.close();
        }
    }

