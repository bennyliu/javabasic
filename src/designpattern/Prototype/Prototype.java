package designpattern.Prototype;

import java.io.*;

/**
 * Created by bliu13 on 7/2/2015.
 */
public class Prototype implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;
    private String string;

    private SerializableObject obj;

    @Override
    public Object clone() throws CloneNotSupportedException {
        Prototype proto = (Prototype) super.clone();
        return proto;
    }

    public Object deepClone() throws IOException,ClassNotFoundException{

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();


    }

    public String getString() {
        return string;
    }

    public SerializableObject getObj() {
        return obj;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void setObj(SerializableObject obj) {
        this.obj = obj;
    }
}