public class TipeDataBukanPrimitif {

    public static void main(String[] args) {

        Integer iniInteger = 10;
        Long iniLong = 10000l;

        Byte iniByte = null;

        System.out.println(iniByte);
        iniByte = 10;
        System.out.println(iniByte);

        int iniInt = 270;

        Integer ini0bject = iniInt;

        Short iniShort = ini0bject.shortValue();
        Long iniLong2 = ini0bject.longValue();
        Float iniFloat = ini0bject.floatValue();

        Long amount = 1000000L;
        System.out.println(iniShort);
        System.out.println(iniFloat);
        System.out.println(iniLong2);



    }
}
