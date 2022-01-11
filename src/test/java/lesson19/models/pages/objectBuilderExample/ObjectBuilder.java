package lesson19.models.pages.objectBuilderExample;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ObjectBuilder {

    public static <T> T buildObject(Class<T> classType) {
        T returnedObject = null;
        Class<?>[] parameters = new Class[]{String.class, Integer.class};
        Constructor<T> constructor;

        try {
            constructor = classType.getConstructor(parameters);
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("[ERR] The class must have a constructor with parameters " + Arrays.toString(parameters), e);
        }

        try {
            returnedObject =  constructor.newInstance("Teo", 18);
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException e){e.printStackTrace();}

        return returnedObject;
    }
}
