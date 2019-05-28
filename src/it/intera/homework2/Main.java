package it.intera.homework2;

public class Main {

    private static int sum = 0;

    public static void main(String[] args) {
        String[][] strs = new String[][]{
            {"1","2","3","4"},
            {"1","2","3","4"},
            {"1","2","3","4"},
        };

        convertToInt(strs);



    }

    private static void convertToInt(String[][] strs) {

        try {
            if (strs.length != 4) throw new MyArraySizeException();
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].length != 4) throw new MyArraySizeException();
                for (int j = 0; j < strs[i].length; j++) {
                    if (isInteger(strs[i][j])) {
                        sum = sum + Integer.valueOf(strs[i][j]);
                    }else {
                        throw new MyArrayDataException(i,j);
                    }
                }
            }

            System.out.println("Результат до исключения = " + sum);

        }catch(MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }


    }

    private static boolean isInteger(String s) {
        try {
            Integer.valueOf(s);
        }catch(NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}
