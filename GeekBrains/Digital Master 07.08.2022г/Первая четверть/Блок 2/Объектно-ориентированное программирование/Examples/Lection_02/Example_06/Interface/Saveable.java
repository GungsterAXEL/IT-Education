package Lection_02.Example_06.Interface;

import Lection_02.Example_06.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
