class Solution {
    public double angleClock(int hour, int minutes) {
        if(hour == 12)
        {
            hour=0;
        }
        double hh=(30*hour)+(0.5*minutes);
        double mh=6*minutes;
        double a=Math.abs(hh-mh);
        if(a>180)
        {
            double s=360 - a;
            return s;
        }
        return a; 
    }
}