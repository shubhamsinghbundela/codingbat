// Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)

// countYZ("fez day") → 2
// countYZ("day fez") → 2
// countYZ("day fyyyz") → 2

public class CountYZ {
    public static void main(String[] args) {
        System.out.println(countYZ("!!day--yaz!!"));
    }

    public static int countYZ(String str) {
        str = str.toLowerCase();
        String[] str1 = str.split("[^a-zA-Z]");
        int count = 0;
        for (String ele : str1) {
            if (ele.equals("")) {
                continue;
            }
            if (ele.charAt(ele.length() - 1) == 'z' || ele.charAt(ele.length() - 1) == 'y') {
                count++;
            }
        }
        return count;
    }

}
