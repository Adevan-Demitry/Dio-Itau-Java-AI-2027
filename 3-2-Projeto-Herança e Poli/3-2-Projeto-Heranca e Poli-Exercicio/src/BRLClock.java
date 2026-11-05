
public non-sealed class BRLClock extends Clock {

    @Override
    public Clock convert(Clock clock) {

        this.minute = clock.getMinute();
        this.second = clock.getSecond();

        switch (clock) {
            case USClock usClock -> {
                int hour = usClock.getHour();

                if (usClock.getPeriodIndicator().equals("PM") && hour != 12) {
                    this.hour = hour + 12;
                } else if (usClock.getPeriodIndicator().equals("AM") && hour == 12) {
                    this.hour = 0;
                } else {
                    this.hour = hour;
                }
            }

            case BRLClock brlClock -> {
                this.hour = brlClock.getHour();
            }
        }

        return this;
    }
}
