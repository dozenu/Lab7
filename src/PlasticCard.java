import java.io.Serializable;
import java.util.Objects;

public class PlasticCard implements Serializable {
    private String FIO;
    private String Currency;
    private String Date;
    private int Number;
    private String CardType;
    private int PIN;

    public PlasticCard(String FIO, String currency, String date, int number, String cardType, int PIN) {
        this.FIO = FIO;
        Currency = currency;
        Date = date;
        Number = number;
        CardType = cardType;
        this.PIN = PIN;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public String getCardType() {
        return CardType;
    }

    public void setCardType(String cardType) {
        CardType = cardType;
    }

    public int getPIN() {
        return PIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlasticCard that = (PlasticCard) o;
        return Number == that.Number &&
                PIN == that.PIN &&
                FIO.equals(that.FIO) &&
                Currency.equals(that.Currency) &&
                Date.equals(that.Date) &&
                CardType.equals(that.CardType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FIO, Currency, Date, Number, CardType, PIN);
    }

    @Override
    public String toString() {
        return "PlasticCard{" +
                "FIO='" + FIO + '\'' +
                ", Currency='" + Currency + '\'' +
                ", Date='" + Date + '\'' +
                ", Number=" + Number +
                ", CardType='" + CardType + '\'' +
                ", PIN=" + PIN +
                '}';
    }
}
