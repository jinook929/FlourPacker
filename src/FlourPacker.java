public class FlourPacker {

    public static boolean canPack (int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int smallCountNeeded = goal % 5;

        if ((smallCount >= smallCountNeeded && ((goal - smallCount) <= (bigCount * 5))) || (smallCount >= goal)) {
            return true;
        }

        return false;
    }
}
