package program10;
import java.io.File;

public class FileDirectory {
    public static void main(String[] args) {
        String fileName =args[0];
        File FileName=new File(fileName);
        if(! FileName.exists())
        {
            System.out.println("The File Or Directory not exist.");
            return ;
        }
        if(FileName.isFile())
        {
            long fileSize =FileName.length();
            System.out.println("The size of the file"+fileSize+"bytes");
        }
        else if(FileName.isDirectory())
        {
            System.out.println("The directory contain the follwing file:");
            File[]files=FileName.listFiles();
            for(File f:files)
            {
                System.out.println(f.getName());
            }
        }
    }
}
