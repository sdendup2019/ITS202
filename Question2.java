//2. Implement LSD radix sort.
public class Question2{
	public static void main(String[] args){
		String[] a={"Sonam", "Karma", "Jigme", "Sampa", "Jonny"};
		int n=a.length;
		int R=26;
		int w=5;
		String[] aux=new String[n];
		for (int d=w-1; d>=0;d--){
			int [] count=new int[R+1];

			//Compute frequency counts
			for (int i=0;i<n;i++)
				count[a[i].charAt(d)+1]++;

			for (int r = 0; r < R; r++)
			// Transform counts to indices.
				count[r+1] += count[r];

			for (int i = 0; i < n; i++)
			// Distribute.
				aux[count[a[i].charAt(d)]++] =a[i];

			for (int i = 0; i < n; i++)
			// Copy back.
				a[i] = aux[i];
		}
		for(int i = 0;i<n;i++){
			System.out.println(" "+ a[i]);
		}
	}
}