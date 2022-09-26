#include<iostream> 
#include<queue>
#include<vector>
#include<string.h>
#include<algorithm>
using namespace std;

int arr[50];
int main() {
	int N;
	cin >> N;
	for (int i = 0; i < N; i++)
		cin >> arr[i];
	int M;
	cin >> M;
	for (int i = 0; i < N; i++)
	{
		int max = arr[i];
		int maxi = i;
		for (int j = i + 1; j < N; j++)
		{
			if (M - (j - i) >= 0)
			{
				if (max < arr[j])
				{
					max = arr[j];
					maxi = j;
				}
			}
		}
		for (int j = maxi; j > i; j--)
			swap(arr[j], arr[j - 1]);
		M -= (maxi - i);
		if (M <= 0)
			break;
	}

	for (int i = 0; i < N; i++)
		cout << arr[i] << " ";
}