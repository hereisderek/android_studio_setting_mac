#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public class ${NAME} {
    private static String TAG = ${PACKAGE_NAME}.class.getSimpleName();
}
