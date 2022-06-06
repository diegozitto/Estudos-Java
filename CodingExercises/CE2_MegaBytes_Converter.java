package CodingExercises;

public class CE2_MegaBytes_Converter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(890000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
    // 1 MegaByte = 1024 KiloBytes
    // 1 KiloByte = 0,001 MegaByte

    // resposta deve estar como XX KB = YY MB e ZZ KB

    // EX:  2500 KB = 2 MB and 452 KB
    // EX:  5000 KB = 4 MB and 904 KB

            if(kiloBytes < 0){
                System.out.println("Invalid Value");

            } else {
                int megaBytes = kiloBytes / 1024;

                System.out.println(kiloBytes + " KB" + " = " +
                        megaBytes + " MB" + " and " +
                        (kiloBytes % 1024) + " KB");

            }
        }
    }

