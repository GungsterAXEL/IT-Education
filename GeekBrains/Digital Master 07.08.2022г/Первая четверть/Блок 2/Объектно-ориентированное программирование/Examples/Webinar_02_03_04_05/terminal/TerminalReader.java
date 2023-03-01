package Webinar_02_03_04_05.terminal;

import java.util.Scanner;

public class TerminalReader {

    private static TerminalReader terminalReader;
    private CommandParser commandParser;

    private TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }

    public static TerminalReader newReader(CommandParser commandParser){
        if(terminalReader==null){
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }

    void endless(){
        Scanner scan = new Scanner(System.in);

        while(true){
            String input = scan.nextLine();
        }
    }

}
