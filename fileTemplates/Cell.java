#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public class ${NAME} extends RelativeLayout{
    private static final String TAG = "${NAME}";
    
    public ${NAME}(Context context){
        super(context);
        
        
        setLayoutParams(ParamBuilder.abs().of(ParamBuilder.MATCH, 100).build());
    }
    
    public static ${NAME} convert(View view, Context context){
        if(view != null && view instanceof ${NAME}){
            return (${NAME}) view;
        }
        return new ${NAME}(context);
    }

}
