import java.time.LocalDate;

public abstract class AbstractNote {
    private String text;
    private LocalDate date;
    private NoteTypes type;

    public AbstractNote(String text, LocalDate date, NoteTypes type) {
        this.text = text;
        this.date = date;
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public NoteTypes getType() {
        return type;
    }

    public void setType(NoteTypes type) {
        this.type = type;
    }
}
