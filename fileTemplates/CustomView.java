#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

#parse("File Header.java")
public class ${NAME} extends View {
    #parse("Java TAG.java")

    private static final int DEFAULT_WIDTH = ViewHelper.dpToPx(50);
    private static final int DEFAULT_HEIGHT = ViewHelper.dpToPx(50);

    private int width = DEFAULT_WIDTH;
    private int height = DEFAULT_HEIGHT;

    public ${NAME}(Context context) {
        this(context, null);
    }

    public ${NAME}(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ${NAME}(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
        init(context, attrs);
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
//        final TypedArray a = context.obtainStyledAttributes(
//                attrs, R.styleable.ImageCoverCardControlPanel, defStyleAttr, defStyleRes);

//        a.recycle();
    }
    
    /* Size */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        
        setMeasuredDimension(
                getSize(width, widthMeasureSpec),
                getSize(height, heightMeasureSpec)
        );
    }

    public static int getDefaultSize(int size, int measureSpec) {
        int result = size;
        int specMode = MeasureSpec.getMode(measureSpec);
        int specSize = MeasureSpec.getSize(measureSpec);

        switch (specMode) {
            case MeasureSpec.UNSPECIFIED:
                result = size;
                break;
            case MeasureSpec.AT_MOST:
            case MeasureSpec.EXACTLY:
                result = specSize;
                break;
        }
        return result;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }
}