#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public class ${NAME}{
    private static ${NAME} instance = new ${NAME}();

    public synchronized static ${NAME} getInstance() {
        return instance;
    }

    private ${NAME}() {
    }
}
