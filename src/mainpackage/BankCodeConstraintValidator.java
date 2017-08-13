package mainpackage;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BankCodeConstraintValidator implements ConstraintValidator<Code, String>{


    private String codePrefix;

    @Override
    public void initialize(Code code) {
        //Accesses the attribute value of the annotation
        codePrefix = code.value();
    }

    @Override
    public boolean isValid(String s,
                           ConstraintValidatorContext constraintValidatorContext) {
        //If given string starts with codePrefix value( default is BNK )
        if(s == null || s.isEmpty()){
            return true;
        }
        return s.startsWith(codePrefix);
    }
}
