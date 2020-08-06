package OJ题;

/**
 * @Author Meng Xin
 * @Date 2020/8/6 10:14
 */
/*public class JSON序列化和反序列化 {
    public static String serialize(Object object) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "";
        }
    }
    /**
     * JSON字符串反序列化
     *
     * @param jsonStr JSON字符串
     * @return a Map
     */
//public static Map deserialize(String jsonStr){
//        try{
//        return deserialize(jsonStr,Map.class);
//        }catch(Exception e){
//        e.printStackTrace();
//        return new HashMap();
//        }
//        }
//
//public static<T> T deserialize(String jsonStr,Class<T> classType)throws Exception{
//        return new ObjectMapper().readValue(jsonStr,classType);
//        }
//        }
