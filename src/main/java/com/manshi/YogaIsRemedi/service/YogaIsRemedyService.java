package com.manshi.YogaIsRemedi.service;

import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YogaIsRemedyService {

    @Autowired
    private OllamaChatModel chatModel;

    public String getYogaAsana(String prompt){
        try{
            String response = chatModel.call(prompt);
            return response;
        }catch (Exception e){
            return e.getMessage();
        }
    }
}
