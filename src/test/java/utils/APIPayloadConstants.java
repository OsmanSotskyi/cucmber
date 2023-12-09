package utils;

import org.json.JSONML;
import org.json.JSONObject;

public class APIPayloadConstants {
    public static String generateTokenPayload(){
        String generateToken = "{\n" +
                "  \"email\": \"osman.test@gmail.com\",\n" +
                "  \"password\": \"Tests123!\"\n" +
                "}";
        return generateToken;
    }


    public static String createEmployeePayload(){
        String createEmployeePayload = "{\n" +
                "  \"emp_firstname\": \"Chupa\",\n" +
                "  \"emp_lastname\": \"Chups\",\n" +
                "  \"emp_middle_name\": \"ms\",\n" +
                "  \"emp_gender\": \"M\",\n" +
                "  \"emp_birthday\": \"1992-02-13\",\n" +
                "  \"emp_status\": \"qa\",\n" +
                "  \"emp_job_title\": \"confirmed\"\n" +
                "}";
        return createEmployeePayload;
    }

    public static  String createEmployeeJsonPayLoad () {
        JSONObject obj = new JSONObject();
        obj.put("emp_firstname","Chupa");
        obj.put("emp_lastname","Chups");
        obj.put("emp_middle_name","ms");
        obj.put("emp_gender","M");
        obj.put("emp_birthday","1992-02-13");
        obj.put("emp_status","confirmed");
        obj.put("emp_job_title","qa");

        return obj.toString();
    }

    public static String payloadDynamic(String emp_firstName,String emp_lastname,
                                        String emp_middle_name,String emp_gender,
                                        String emp_birthday,String emp_status,
                                        String emp_job_title
    ){
        JSONObject obj = new JSONObject();
        obj.put("emp_firstname",emp_firstName);
        obj.put("emp_lastname",emp_lastname);
        obj.put("emp_middle_name",emp_middle_name);
        obj.put("emp_gender",emp_gender);
        obj.put("emp_birthday",emp_birthday);
        obj.put("emp_status",emp_status);
        obj.put("emp_job_title",emp_job_title);

        return obj.toString();
    }
}
