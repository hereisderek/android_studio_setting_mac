///
/// User: ${USER} 
/// Date: ${DATE} ${TIME}
/// Project: ${PROJECT_NAME}

#set($CAMEL_NAME = ${StringUtils.removeAndHump(${NAME}, "_")})
const TAG = "${CAMEL_NAME}";

class ${CAMEL_NAME} {

    
}
