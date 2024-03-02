package basics.Strings;

public class StringBuilderIntro {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Tony Stark");
        System.out.println(name);
        
        
        StringBuilder alphabets = new StringBuilder("");
        System.out.println(alphabets);
        for(char ch = 'a'; ch <= 'z'; ch++) {
            alphabets.append(ch);
        } 
        System.out.println(alphabets);
    }
}
