import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


class IdentifierTest {
    Identifier id = new Identifier();

    @Test
    void validateEmptyString() {
        assertFalse(id.validateIdentifier(""));
    }

    @Test
    void validateTooLongString() {
        assertFalse(id.validateIdentifier("nomemuitoextremogrande"));
    }

    @Test
    void validateOnlyNumberString(){
        assertFalse(id.validateIdentifier("123456"));
    }

    @Test
    void validateStartWithLetterNumberString(){
        assertTrue(id.validateIdentifier("a23456"));
    }

    @Test
    void validateStartWithSpecialCharacterString(){
        assertFalse(id.validateIdentifier("@nome"));
    }

    @Test
    void validateStringWithSpecialCharacter(){
        assertFalse(id.validateIdentifier("ga/bi"));
    }

    @Test
    void validateEndWithNumberString(){
        assertFalse(id.validateIdentifier("12345a"));
    }

    @Test
    void validateOneCharacterString(){
        assertTrue(id.validateIdentifier("a"));
    }

    @Test
    void validateOneNumberString(){
        assertFalse(id.validateIdentifier("1"));
    }

    @Test
    void validateEndsWithNumber6String(){
        assertTrue(id.validateIdentifier("exato6"));
    }

    @Test
    void validateStartsWithNumber6String(){
        assertFalse(id.validateIdentifier("6exato"));
    }

    @Test
    void validateValidString(){
        assertTrue(id.validateIdentifier("gabi"));
    }

    @Test
    void validateValidStringWithNumbers(){
        assertTrue(id.validateIdentifier("no123"));
    }
}