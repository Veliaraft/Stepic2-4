package com.company;

public class SpaceShuttle {
    public static String engineStatus(int engineNumber){
        //Для проверки обработки исключений раскомментируйте какой-нибудь throw
        // в вызываемой функции rawEngineStatus (строка 23)
        try {
            rawEngineStatus(engineNumber);
        } catch (Exception e) {
            if(e.getMessage() == "EngineNotFoundException"){
                return "engine " + Integer.toString(engineNumber) + " not found";
            }
            else if(e.getMessage() == "SensorsMeltException"){
                return "engine " + Integer.toString(engineNumber) + " offline";
            }
            else{
                e.printStackTrace();
                return "We have any problems";
            }
        }
        return "Engine " + Integer.toString(engineNumber) + " is ok!";
    }
    public static void rawEngineStatus(int engineNumber) throws Exception {
        //throw new Exception("EngineNotFoundException");
        //throw new Exception("SensorsMeltException");
    }
}
