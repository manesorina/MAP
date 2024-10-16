import java.util.Arrays;

public class ElektronikShop {
    int[] keyboards;
    int[] usbDrives;

    public ElektronikShop(int[] keyboards,int[] usbDrives){
        this.usbDrives=usbDrives;
        this.keyboards=keyboards;
    }

    public int cheapestKeyboard(int[] keyboards){
        Arrays.sort(keyboards);
        return keyboards[0];
    }

    public int mostExpensive(int[] keyboards, int[] usbDrives){
        Arrays.sort(keyboards);
        Arrays.sort(usbDrives);
        return Math.max(keyboards[keyboards.length-1],usbDrives[usbDrives.length-1]);
    }

    public int expensiveInBudget(int[] usbDrives,int budget){
        Arrays.sort(usbDrives);
        int inBudget=0;
        for(int i=0;i<usbDrives.length;i++){
            while(usbDrives[i]<=budget){
                i++;
            }
            inBudget=usbDrives[i];
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
