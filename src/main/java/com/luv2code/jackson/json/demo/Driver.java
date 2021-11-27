package com.luv2code.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {

    public static void main(String[] args) {

        try{

            //create object mapper
            ObjectMapper mapper = new ObjectMapper();

            //read JSON file and map/convert to Java POJO : data/sample-lite.json
            Student theStudent =
                    mapper.readValue(new File("data/sample-full.json"),Student.class);

            //print first name and lastname
            System.out.println("First Name : " + theStudent.getFirstName());
            System.out.println("Last Name : " + theStudent.getLastName());

            //print Address
            Address address = theStudent.getAddress();
            System.out.println("\n---Address--- ");
            System.out.println("Street : " + address.getStreet() +
                               "\nCity : " + address.getCity());
            
            //print languages
            System.out.println("Languages : ");
            for(String templang : theStudent.getLanguages()){
                System.out.print(templang + " | ");
            }
        }
        catch(Exception e){

            e.printStackTrace();
        }
    }
}
