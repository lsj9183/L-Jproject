package com.example.seojin.myapplication;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by seojin on 2017-06-21.
 */
public class ValidateRequest extends StringRequest {

    final static private String URL = "http://52.79.215.146/StudentValidate.php";
    private Map<String, String> parameters;

    public ValidateRequest(String studentID, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("studentID", studentID);
    }

    @Override
    public Map<String, String> getParams(){
        return parameters;
    }
}