import java.util.Arrays;

public class main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Anagrams Anagrams = new Anagrams();
        Anagrams.my_anagrams();
    }

    public static class Anagrams {
        static class result {
            public static String anagrams(String s1, String s2) {
                // return "YES" if s1 and s2 are anagrams and return "NO" otherwise
                String output = "YES";


                s1 = s1.replaceAll("\\s", "");
                char[] s1_array = s1.toCharArray();
                Arrays.sort(s1_array);

                s2 = s2.replaceAll("\\s", "");
                char[] s2_array = s2.toCharArray();
                Arrays.sort(s2_array);

                if (!Arrays.equals(s1_array, s2_array)) {
                    output = "NO";
                }

                return output;
            }
        }

        public void my_anagrams() throws Exception {
            String s1 = "asas";

            String s2 = "sas";

            String t = result.anagrams(s1, s2);

            // from user-2

            System.out.println("output original: " + t);
        }
    }
}
