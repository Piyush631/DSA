package Oops;

public class ComplexNumber {
    public static void main(String[] args) {
        Complex c1=new Complex(4,5);
        Complex c2=new Complex(5,6);
        Complex e=Complex.add(c1,c2);
        e.Print();
      
    
}
}

class Complex{
    int real;
    int img;
    public Complex(int r , int i ){
        real=r;
        img=i;

    }
    
    public static Complex add(Complex a, Complex b){
        return new Complex((a.real+b.real),(a.img+b.img));
    }
    public void Print()
    {
        if(real==0 && img!=0)
        {
            System.out.println(img+"i");
        }
        else if(real !=0 && img==0)
        {
            System.out.println(real);
        }
        else{
            System.out.println(real +"+"+img+"i");
        }
    }
}
