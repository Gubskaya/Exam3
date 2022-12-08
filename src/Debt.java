import java.time.LocalDate;

public class Debt extends Note implements WritingToFileable{
    private Double amountDebt;

    public Debt(String text, LocalDate date, NoteTypes type, String title, Double amountDebt) {
        super(text, date, type, title);
        this.amountDebt = amountDebt;
    }


    public Double getAmountDebt() {
        return amountDebt;
    }

    public void setAmountDebt(Double amountDebt) {
        this.amountDebt = amountDebt;
    }

    }

