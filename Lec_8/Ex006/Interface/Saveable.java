package Lec_8.Ex006.Interface;

import Lec_8.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
