import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;

class Data {
  public static void main(String[] args){
    try {
      String text = "";

      File file = new File("file_lama.txt");
      Scanner fileScanner = new Scanner(file);

      while (fileScanner.hasNextLine()) {
          text += fileScanner.nextLine() + "\n";
      }
      
      fileScanner.close();

      try (PrintWriter writer = new PrintWriter("file_lama_cpy.txt")) {
          writer.println(text);
      }

      System.out.println("Hii zakwan ajarin aku dong ");

    } catch (FileNotFoundException err) {
      System.out.println("File not found");
    }
  }
} 