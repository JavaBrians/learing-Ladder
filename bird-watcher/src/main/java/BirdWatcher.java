
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {

        return birdsPerDay.clone();
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int i = 0; i < this.birdsPerDay.length; i++) {
            if (this.birdsPerDay[i] == 0) {
                return true;
            }
            //this.birdsPerDay[i] += 1;
        }
        return false;

    }

    public int getCountForFirstDays(int numberOfDays) {
        int result = 0;

        if (numberOfDays > this.birdsPerDay.length) {
            for (int i = 0; i < this.birdsPerDay.length; i++) {

                result += this.birdsPerDay[i];
            }

        } else {
            for (int i = 0; i <= numberOfDays; i++) {
                result += i;

            }
        }


        return result;

    }

    public int getBusyDays() {
        int count = 0;
        for (int i = 0; i < this.birdsPerDay.length; i++) {
            if (this.birdsPerDay[i] >= 5) {
                count = count + 1;
            } else {
                count = 0;
            }
        }
        return count;
    }
}
