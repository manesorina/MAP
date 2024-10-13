import java.util.Arrays;
import java.math.MathContext;
public class ElektronikShop {
    int[] keyboards;
    int[] usbDirves;

    public ElektronikShop(int[] keyboards,int[] usbDirves){
        this.usbDirves=usbDirves;
        this.keyboards=keyboards;
    }

    public int cheapestKeyboard(int[] keyboards){
        Arrays.sort(keyboards);
        return keyboards[0];
    }

    public int mostExpensive(int[] keyboards, int[] usbDirves){
        Arrays.sort(keyboards);
        Arrays.sort(usbDirves);
        return Math.max(keyboards[keyboards.length-1],usbDirves[usbDirves.length-1]);
    }

    public int expensiveInBudget(int[] usbDirves,int budget){
        Arrays.sort(usbDirves);
        int inBudget=0;
        for(int i=0;i<usbDirves.length;i++){
            while(usbDirves[i]<=budget){
                i++;
            }
            inBudget=usbDirves[i];
        }
        return inBudget;

    }

    public int totalMaxSpent(int[] usbDrives, int[] keyboards, int budget) {
        int maxSpent = -1;

        for (int keyboard : keyboards) {
            for (int usb : usbDrives) {
                int total = keyboard + usb;
                if (total <= budget) {
                    if (total > maxSpent) {
                        maxSpent = total;
                    }
                }
            }
        }

        return maxSpent;
    }
}
