#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

#parse("File Header.java")
public class ${NAME} extends View {
    #parse("Java TAG.java")

    public ${NAME}(Context context) {
        this(context, null, 0);
    }

    public ${NAME}(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ${NAME}(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    @TargetApi(21)
    public ${NAME}(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {

    }
    
}