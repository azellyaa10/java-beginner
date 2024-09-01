public class Array {

    public static void main(String[] args) {




        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Yuni";
        stringArray[1] = "Yako";
        stringArray[2] = "Yati";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        long[] arrayLong = {
                10L, 20L, 30L
        };

        String [][] members = {
                    {"Minah","Yati"},
                    {"Nining","Kardi"},
                    {"Joko"}
            };
            System.out.println(members[0][1]);
            System.out.println(members[1][0]);


        }


    }

