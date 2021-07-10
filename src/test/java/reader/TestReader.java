package reader;

import com.alibaba.fastjson.JSON;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestReader implements Reader {


    @Override
    public <T> T readFile(File file, Class<T> t) throws IOException{
        String fileContent = FileUtils.readFileToString(file,"UTF-8");

        T testClass = JSON.parseObject(fileContent, t);

        return testClass;
    }

    @Override
    public <T> List<T> readFiles(File[] files, Class<T> t) throws IOException {

        List<T> list = new ArrayList<>();
        for (File file : files) {
            String fileContent = FileUtils.readFileToString(file,"UTF-8");
            T testClass = JSON.parseObject(fileContent,t);

            list.add(testClass);
        }

        return list;
    }
}
