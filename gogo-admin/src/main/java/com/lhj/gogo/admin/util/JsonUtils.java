package com.lhj.gogo.admin.util;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Json转换工具
 * Created by yuxiao on 2017/6/6.
 */
public class JsonUtils {

    private static final Logger logger = LoggerFactory.getLogger(JsonUtils.class);

    private static final JsonUtils inst = new JsonUtils();

    private JsonUtils(){

    }

    public static JsonUtils getInstance(){
        return inst;
    }


    /**
     * Jackson把json字符串转成对象返回
     *
     * @param jsonStr
     * @param classOfT
     * @return
     */
    public <T> T jsonToObject(String jsonStr, Class<T> classOfT) {

        try {
//            ObjectMapper objectMapper = new ObjectMapper();
//			/*SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//			objectMapper.setDateFormat(dateFormat);*/
//            objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
//            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
//            return objectMapper.readValue(jsonStr, classOfT);
        	
        	return JSON.parseObject(jsonStr, classOfT);  
        	
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return null;
    }

    /**
     * Java对象转为json
     * @param obj
     * @return
     */
    public String objectToJson(Object obj) {
        try {
            String jsonStr = null;
            if (obj == null) {
                return null;
            }
//            ObjectMapper objectMapper = new ObjectMapper();
//			/*SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//			objectMapper.setDateFormat(dateFormat);*/
//            objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
//            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
//            jsonStr=objectMapper.writeValueAsString(obj);
//            return jsonStr != null ? jsonStr : "";
            
            jsonStr = JSON.toJSONStringWithDateFormat(obj, "yyyy-MM-dd HH:mm:ss");
            return jsonStr != null ? jsonStr : "";
            
        } catch (Throwable e) {
            logger.error("toJsonStringByJackson ERROR:",e);

        }
        return null;
    }

}
