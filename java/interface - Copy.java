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
