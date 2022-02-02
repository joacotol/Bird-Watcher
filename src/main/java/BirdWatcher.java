
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        if (birdsPerDay.length == 0) {
            return 0;
        } else {
            return birdsPerDay[birdsPerDay.length - 1];
        }
    }

    public void incrementTodaysCount() {
        int today = getToday() + 1;
        int lengthOf = birdsPerDay.length - 1;
        birdsPerDay[lengthOf] = today;
    }

    public boolean hasDayWithoutBirds() {
        boolean hasZero = false;
        for (int data : birdsPerDay) {
            if (data != 0) {
                hasZero = false;
            } else {
                hasZero = true;
                break;
            }
        }
        return hasZero;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        for( int i = 0; i < numberOfDays; i++) {
            if( i < 7 ){
                sum += birdsPerDay[i];
            }
        }
        return sum;
    }

    public int getBusyDays() {
        int counter = 0;

        for( int data : birdsPerDay ) {
            if(data >= 5) {
                counter += 1;
            }
        }
        return counter;
    }
}
