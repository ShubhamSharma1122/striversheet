package com.striver.easy.array;

import java.util.ArrayList;
import java.util.List;

public class UnionOfArrays {

	public static void main(String[] args) {
		int n[] = { 1, 2, 3, 4, 5 };
		int m[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		UnionOfArrays union = new UnionOfArrays();


		List<Integer> answer = union.unionOfarray(n, m);

		for (Integer i : answer) {
			System.out.println(i + " ");
		}
	}

	public List unionOfarray(int n[], int m[]) {

		int nsize = n.length;
		int msize = m.length;
		List<Integer> answer = new ArrayList<>();

		int i = 0;
		int j = 0;
		while (i < nsize && j < msize) {

			if (n[i] < m[j]) {
				if (answer.isEmpty() || answer.get(answer.size() - 1) != n[i]) {
					answer.add(n[i]);
					i++;
				} else if (n[i] > m[j]) {
					if (answer.isEmpty() || answer.get(answer.size() - 1) != m[j])
						answer.add(m[j]);
					j++;
				}

				else {
					if (answer.isEmpty() || answer.get(answer.size() - 1) != n[i]) {
						answer.add(n[i]);
						i++;
						j++;

					}
				}

				while (i < nsize) {
					if (answer.isEmpty() || answer.get(answer.size() - 1) != n[i]) {
						answer.add(n[i]);
						i++;
					}
				}

				while (j < msize) {
					if (answer.isEmpty() || answer.get(answer.size() - 1) != n[i]) {
						answer.add(n[i]);

						j++;

					}
				}
			}
			
		}
		return answer;
	}
		

}
