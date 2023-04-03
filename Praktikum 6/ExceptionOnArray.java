/*
Nama File   : ExceptionOnArray.Java 29/03/23
Pembuat     : Annisa Kumala Dewi - 24060121120025
Deskripsi   : Program penggunaan eksepsi menggunakan class library Java
Lab         : B1
*/

public class ExceptionOnArray{
    public static void main(String[] args){
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }
        catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }
        finally{
            System.out.println("clean up code .....");
        }
    }
}
