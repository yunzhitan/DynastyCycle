package reader;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author Veritas
 * @create 2021/7/7 9:33
 */
public class TxtReader implements Reader{

    @Override
    public <T> T readFile(File file, Class<T> t) throws IOException {
        return null;
    }

    @Override
    public <T> List<T> readFiles(File[] files, Class<T> t) throws IOException {
        return null;
    }
}
