public class rakendus {
    public static void main(String[] args) {
		
        ruut r1 = new ruut(3);
        ruut r2 = new ruut(5);
        kuup k1 = new kuup(4, 5);
        kuup k2 = new kuup(9, 2);

		System.out.println("Esimese ruudu(a="+r1.a+") umbermoot on "+r1.umbermoot()+" ja pindala on "+r1.pindala());
		System.out.println("Teise ruudu(a="+r2.a+") umbermoot on "+r2.umbermoot()+" ja pindala on "+r2.pindala());
        System.out.println("Esimese kuubi(a="+k1.a+", b="+k1.b+") ruumala on "+k1.ruumala());
        System.out.println("Teise kuubi(a="+k2.a+",b="+k2.b+") ruumala on "+k2.ruumala());
    }
}