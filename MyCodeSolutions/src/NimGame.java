
public class NimGame {
	public boolean canWinNim(int n) {
        if(n%4==0) return false;
        return true;
    }
	public static void main(String[] args) {
		NimGame ng=new NimGame();
		System.out.println(ng.canWinNim(4));
		System.out.println(ng.canWinNim(15));
		System.out.println(ng.canWinNim(36));

	}

}
