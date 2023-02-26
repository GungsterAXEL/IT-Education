package Lection_02.Example_06;

import Lection_02.Example_06.Applications.Notepad;
import Lection_02.Example_06.Format.Doc;
import Lection_02.Example_06.Format.Md;
import Lection_02.Example_06.Format.Txt;

public class Program {
    public static void main(String[] args) {
        
        Notepad notes = new Notepad();
        notes.newFile();
        notes.currentDocument().addAllText("text1");
        notes.currentDocument().addAllText("text2");
        notes.currentDocument().addAllText("text3");
        notes.SaveAs("file1", new Txt());
        notes.SaveAs("file2", new Md());
        notes.SaveAs("file3", new Doc());



    }
}
