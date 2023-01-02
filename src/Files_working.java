import java.io.*;

public class Files_working implements file_operations {

    @Override
    public FamilyTree read_files() throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("backup"));
        return (FamilyTree) in.readObject();
        
    }

    @Override
    public void write_files(Serializable homo) throws IOException {

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("backup"));
        out.writeObject(homo);
        out.close();
    }
}