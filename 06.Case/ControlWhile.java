class ControlSwitch {
    public void switchCalendar(int month) {
        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month+" has 31 days.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month+" has 30 days.");
                break;
            case 2:
                System.out.println(month+" has 28 or 29 days.");
                break;
            default:
                System.out.println(month+" is not a month.");
                break;
        }
    }
}

public class ControlWhile {
    public static void main(String[] args) {
        ControlWhile control = new ControlWhile();
        control.whileLoop1();
        control.whileLoop2();
        control.whileBreak();
        control.whileContinue();
    }

    public void whileLoop1() {
        ControlSwitch control = new ControlSwitch();
        int loop = 0;
        while (loop < 12) {
            loop++;
            control.switchCalendar(loop);
        }
    }

    public void whileLoop2() {
        ControlSwitch control = new ControlSwitch();
        int loop = 0;
        while (loop < 12) {
            loop++;
            control.switchCalendar(loop);
            if(loop==6) loop=100;
        }
    }

    public void whileBreak() {
        ControlSwitch control = new ControlSwitch();
        int loop = 0;
        while (loop < 12) {
            loop++;
            control.switchCalendar(loop);
            if (loop==6) break;
        }
    }

    public void whileContinue() {
        ControlSwitch control = new ControlSwitch();
        int loop=0;
        while(loop<12 ){
            loop++;
            if(loop==6) continue;
            control.switchCalendar(loop);
        }
    }
}