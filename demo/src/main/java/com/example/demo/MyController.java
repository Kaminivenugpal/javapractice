package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class MyController 
{
    private String[] arr;
    private String result;
    private int id;
    public  MyController()
    {
        String[] arr=new String[5];
        arr[0]="Kamini";
        arr[1]="Shalini";
        arr[2]="Venugopal";
        arr[3]="Selvi";

    }
    @GetMapping("/all")
    public String getall()
    {
        for(int i=0;i<arr.length;i++)
        {
            result+="arr" +i +" = " +arr[i];        
        }
        return result;
    }
    @GetMapping("/by/{id}")
    public String getbyid(@PathVariable int id)
    {
        if(id>=0 && id<arr.length && arr[id]!=null)
        {
        
            return "result" +arr[id];
        }
        else
        {
            return "invalid";

        }

    }
}

    
