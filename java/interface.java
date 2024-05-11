interface rbi {
    int ir=6;
    void irate();
}
class sbi implements rbi{
    public void irate(){
        System.out.println(ir+2);
    }
}
class icici implements rbi{
    public void irate(){
        System.out.println(ir+2);
    }
}
class hdfc implements rbi{
    public void irate(){
        System.out.println(ir+2);
    }
}
class Test{
    public static void main(String args[]){
        sbi s=new sbi();
        s.irate();
        icici i=new icici();
        i.irate();
        hdfc h=new hdfc();
        h.irate();
    }
}
