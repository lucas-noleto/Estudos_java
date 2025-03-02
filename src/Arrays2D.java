public class Arrays2D {
    public static void main(String[] args) {
        String[] ninjas = new String[3];
        ninjas[0] = "Naruto Uzumaki";
        ninjas[1] = "Jiraya";
        ninjas[2] = "Minato ";

        for (int i=0; i< ninjas.length;i++) {
            System.out.println(ninjas[i]);
        }

        //Basicamente vai ser uma matriz, o primeiro array vai ser um de referencia
        String[][] ninjasEAldeias =new String[3][3];

        ninjasEAldeias[0][0]="Konoha";
        ninjasEAldeias[0][1]="Kakashi Hatake";
        ninjasEAldeias[0][2]="Shisui Uchiha";

        ninjasEAldeias[1][0]="Nevoa";
        ninjasEAldeias[1][1]="Nagato";
        ninjasEAldeias[1][2]="Kisame";

        ninjasEAldeias[2][0]="Areia";
        ninjasEAldeias[2][1]="Gaara";
        ninjasEAldeias[2][2]="Kankuro";

        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(ninjasEAldeias[i][j]);

            }


        }




    }
}
