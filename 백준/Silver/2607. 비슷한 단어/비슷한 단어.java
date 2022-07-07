import java.util.*;

public class Main {
	public static void main(String[] args) {
    // 정답 ans
		int ans = 0;
		
		Scanner sc = new Scanner(System.in);
    // 처음 단어 first의 입력을 위해 나머지 값들의 입력 N을 하나 뺴준다.
		int N = sc.nextInt() - 1;
		
    // 맨 처음 단어 firstin
		String firstin = sc.next();
			
    // 처음 단어에 대해 나머지를 진행한다.
		for(int i=0; i<N; i++) {
      // 비교할 단어 입력
			String compare = sc.next();
      // 처음 단어와 이후 입력될 단어들을 배열로 만들어 저장해 준다.
			char first[] = firstin.toCharArray();
			char next[] = compare.toCharArray();
			
      // 비교하여 같은 값의 개수를 저장한 contain변수이다.
			int contain = 0;
			
      // 각각 첫번째와 다음 단어를 비교하여 같으면 contain을 늘려 주고, 다시 겹치지 않게 임의의 글자를 넣어준다. 나는 next는 1, first는 2로 넣었다.
			for(int j=0; j<next.length; j++) {
				for(int k=0; k<first.length; k++) {
					
					if(next[j] == first[k]) {
						next[j] = '1';
						first[k] = '2';
						contain++;
					}
				}
			}
			
      // 1. 처음 단어의 길이가 비교할 단어보다 길거나 같은 경우 -> 비교하여 같은 단어의 개수가 처음 단어의 길이보다 1작거나, 같으면 비슷한 단어이다.
      // 2. 처음 단어의 길이가 비교할 단어보다 짧거나 같은 경우 -> 비교하여 같은 단어의 개수가 다음 단어의 길이보다 1작거나, 같으면 비슷한 단어이다.
			if( ( contain>=first.length-1 && first.length>=next.length ) || ( contain >= next.length-1 && next.length>=first.length ) ) ans++;
			
	//		if(contain >= compare.length()-1 || contain == first.length || (contain >= first.length-1 && first.length > compare.length())) ans++;
		}
		System.out.println(ans);
	}
}