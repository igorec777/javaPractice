package lesson2.task3;

import javassist.CannotCompileException;

public class Program {

    static javassist.ClassPool cp = javassist.ClassPool.getDefault();

    public static void main(String... args) throws CannotCompileException {
        for (int i = 0; ; i++) {
            Class c = cp.makeClass("Class" + i).toClass();
        }
    }
}
