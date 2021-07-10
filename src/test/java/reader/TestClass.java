package reader;

import com.alibaba.fastjson.annotation.JSONField;

public class TestClass {

    @JSONField(name = "name", ordinal = 1)
    private String name;

    @JSONField(name = "version", ordinal = 2)
    private String version;

    @JSONField(name = "number", ordinal = 3)
    private int number;

    public TestClass(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public TestClass() {
    }

    public TestClass(String name, String version, int number) {
        this.name = name;
        this.version = version;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
