package datastructures;

public class MergeSort {
	public static void main(String[] args) {
		String[] a = { "Kring", "Panda", "Soliel", "Darryl", "Chan", "Matang", "Jollibee.", "Inasal" };
		String[] b = { "Minnie", "Kitty", "Madonna", "Miley", "Zoom-zoom", "Cristine", "Bubbles", "Ara", "Rose", "Maria" };
		String[] c = new String[a.length + b.length];
		mergeSort(a);
		mergeSort(b);
		merge(c, a, b);
		mergeSort(c);
		//Arrays.sort(names);
		for (String arr: c) {
			System.out.println(arr);
		}
	}

	public static void mergeSort(String[] c) {
		if (c.length > 1) {
			String[] a = new String[c.length / 2];
			String[] b = new String[c.length - c.length / 2];
			for (int so = 0; so < a.length; so++) {
				a[so] = c[so];
			}
			for (int ki = 0; ki < b.length; ki++) {
				b[ki] = c[ki + c.length / 2];
			}
			mergeSort(a);
			mergeSort(b);
			merge(c, a, b);
		}
	}

	public static void merge(String[] nameH, String[] leftH, String[] rightH) {
		int as = 0;
		int bs = 0;
		for (int i = 0; i < nameH.length; i++) {
			if (bs >= rightH.length || (as < leftH.length && leftH[as].compareToIgnoreCase(rightH[bs]) < 0)) {
				nameH[i] = leftH[as];
				as++;
			} else {
				nameH[i] = rightH[bs];
				bs++;
			}
		}
	}
}