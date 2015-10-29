package kata4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class KATA4 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String pathname= "/home/joaquin";
        File file= new File (pathname);
        String [] dire=file.list();
        //for (String dire1: dire){
          //  System.out.println(dire1);
        //}
       // print(file.listFiles(),"");
        String from = "/home/joaquin/Imágenes/wallhaven-3590.jpg";
        String to="/home/joaquin/copia.jpg";
        BufferedInputStream input = new BufferedInputStream(new FileInputStream(new File(from)));
        BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(new File(to)));
        
        Date date=new Date();
        while(true){
            int read= input.read();
            if(read<0) break;
            output.write(read);
        }
        System.out.println(new Date().getTime()-date.getTime()+ "msg");
        input.close();
        output.flush();
        output.close();
    }

    private static void print(File[] listFiles, String string) {
        if(listFiles==null){
            return;
        }
        for (File listFile: listFiles){
            System.out.println(string + (listFile.isDirectory()? "+":" ")+listFile.getName());
            if(listFile.isFile() || listFile.isHidden())continue;
            print (listFile.listFiles(), string+"--> ");
        }
    }

}
