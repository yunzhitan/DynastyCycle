package reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
    * *@author Veritas
    * *@create 2021/7/6 21:28
 * */

public interface Reader {

    public <T> T readFile(File file,Class<T> t) throws IOException;

    public <T> List<T> readFiles(File[] files,Class<T> t) throws IOException;

}
