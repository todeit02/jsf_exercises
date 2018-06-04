 /*
 * @author Tobias
 */

import java.util.Locale;
import java.util.ResourceBundle;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("subjectCountSelectionValidator")
public class SubjectCountSelectionValidator implements Validator
{

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException
    {
        UIInput uiInputCheckboxGraduated = (UIInput) component.getAttributes().get("checkboxGraduated");
        UIInput uiInputRemainingSubjectsListbox = (UIInput) component.getAttributes().get("remainingSubjectsListbox");
        boolean checkboxGraduatedIsChecked = (boolean) uiInputCheckboxGraduated.getSubmittedValue();
        String remainingSubjectsValue = (String) uiInputRemainingSubjectsListbox.getSubmittedValue();
        
        if(checkboxGraduatedIsChecked ^ !remainingSubjectsValue.isEmpty()) return;
        
        Locale locale = context.getViewRoot().getLocale();
        ResourceBundle messageBundle = ResourceBundle.getBundle("messages", locale);
        throw new ValidatorException(
            new FacesMessage(FacesMessage.SEVERITY_ERROR, messageBundle.getString("survey.remainingSubjectsCount.invalidSelectionError"), null)
        );
    }
    
}
