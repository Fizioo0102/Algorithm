#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<utility>
#include<algorithm>
#include<queue>
#define P pair<int,int>
#define PP pair<P,P>
#define mp(a,b) make_pair(a,b)
using namespace std;
 
int n, t, res;
P arr[50001];
bool visit[50001];
 
int bfs();
 
bool cmp(P a, P b) {
    if (a.second == b.second) return (a.first < b.first);
    else return (a.second < b.second);
}
 
int main() {
 
    scanf("%d%d", &n, &t);
 
    for (int i = 0; i < n; i++) 
        scanf("%d%d", &arr[i].first, &arr[i].second);
    
    sort(arr, arr + n, cmp);
 
    printf("%d\n", bfs());
 
    return 0;
}
 
int bfs() {
    queue<PP> Q;
    Q.push(mp(mp(0, 0), mp(0,0)));
 
    while (!Q.empty()) {
        int cx = Q.front().first.first;
        int cy = Q.front().first.second;
        int cnt = Q.front().second.first;
        int idx = Q.front().second.second;
        Q.pop();
 
        if (cy == t) return cnt;
 
        for (int i = idx; i < n; i++) {
            int nx = arr[i].first;
            int ny = arr[i].second;
            if (!visit[i]) {
                if ((abs(cx - nx) <= 2) && (abs(cy - ny) <= 2)) {
                    visit[i] = true;
                    Q.push(mp(mp(nx, ny), mp(cnt + 1, i)));
                }
                else if ((abs(cx - nx) > 2) && (abs(cy - ny) > 2)) break;
            }
        }
 
        for (int i = idx; i >= 0; i--) {
            int nx = arr[i].first;
            int ny = arr[i].second;
            if (!visit[i]) {
                if ((abs(cx - nx) <= 2) && (abs(cy - ny) <= 2)) {
                    visit[i] = true;
                    Q.push(mp(mp(nx, ny), mp(cnt + 1, i)));
                }
                else if ((abs(cx - nx) > 2) && (abs(cy - ny) > 2)) break;
            }
        }
 
    }
 
    return -1;
}
