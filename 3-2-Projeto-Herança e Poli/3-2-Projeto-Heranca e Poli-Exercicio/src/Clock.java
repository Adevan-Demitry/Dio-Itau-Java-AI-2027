
public sealed abstract class Clock permits BRLClock, USClock {

    protected int hour;
    protected int minute;
    protected int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Hora inválida.");
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Minuto inválido.");
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Segundo inválido.");
        }
        this.second = second;
    }

    private String format(int value) {
        return value < 10 ? "0" + value : String.valueOf(value);
    }

    public String getTime() {
        return format(hour) + ":" + format(minute) + ":" + format(second);
    }

    public abstract Clock convert(Clock clock);
}
