package util.validator;

public class PersonalIDValidator {
    
    public enum PersonalIDValidateResult {
        EMPTY,
        ERROR_FORMAT,
        INVALLID,
        PASS
    };
    
    public static final int PERSONAL_ID_DIGIT_NUM_VALID = 12;

    private PersonalIDValidator() {
    }
    
    public static PersonalIDValidateResult validate(String personalIDText) {
        String input = personalIDText.trim();
        
        if (input.isEmpty()) {
            return PersonalIDValidateResult.EMPTY;
        }
        
        try {
            Long.parseLong(input);
        } catch (NumberFormatException ex) {
            return PersonalIDValidateResult.ERROR_FORMAT;
        }
        
        if (input.length() != PERSONAL_ID_DIGIT_NUM_VALID) {
            return PersonalIDValidateResult.INVALLID;
        }
        
        return PersonalIDValidateResult.PASS;
    }
    
}