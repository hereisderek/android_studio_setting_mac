#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public class ${NAME}{
    private static final String TAG = ${NAME}.class.getSimpleName();
    
    private static class SingletonHolder {
        private static final ${NAME} INSTANCE = new ${NAME}();  
    }
    
    public synchronized static final ${NAME} getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private ${NAME}() {
    }
}
