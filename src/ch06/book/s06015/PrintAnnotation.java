package ch06.book.s06015;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;


@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)

public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
}
