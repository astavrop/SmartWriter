//Text.java test class

import java.util.Scanner;

public class TestText

{
  public static void main(String[] args)
  {
    System.out.println("Welcome to Smart Writer! \nHere we write normal text by using 0,1 and enter!\nType e for exit");
    Scanner scan=new Scanner(System.in);
    Text insText=new Text();
    String in="e";
    do 
    {
      if(in.equals(11111))
      {
        System.out.println("You wrote:" + insText.getText());
      }
      else
      {
      in=scan.next();
      insText.addToText(in);
      System.out.print(insText.getText());
      }
    }while(!in.equals("e"));
  }
}
