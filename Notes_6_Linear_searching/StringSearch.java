//DAY-6 Notes

package Notes_6_Linear_searching;

// String can be imagined as array of character

public class StringSearch {
    public static void main(String[] args) {
        String name = "Aman";
        char target = 'u';

        System.out.println(search1(name, target)); // false

        target = 'm';
        System.out.println(search1(name, target)); // true
    }

    static boolean search1(String name, char target){
        // To get the length of string we use length()

        if(name.length() == 0){
            return false;
        }
        else{
            for(int i = 0; i < name.length(); i++){
                if (target == name.charAt(i)){
                    return true;
                }
            }
            return false;
        }
    }

    static boolean search2(String name, char target){
        // To get the length of string we use length()

        if(name.length() == 0){
            return false;
        }
        else{
                for(char ch : name.toCharArray()){ // character array
                    if(ch == target){
                        return true;
                    }
                }
            }
            return false;
    }
}

