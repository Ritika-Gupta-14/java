 class c {
    int l=31;
    void m(){
        System.out.println(this.l);
    }
    
}
class cl{
    public static void main(String[] args) {
        
        c n=new c();
        System.out.println(n.l);
    }
}