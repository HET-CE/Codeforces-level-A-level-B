#include <bits/stdc++.h>
using namespace std;
#define ll long long
#define ld long double
#define vll vector<ll>
#define vi vector<int>
#define vb vector<bool>
#define pi pair<int, int>
#define pll pair<ll, ll>
#define vp vector<pi>
#define vpll vector<pll>
#define pb push_back
#define mp make_pair
#define mt make_tuple
#define F first
#define S second
#define For(i, a, b) for (ll i = a; i < b; i++)
// #define debug2(x,y) cout<<"This side ----> "<<#x<<" -> "<<x<<" | "<<#y<<" -> "<<y<<endl;
// #define debug(x) cout<<"This side    ----> "<<#x<<" -> "<<x<<endl
#define all(x) x.begin(), x.end()
#define rall(x) x.rbegin(), x.rend()
#define mint map<int, int>
#define mall map<ll, ll>
// #define ciN cin
// #define gu(a,s) get<a>(s)
#define tin tuple<ll, ll, ll>
#define ter(x, y, z) ((x) ? y : z)
// #define ul ll

// int main() {
// 	// freopen("input.txt", "r", stdin);
// 	// freopen("output.txt", "w", stdout);
// 	ios::sync_with_stdio(0);
// 	cin.tie(0);
// 	ll t;
// 	t = 1;
// 	if (TestCase) {
// 		cin >> t;
// 	}
// 	while (t--) {
// 		if (isGoogles) {cout << "Case #" << caseNumber << ": ";} caseNumber++;
// 		jabru();
 
// 	}
// 	return 0;
// }


int main(){
    int n,m;
    int c1=0,c2=0;
    scanf("%d%d",&n,&m);
    int temp;
    while(n--){
        scanf("%d",&temp);
        if(temp == -1){
            c1++;
        }
        else{
            c2++;
        }
    }
    int mini = min(c1,c2) * 2 ;
    int t1,t2;
    while(m--){
        scanf("%d%d",&t1,&t2);
        if((t2 - t1) % 2 == 1 && (t2 - t1) < mini){
            printf("1\n");
        }
        else{
            printf("0\n");
        }
    }
}
