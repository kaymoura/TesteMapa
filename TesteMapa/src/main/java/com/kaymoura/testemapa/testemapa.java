/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kaymoura.testemapa;
import java.io.*;
import java.util.Map;
import java.util.TreeMap;
/**
 *
 * @author devsys-b
 */
public class testemapa {
    public static void main(String[] args) {
        Map<Integer, String > mapa = new TreeMap<Integer, String>();
        mapa.put(455,"vermelho");
        mapa.put(333,"branco");
        mapa.put(678,"amarelo");
        mapa.put(455,"azul");
        try{
            FileOutputStream fluxoOut = new FileOutputStream("myfile.ser");
            ObjectOutputStream fOut = new ObjectOutputStream(fluxoOut);
            fOut.writeObject(mapa);
            FileInputStream fluxoIn = new FileInputStream("myFile.ser");
            ObjectInputStream fIn = new ObjectInputStream(fluxoIn);
            TreeMap<Integer, String > mapaNovo =(TreeMap)fIn.readObject();
            fIn.close();
            fOut.close();
            System.out.println(mapaNovo);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
