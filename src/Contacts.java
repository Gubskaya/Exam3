import java.time.LocalDate;

public class Contacts extends AbstractNote implements WritingToFileable{
    private String name;
    private String number;
    private ContactsTypes types;

    public Contacts(String text, LocalDate date, NoteTypes type, String name, String number, ContactsTypes types) {
        super(text, date, type);
        this.name = name;
        this.number = number;
        this.types = types;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ContactsTypes getTypes() {
        return types;
    }

    public void setTypes(ContactsTypes types) {
        this.types = types;
    }

    @Override
        public String makeNote() {
            String note = "Text: " + getText() + "\n" + "Date:" + getDate() + "\n" + "Note Type:" + getType() + "\n" + "Name:" + getName() + "\n" + "Number:" + getNumber() + "\n" + "Contact type:" + getTypes();
            return note;

        }
    }
