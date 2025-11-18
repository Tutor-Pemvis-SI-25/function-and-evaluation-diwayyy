//Dewi Natasya Sitorus - 12S25042

import java.util.*;
import java.lang.Math;

public class TLAST {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] namaTugas = new String[10], nIM = new String[10], matkul = new String[10], dosen = new String[10], deadline = new String[10];
        int i;

        for (i = 0; i <= 9; i++) {
            namaTugas[i] = input.nextLine();
            nIM[i] = input.nextLine();
            matkul[i] = input.nextLine();
            dosen[i] = input.nextLine();
            deadline[i] = input.nextLine();
        }
    }
    
    public static void addTask(String namaTugas, String nIM, String matkul, String dosen, String deadline) {
        namaTugas = input.nextLine();
        nIM = input.nextLine();
        matkul = input.nextLine();
        dosen = input.nextLine();
        deadline = input.nextLine();
    }
}
