package org.example.mioeserciziario.mystring;

public class MyString {
    private String stringa;

    public MyString(String stringa) {
        this.stringa = stringa;
    }

    public MyString clone() {
        return new MyString(stringa);
    }

    @Override
    public boolean equals(Object j) {
        String second = ((MyString) j).getStringa();
        int dimFirst = stringa.length();
        int dimSecond = second.length();
        char pattern;
        boolean flag;

        for (int i = 0; i < dimFirst; ++i) {
            flag = false;
            pattern = stringa.charAt(i);
            for (int x = 0; x < dimSecond; ++x) {
                if (pattern == second.charAt(x)) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                return false;
            }
        }

        for (int i = 0; i < dimSecond; ++i) {
            flag = false;
            pattern = second.charAt(i);
            for (int x = 0; x < dimFirst; ++x) {
                if (pattern == stringa.charAt(x)) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                return false;
            }
        }

        return true;
}

    public String getStringa() {
        return stringa;
    }

    public boolean anagramma(MyString secondMyStr){
        return false;
    }

    //TODO fare metodo hashCode()
}
