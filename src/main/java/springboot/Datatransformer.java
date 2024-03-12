package springboot;


import org.mapstruct.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Component
public class Datatransformer {

    @Qualifier
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface convertToUpperCase {}

    @convertToUpperCase
    public String convertToUpperCase(String b) {
        return ObjectUtils.isEmpty(b) ? null : b.toUpperCase();
    }
}
