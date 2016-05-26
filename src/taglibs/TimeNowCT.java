package taglibs;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.util.Date;

/**
 * Created by stk-des01 on 25-05-16.
 */
public class TimeNowCT extends TagSupport {
    @Override
    public int doEndTag() throws JspException {
        JspWriter out= pageContext.getOut();
        try {
            out.println("La hora actual es "+(new Date()));
        }catch (Exception e){
            System.out.println("Problemas con el IO");
        }
        return super.doEndTag();
    }
}
