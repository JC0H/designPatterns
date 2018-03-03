package creational.singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFIle = "This is log file.\n\n";

    private ProgramLogger(){}

    static synchronized ProgramLogger getProgramLogger(){
        if (programLogger == null)
            programLogger = new ProgramLogger();
        return programLogger;
    }

    public void addLoginInfo(String logInfo){
        logInfo += logInfo + "\n";
    }

    public void showLogFile(){
        System.out.println(logFIle);
    }
}
