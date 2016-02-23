#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import android.os.Bundle;

import com.j256.ormlite.table.DatabaseTable;
import com.roam.appdatabase.DatabaseManager;
import com.roam.appdatabase.managed.ManagedObject;

import org.json.JSONObject;

#parse("File Header.java")

@DatabaseTable
public class ${NAME} extends ManagedObject{
    private static final String TAG = "${NAME}";
    private static final String ${NAME}_ID = "";
    
    
    
    public ${NAME}(){
    }
    
    public static ${NAME} fromJSON(JSONObject json, boolean save){
        if(json == null) return null;
        
        String id = json.optString("id",null);
        if(id == null) return null;
        
        ${NAME} result = null;
        if(result == null){
            result = new ${NAME}();
            result.batchCreate();
        }else{
            result.batchUpdate();
        }
        
        
        
        
        if(save){
            DatabaseManager.getInstance().saveChangesForClass(${NAME}.class);
        }
        
        return null;
    }
    
    public static ${NAME} fromBundle(Bundle bundle){
        if(bundle == null || !bundle.containsKey(${NAME}_ID)) return null;
        String id = bundle.getString(${NAME}_ID);
        return DatabaseManager.getInstance().getFirstMatching(${NAME}_ID,id,${NAME}.class);
    }
    
    public Bundle asBundle(){
        Bundle bundle = new Bundle();
        bundle.putString(${NAME}_ID, id);
        return bundle;
    }
}