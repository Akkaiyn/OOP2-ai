public class Seasons {


  void answer (int a){

      if(a >= 1 && a<=2 ){
          System.out.println("kysh");
      }else if (a == 6 || a == 7 || a == 8){
          System.out.println(sommer.answer());
      }else if (a == 9 || a == 10 || a == 11){
          System.out.println(autumn.answer());
      } else if(a == 1 || a == 2 || a == 12){
          System.out.println(winter.answer());
      } else {
          System.out.println("Myndai katar  nomerdegi ay jok!");}
    }
}
