package Notes_14_String_and_String_builder;

// check whethergiven string is palindrom or not

public class palindrom {
    public static void main(String[] args) {
        String str1 = "abcdcbA";
        String str2 = "abcdeba";
        String str3 = "";

        System.out.println(checkPlaindrom(str1));
        System.out.println(checkPlaindrom(str2));        
        System.out.println(checkPlaindrom(str3));
    }

    public static boolean checkPlaindrom(String str){
        if(str == null){
            return true;
        }
        str = str.toLowerCase(); // ignore case
        char []string = str.toCharArray();

        for(int s = 0, e = string.length - 1; s <= e; s++, e--){
            if(string[s] != string[e]){
                return false;
            }
        }

        return true;
    }
}
