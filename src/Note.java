import java.time.LocalDate;

public class Note extends AbstractNote implements WritingToFileable {
    private String title;

    public Note(String text, LocalDate date, NoteTypes type, String title) {
        super(text, date, type);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String makeNote() {
        String note = "Text: " + getText() + "\n" + "Date:" + getDate() + "\n" + "Type:" + getType() + "\n" + "Title:" + getTitle();
        return note;

    }
}
