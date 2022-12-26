package optional;

import java.util.Optional;

public class OptionalExamble {
    public static void main(String[] args) {
        String value = "    sathish   ";
        System.out.println(value);

        Optional<String> optionalvalue = Optional.of(value);
        optionalvalue.filter(res -> res.contains("sathish"))
                .map(String::trim)
                .ifPresent(res -> System.out.println(res));
    }
}
