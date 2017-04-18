public class Main{
    public static void main(String[] args){
        Album a1 = new Album("Dave Brubeck, ", "Time Out, ", "1959, ", "Jazz");
        Album a2 = new Album("Chuck Berry, ", "Chuck Berry Is on Top, ", "1959, ", "Rock and Roll");

        Album[] Albums = new Album[2];
        Albums[0] = a1;
        Albums[1] = a2;

        for(Album p: Albums){
            System.out.println(p.name + p.albumName + p.year + p.genre);
        }
    }
}
