package Notes_14_String_and_String_builder;

/*
    two ways you can compare:-

    1. == method: == is comparator, == will checks reference variable and values.
    2. .equals() method: used this when just wants to check values, not references.
*/
public class Comparision {
    public static void main(String[] args) {
        String a = "Kunal";
        String b = "Kunal";

        // ==
        System.out.println(a == b); // true

        // how to create two object of same values
        String a1 = new String("Kunal");
        String a2 = new String("Kunal");
        // Its acctually creating two objects outside string pool, but inside heap only.

        System.out.println(a1 == a2); // false

        System.out.println(a1.equals(a2)); // true

        // if u wants to fetch any particular index value 
        // u cannot do like a[0] No, we cannot do with string, u can use .charAt()
        System.out.println(a.charAt(0)); // K
    }
}
