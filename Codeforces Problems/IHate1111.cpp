#include<bits/stdc++.h>
using namespace std;
#define ll long long
#define ld long double
#define vll vector<ll>
#define vi vector<int>
#define vb vector<bool>
#define pi pair<int,int>
#define pll pair<ll,ll>
#define vp vector<pi>
#define vpll vector<pll>
#define pb push_back
#define mp make_pair
#define mt make_tuple
#define F first
#define S second

const long long INF = 1e18;
const int32_t M = 1e9 + 7; 
const int32_t MM = 998244353;
const int N = 0;

void solve(){
    ll x; cin >> x;
	for (ll j = 0; j < 1e7; j++) {
		ll here = j * 111;
		if (here > x)break;
		ll rem = x - here;
		if (rem % 11 == 0) {
			cout << "YES" << endl; return;
		}
	}
	cout << "NO" << endl;
}

int main(){
    int t=1;
    cin>>t;
    while(t--){
        solve();
    }
    return 0;
}