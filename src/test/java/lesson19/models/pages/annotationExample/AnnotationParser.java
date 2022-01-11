package lesson19.models.pages.annotationExample;

import lesson19.models.ComponentCssSelector;


public class AnnotationParser {
    public static <Type> String printAnnotationValue(Class<Type> classType) {
        // <Type>: "type" là do mình đặt

        String componentCssSelector = null;

        try {
            componentCssSelector = classType.getAnnotation(ComponentCssSelector.class).value();
        } catch (Exception ignored) {}
        if (componentCssSelector==null){
            throw new IllegalArgumentException("[ERR] Please provide @ComponentCssSelector");
        }
        return componentCssSelector;
    }

    public static void main(String[] args) {
        System.out.println(AnnotationParser.printAnnotationValue(WithAnnotation.class));
        System.out.println(AnnotationParser.printAnnotationValue(WithoutAnnotation.class));
    }
}
