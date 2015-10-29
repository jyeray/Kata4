package kata4;

import java.io.IOException;
import java.util.ArrayList;


public class KATA4 {

    public static void main(String[] args) throws IOException{
        String nameFile="/home/joaquin/NetBeansProjects/KATA4/DATA/emailsfilev1.txt";
        ArrayList<String> mailArray=MailListReader.read(nameFile);
        System.out.println(mailArray.size());

        Histogram<String> histogram= new MailHistogramBuilder().build(mailArray);
        new HistogramDisplay(histogram).execute();
        
    }


}
