
public non-sealed class USClock extends Clock {

    private String periodIndicator = "AM";

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setAfterMidday() {
        this.periodIndicator = "PM";
    }

    public void setBeforeMidday() {
        this.periodIndicator = "AM";
    }

    @Override
    public void setHour(int hour) {
        if (hour < 1 || hour > 12) {
            throw new IllegalArgumentException("Hora inválida para o relógio americano.");
        }

        this.hour = hour;
    }

    @Override
    public Clock convert(Clock clock) {

        this.minute = clock.getMinute();
        this.second = clock.getSecond();

        switch (clock) {
            case USClock usClock -> {
                this.hour = usClock.getHour();
                this.periodIndicator = usClock.getPeriodIndicator();
            }

            case BRLClock brlClock -> {
                int hour = brlClock.getHour();

                if (hour == 0) {
                    this.hour = 12;
                    this.setBeforeMidday();
                } else if (hour == 12) {
                    this.hour = 12;
                    this.setAfterMidday();
                } else if (hour > 12) {
                    this.hour = hour - 12;
                    this.setAfterMidday();
                } else {
                    this.hour = hour;
                    this.setBeforeMidday();
                }
            }
        }

        return this;
    }

    @Override
    public String getTime() {
        return super.getTime() + " " + this.periodIndicator;
    }
}
