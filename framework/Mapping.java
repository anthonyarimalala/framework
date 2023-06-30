package etu2033.framework;

public class Mapping{
    String className = "default";
    String method = "default";

    public Mapping(String className, String method) {
        this.className = className;
        this.method = method;
    }
    public Mapping() {
    }

    public String getMethod(){
        return this.method;
    }

    public String getClassName(){
        return this.className;
    }

}