public class Kasutus{
    public static void main(String[] args){
        Album a1 = new Album("Singer1, ", "Album1, ", "1999, ", "Genre1");
        Album a2 = new Album("Singer2, ", "Album2, ", "1995, ", "Genre2");

        Album[] Albums = new Album[2];
        Albums[0] = a1;
        Albums[1] = a2;

        for(Album p: Albums){
            System.out.println(p.name + p.albumName + p.year + p.genre);
        }
    }
}