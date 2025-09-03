class Main {
    public static void main(String[] args) {
        int a= 130;
        byte b=(byte)a;//byte range is 128 ,when it reach more than that the scale will rotate
        //-128 -127 -126 -125...0 126 127(here 128=-128, 129=-127,130=-126)
        System.out.println(b);
    }
}
