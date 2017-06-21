package com.example.seojin.myapplication;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by seojin on 2017-06-21.
 */
public class RegisterRequest extends StringRequest {

    final static private String URL = "http://52.79.215.146/StudentRegister.php";
    private Map<String, String> parameters;

    public RegisterRequest(String studentID, String studentPassword, String studentName, String studentGrade, String studentMajor, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("studentID", studentID);
        parameters.put("studentPassword", studentPassword);
        parameters.put("studentName", studentName);
        parameters.put("studentGrade", studentGrade);
        parameters.put("studentMajor", studentMajor);
    }

    @Override
    public Map<String, String> getParams(){
        return parameters;
    }
}
