 void main () {
//   /**
//   * This is a simple Java exploratory program
//   */
        byte lol = -127; // 1 byte: -128 to 127
        short lol2 = -10000; // 2 bytes: -32,768 to 32, 767
        int lol3 = -1000000; // 4 bytes: –2,147,483,648 to 2,147,483,647
        long lol4 = -1000000000L; // 8 bytes: –9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        IO.print("byte = " + lol);
        IO.print(" short = " + lol2);
        IO.print(" int = " + lol3);
        IO.println(" long = " + lol4);

     var sum = 4000000000L - 400000000L; // Longs
     IO.println("sum is " + sum);
     var sum2 = 0b01101101 + 0b1000101; // Binary (109 + 69)
     IO.println("sum is " + sum2);
     var sum3 = 0xCAFE + 0xCAFE; // Hexadecimals (51966 + 51966)
     IO.println("sum is " + sum3);
     var sum4 = 010 * 010; // Octal (8 * 8)
     IO.println("sum is " + sum4);

     int lolU = Byte.toUnsignedInt(lol); // negative values go to opposite side so -128 becomes 128
     IO.println("byte to unsigned int = " + lolU);

     float floaty = 0.243343F;
     double doubly = 0.2323482432872342D;
     float exponent = 1.786E3F;
     IO.println("float is " + floaty);
     IO.println("double is " + doubly);
     IO.println("exponent is " + exponent);

     char a = 'A';
     char b = 'B';
     IO.print("char is " + a + "\n");
     IO.print("char is " + b + "\n");
    }

