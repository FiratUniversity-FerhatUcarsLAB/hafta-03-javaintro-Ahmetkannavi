public class  ACSII {
 public static void main(String[] args) {

    int h=10;
    char ch='A';
    char bos=' ';

    for (int i = 0; i < h; i++) {
        for (int j = h-i; j > 1; j--) {
            System.out.print(bos);
        }
        if(i == h/2){
          for (int m = 0; m < h+1; m++) {
          System.out.print(ch);
          }
        }else{
        System.out.print(ch);
        for (int k = 2*(h-i); k < 2*h; k++) {
            System.out.print(bos);
        }
      }
        System.out.println(ch);

    }
 }
  }
