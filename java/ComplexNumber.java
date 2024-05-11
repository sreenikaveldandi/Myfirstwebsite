class ComplexNumber {
    int real;
    int imaginary;
    void print(){
        System.out.println(real+"+"+imaginary+"i");
    }
}
class Main{
    public static void main(String args[]){
        ComplexNumber x=new ComplexNumber();
        x.real=2;
        x.imaginary=3;
        x.print();

    }
}
