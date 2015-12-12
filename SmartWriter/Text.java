//Text.java

//This class has the aim to describe type text in this problem's domain


public class Text

{
   //stores a string of zeros and ones 
   private String binarySequence;

   //Stores  whole text
   private String Text="";
   
   private final String exit_key="e";

   //gets Text 
   public String getText()
   {
       return Text;
   }
   
   //setter for binary string
   private void setBinarySequence(String binaryValue)
   {
     if(binaryValue.matches("[01]+"))
     binarySequence=binaryValue;
     else if(binaryValue.equals(exit_key))
     {
           System.out.println("Bye,Bye!");
     }
     else
     System.out.print("Not Binary value!\n");
   }
   
   
   
   //adds a character to text based on the binary value
   public void addToText(String binaryValue)
   {
      setBinarySequence(binaryValue); 
      String letter=Keys.getChar(binaryValue);
      Text+=letter;  
   }      

   
   
   
}
