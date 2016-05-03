#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

#parse("File Header.java")
public class ${NAME} extends View {
    #parse("Java TAG.java")

     public ${NAME}(Context context) {
        this(context, null);
    }

    public ${NAME}(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ${NAME}(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    @TargetApi(21)
    public ${NAME}(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context, attrs, defStyleAttr, defStyleRes);
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        parseAttrs(context, attrs, defStyleAttr, defStyleRes);

    }
    private void parseAttrs(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        final Resources.Theme theme = context.getTheme();
        //TypedArray ta = theme.obtainStyledAttributes(attrs, R.styleable.IUTextView, defStyleAttr, defStyleRes);
        //TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.IUTextView);

        /*
        try {
            RLog.i(TAG, "parsing attrs:", ta.getIndexCount());

            int n = ta.getIndexCount();
            for (int i = 0; i < n; i++) {
                int attr = ta.getIndex(i);
                int index;
                String str;

                switch (attr) {
                    case R.styleable.IUTextView_typeface:
                        index = ta.getInt(attr, -1);
                        if (index != -1) {
                            setTypeface(FontManager.getInstance().getTypefaceForAttribute(index));
                        } else {
                            str = ta.getString(attr);
                            setTypeface(FontManager.getInstance().getTypefaceForAttribute(str));
                        }
                        break;
                }
            }
        } finally {
            ta.recycle();
        }
        */
    }
}