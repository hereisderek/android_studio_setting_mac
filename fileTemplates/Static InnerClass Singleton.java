#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public class ${NAME}{
    #parse("Java TAG.java")
    
    private static class SingletonHolder {
        private static final ${NAME} INSTANCE = new ${NAME}();  
    }
    public synchronized static ${NAME} getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private ${NAME}() {
    }
    
}
