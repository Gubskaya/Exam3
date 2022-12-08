import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException {

        Note note1 = new Note("Note 1", LocalDate.now(), NoteTypes.IDEA, "Title of first note");
        Note note2 = new Note("Note 2", LocalDate.now(), NoteTypes.IDEA, "Title of second note");
        Note note3 = new Note("Note 3", LocalDate.now(), NoteTypes.IDEA, "Title of third note");
        Contacts contact1 = new Contacts("Text1", LocalDate.now(), NoteTypes.CONTACT, "Title of first contact", "0555102030", ContactsTypes.MOBILE);
        Contacts contact2 = new Contacts("Text1", LocalDate.now(), NoteTypes.CONTACT, "Title of second contact", "0553207893", ContactsTypes.MOBILE);
        Contacts contact3 = new Contacts("Text1", LocalDate.now(), NoteTypes.CONTACT, "Title of third contact", "070987654", ContactsTypes.MOBILE);

        AbstractNote[] list = {note1, note2, note3, contact1, contact2, contact3};
        Note[] listNotes = {note1, note2, note3};
        Contacts[] listContacts = {contact1, contact2, contact3};

        FileWriter fileWriter = null;


        try {
            fileWriter = new FileWriter("NoteBook.txt", true);
            for (int i = 0; i < listNotes.length; i++){
                fileWriter.write(listNotes[i].makeNote());
            }
            for (int i = 0; i < listContacts.length; i++){
                fileWriter.write(listNotes[i].makeNote());
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            fileWriter.close();
        }


    }
}