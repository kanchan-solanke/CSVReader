import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws Exception {
        String line = "";
        String splitBy = ",";
        try
        {
//parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\v-ajawanjal\\Documents\\New Text Document.csv"));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] AddressBook = line.split(splitBy);    // use comma as separator
                System.out.println("AddressBook [First Name=" + AddressBook[0] + ", Last Name=" + AddressBook[1] + ", Address=" + AddressBook[2] + ", City =" + AddressBook[3] + ", State= " + AddressBook[4] + ", Mobile Number= " + AddressBook[5] +",  EmailId= " + AddressBook[6]+",  PinCode= " + AddressBook[7]+"]");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
