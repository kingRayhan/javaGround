package utils;

public class Data {

    private int index;
    private String data;

    public Data(int index, String data) {
        this.index = index;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Data{" +
                "index=" + index +
                ", data='" + data + '\'' +
                '}';
    }
}
