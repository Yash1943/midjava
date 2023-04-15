package program13;

public class charfrequency {
        public static void main(String[] args) {
            String str ="Hello friend";
            int[] freq =new int[256];
            for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                freq[ch]++;
            } 
            System.out.println("character frequency in string\""+str+"\":");
            for(int i=0;i<256;i++)
            {
                if(freq[i]>0 && Character.isLetterOrDigit(i))
                {
                    System.out.println((char)i+":"+freq[i]);
                }
            }
        
    }
}
