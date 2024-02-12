package Notes_14_String_and_String_builder;

/*
    Use of String Builder over String:
    1. Performance: StringBuilder is faster than regular string concatenation, especially in loops, due to Java's immutable String objects, which necessitate creating new instances on each concatenation.

    2. Memory Efficiency: StringBuilder dynamically adjusts its internal buffer, avoiding unnecessary intermediate string object creation, thus reducing memory overhead.

    3. Mutability: Unlike String, StringBuilder allows direct modification of its contents, making it ideal for incremental string building, particularly in loops or with large text volumes.
*/

public class StringBuilder {
    public static void main(String[] args) {
        java.lang.StringBuilder builder = new java.lang.StringBuilder();
        for(int i = 0; i < 26; i++){
            char ch = (char) ( 'a' + i);
            builder.append(ch); 
        }

        // String Builder are mutable
        
        System.out.println(builder.toString());

        builder.deleteCharAt(0);    
        System.out.println(builder);
        
        builder.reverse();    
        System.out.println(builder);

    }
}
