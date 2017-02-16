package com.bs;
import java.math.*;
import java.net.*;
import java.io.*;
import java.security.*;
 
public class WebAPI {
    public static String getHashMD5(String string) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            BigInteger bi = new BigInteger(1, md.digest(string.getBytes()));
            return bi.toString(16);
        } catch (NoSuchAlgorithmException ex) {
            return "";
        }
    }
 
    public static String xor(String first, String second) {
        int secondLength = second.length();
        int secondIndex = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < first.length(); ++i) {
            sb.append((char)(first.charAt(i) ^ second.charAt(secondIndex)));
            ++secondIndex ;
            if (secondIndex == secondLength) {
                secondIndex = 0;
            }
        }
        return sb.toString();
    }
 
    public static void main(String[] args) throws UnknownHostException, IOException {
        int requestID = 0;
        String actionName = "getaccountinfo&login=1000";
        String hashKey = "fsdvgfygfsddsag";
 
        String hash = getHashMD5(String.valueOf(requestID) + actionName + hashKey);
        //action=getaccountinfo&login=1000
        String request = "action=" + actionName + "&request_id=" + String.valueOf(requestID) + "&hash=" + hash + "\0";
 
        String encryptionKey = "asfas1";
        String encryptedRequest = xor(request, encryptionKey);
 
        Socket socket = new Socket("127.0.0.1", 2010);
 
        OutputStream os = socket.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write(encryptedRequest);
        bw.flush();
 
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        for (int i = 0; i < 2; ++i) {
            String response = br.readLine();
            if (i == 1) {
                String decryptedResponse = xor(response, encryptionKey);
                System.out.println(decryptedResponse);
            } else {
                System.out.println(response);
            }
        }
    }
}