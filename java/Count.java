import java.io.*;
import javax.swing.JOptionPane;
import java.util.*;

class Count {
    public static void main(String[] args) throws IOException {
        String fileName;
        int lines = 0, words = 0, characters = 0;
        
        fileName = JOptionPane.showInputDialog("Enter a file name");
        FileInputStream fileStream = new FileInputStream(fileName);
        DataInputStream dataStream = new DataInputStream(fileStream);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(dataStream));
        
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            lines++;
            StringTokenizer tokenizer = new StringTokenizer(line);
            while (tokenizer.hasMoreTokens()) {
                String word = tokenizer.nextToken();
                words++;
                characters += word.length();
            }
        }

        JOptionPane.showMessageDialog(null,
                "Words: " + words + "\nLines: " + lines + "\nCharacters: " + characters,
                "Message",
                JOptionPane.INFORMATION_MESSAGE);
        
        bufferedReader.close(); // close the stream when done
    }
}
