package HighPerfomance;

public class Pilha {
    final int N = 10;

    int dados [] = new int[N];
    int i;

   public void init (){
        i = 0;
    }

    public void push(int element){
       if (!isFull()){
           dados[i] = element;
           i++;
       }else {
           System.out.println("Stack Overflow");
       }
    }


    public boolean isFull(){

       return (i == N);
    }

    public boolean isEmpty(){
       return (i == 0);
    }

    public int pop (){
        i--;
        return dados[i];
    }

    public void esvazia(){
       while (!isEmpty()){
           System.out.println("\t" + pop());
       }
    }

    public int top(){
       return dados[i-1];
    }

}
