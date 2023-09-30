package java8;


@FunctionalInterface
interface StringTransformer {
    String transform(String input);
}

public class FunctionalInterfaceTransformation {
    public static void main(String[] args) {
        String inputText = "Merhaba, Dunya!";

        StringTransformer toUpperCaseTransformer = input -> input.toUpperCase();
        String transformedText = toUpperCaseTransformer.transform(inputText);

        System.out.println("Original text: " + inputText);
        System.out.println("Transformed text: " + transformedText);
    }
}
