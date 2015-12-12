//Keys.java

//This class provide methods to convert binary sequences to char
//small binary sequences for frequent letters
//large sequences for rare letters
public class Keys
{
   //Maps binary strings to characters as strings 
   private static final  String[][] mapArray={{"0","."},{"1",","},{"00","e"},{"01","E"},{"10","t"},{"11","T"},
   {"000","a"},{"001","A"},{"010","o"},{"011","O"},{"100","i"},{"101","I"},{"110","n"},{"111","N"},{"0000","s"},
   {"0001","S"},{"0010","r"},{"0011","R"},{"0100","h"},{"0101","H"},{"0110","d"},{"0111","D"},{"1000","l"},
   {"1001","L"},{"1010","u"},{"1011","U"},{"1100","m"},{"1101","M"},{"1110","f"},{"1111","F"},{"00000","p"},
   {"00001","P"},{"00010","g"},{"00011","G"},{"00100","w"},{"00101","W"},{"00110","b"},{"00111","B"}
   ,{"01000","v"},{"01001","V"},{"01010","k"},{"01011","K"},{"01100","x"},{"01101","X"},{"01110","j"},
   {"01111","J"},{"10000","q"},{"10001","Q"},{"11000","z"},{"11001","Z"}};

   //returns character as string
   //according to the binary value
   public static String getChar(String binaryString)
   {
     String character="";
     for(String[] row : mapArray )
     {
       if(binaryString.equals(row[0]))
       character=row[1];
     }
     
     return character;
   }
}
