package uz.java;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpClient;

public class Main {
    public static void main(String[] args) {

        try {
            URL url = new URL("https://cbu.uz/uz/arkhiv-kursov-valyut/json/");
            URLConnection connection = url.openConnection();
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            Valyuta[] valyutas = gson.fromJson(inputStream, Valyuta[].class);
            for (Valyuta valyuta : valyutas) {
                System.out.println(valyuta.getId()+", "+valyuta.getCcyNm_UZ()+", "+valyuta.getRate());
            }

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
