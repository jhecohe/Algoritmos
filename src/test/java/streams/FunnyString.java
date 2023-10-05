package streams;

import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class FunnyString {

	@Test
	void validateStrings() {
		String funny = "lmnop";
		
		Stream.of(funny.split(""))
		.forEach(l -> Character.toChars(l.ch));
	}
}
