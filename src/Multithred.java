public class Multithred extends Thread{

    @Override
    public void run(){
        for(int i=1;i<10;i++){
//            try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
            System.out.println("printer 1");
        }}
        public static void main(String[] args) {
        Multithred t1=new Multithred();
            Multithred t2=new Multithred();
            t1.start();
            for (int i=0;i<10;i++)
            {
                System.out.println("printer 2");
            }



        }
    }

