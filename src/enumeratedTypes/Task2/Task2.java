package enumeratedTypes.Task2;

public class Task2 {
    public static void main(String[] args) {

    PackagesSize packagesSize = PackagesSize.getPackagesSize(41, 60);
        System.out.println(packagesSize);

    }
}

enum PackagesSize{
SMALL(40, 90), MEDIUM(90, 140), LARGE(140, 250), UNKNOWN(0, 0);

private int minSize;
private int maxSize;

    PackagesSize(int minSize, int maxSize) {
        this.minSize = minSize;
        this.maxSize = maxSize;
    }
    public static PackagesSize getPackagesSize(int minSize, int maxSize){
        for (PackagesSize packagesSize : values()){
            if (minSize >= packagesSize.minSize && maxSize < packagesSize.maxSize){
                return packagesSize;
            }
        }
        return UNKNOWN;
    }
}






