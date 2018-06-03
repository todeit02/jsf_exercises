/**
 *
 * @author Tobias
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class BeanSurveyResult
{
    private String birthMonth;
    private String[] favoriteColors;
    private boolean graduated;
    private int remainingSubjectsCount;

    public String getBirthMonth() { return birthMonth; }
    public void setBirthMonth(String birthMonth) { this.birthMonth = birthMonth; }

    public String[] getFavoriteColors() { return favoriteColors; }
    public void setFavoriteColors(String[] favoriteColors) { this.favoriteColors = favoriteColors; }

    public boolean isGraduated() { return graduated; }
    public void setGraduated(boolean graduated) { this.graduated = graduated; }   

    public int getRemainingSubjectsCount() { return remainingSubjectsCount; }
    public void setRemainingSubjectsCount(int remainingSubjectsCount)
    {
        this.remainingSubjectsCount = remainingSubjectsCount;
    }    
}
