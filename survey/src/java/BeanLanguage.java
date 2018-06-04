/**
 *
 * @author Tobias
 */

import java.util.Locale;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class BeanLanguage
{
    private Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
    
    public Locale getLocale() { return locale; }
    public void setLocale(Locale locale)
    {
        this.locale = locale;
        updateFacesLocale();
    }
    
    public String getLanguage()
    {
        return locale.getLanguage();
    }
    
    public void setLanguage(String language)
    {
        this.locale = new Locale(language);
        updateFacesLocale();
    }
    
    private void updateFacesLocale()
    {
        FacesContext.getCurrentInstance().getViewRoot().setLocale(this.locale);
    }
    
    public BeanLanguage(){}
}
