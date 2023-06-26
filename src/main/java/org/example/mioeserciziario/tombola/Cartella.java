package org.example.mioeserciziario.tombola;

public class Cartella {

    private Integer[][] matrix;

    public Cartella() {
        this.matrix = new Integer[3][5];
        creaMatrix();
    }

    //
    public void creaMatrix() {
        //(int)(1+(Math.random()*90));
        for (int r = 0; r < 3; r++) {

            for (int c = 0; c < 5; c++) {
                matrix[r][c] = (int) (1 + (Math.random() * 90));
            }

            //controllo
            for (int c2=0;c2<4;c2++) {
                for (int z = c2+1; z < 5; z++) {
                    if (matrix[r][c2] == matrix[r][z] || ((int) matrix[r][c2] / 10) == ((int) matrix[r][z] / 10)) {
                        matrix[r][c2] = (int) (1 + (Math.random() * 90));
                        c2 = -1;
                        break;
                    }
                }
            }
        }
    }

    public void stampaCartella() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(matrix[r][c] + "-");
            }
            System.out.print("\n");
        }
    }


    //TODO terminare metodo
    public String segna (int v){
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 5; c++) {
                if(matrix[r][c]==v){
                    matrix[r][c]=null;
                }
            }
            System.out.print("\n");
        }


        return null;
    }
}


