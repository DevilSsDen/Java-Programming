package interface_packages_enumerations;

interface Limit_Test {
    int LOWERLIMIT = 0;
    int UPPERLIMIT = 100;
}


class Variable_Test implements Limit_Test {
    void findNumberWithinLimits(int a) {
        if (a > LOWERLIMIT && a < UPPERLIMIT) {
            System.out.println(a + " lies between " + LOWERLIMIT + " and " + UPPERLIMIT);
        } else {
            System.out.println(a + " does not lie between " + LOWERLIMIT + " and " + UPPERLIMIT);
        }
    }

    public static void main(String[] args) {
        Variable_Test vt = new Variable_Test();
        vt.findNumberWithinLimits(23);
        vt.findNumberWithinLimits(233);
    }
}
