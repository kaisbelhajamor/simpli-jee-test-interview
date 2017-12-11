package fr.simplifia.transform;

import fr.simplifia.input.validator.SmpInputValidator;

public class SmpDataTransformer {

    private SmpInputValidator validator;
    private static final String MESSAGEFR = " : bienvenue chez Simplifia!";
    private static final String MESSAGEEN = " : Welcome to Simplifia!";

    public SmpDataTransformer(final SmpInputValidator validator) {
        this.validator = validator;
    }

    public String transform(final String input,String lang){
        validator.validateInput(input);
        StringBuffer buffer = new StringBuffer();

        if(lang.equals("fr")) {
            buffer.append(input);
            buffer.append(MESSAGEFR);

        }else if(lang.equals("en")) {
            if((input.contains("é")||input.contains("ê")||input.contains("è") )){
                buffer.append("String is not valid");

            }else {
                buffer.append(input);
                buffer.append(MESSAGEEN);
            }
        }

        return buffer.toString();
    }

}

