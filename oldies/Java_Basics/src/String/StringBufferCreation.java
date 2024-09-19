package String;

public class StringBufferCreation {
    public static void main(String[] args) {
        StringBuffer sampleString = new StringBuffer();
        // By default, if not assigned any value to the constructor, the sampleString here can hold 16 chars
        System.out.println(sampleString.capacity());
        System.out.println();
        // Append content to the StringBuffer
        sampleString.append("hello sir what's up ?");

        System.out.println(sampleString);
        System.out.println(sampleString.reverse());
    }
}