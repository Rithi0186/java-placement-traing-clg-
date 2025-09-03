class Main {
    public static void main(String[] args) {
   int a=(int)56.89;
   System.out.println(a);//float to int
   byte b=78;
   int c=(int)b;//byte to int
   int z=89;
   float y=(float)z;//int to float
   System.out.println(y);
   System.out.println(c);
   String str ="67";
   int s=Integer.parseInt(str);//str to int
   System.out.println(s);
   String flt="67.89";
   float f = Float.parseFloat(flt);//string to float
   System.out.println(f);
   int ab=45;
   String str2 =String.valueOf(ab);//int to string
   System.out.println(str2);
    }
}
