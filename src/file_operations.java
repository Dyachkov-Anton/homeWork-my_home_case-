import java.io.*;

public interface file_operations {
        Object read_files() throws IOException, ClassNotFoundException;

        void write_files(Serializable homo) throws IOException;

    }