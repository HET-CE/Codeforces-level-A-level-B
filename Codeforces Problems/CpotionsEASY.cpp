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
#define For(i,a,b) for(ll i=a;i<b;i++)
//#define endl "\n"
#define debug2(x,y) cout<<"This side ----> "<<#x<<" -> "<<x<<" | "<<#y<<" -> "<<y<<endl;
#define debug(x) cout<<"This side    ----> "<<#x<<" -> "<<x<<endl
#define all(x) x.begin(),x.end()
#define rall(x) x.rbegin(), x.rend()
#define mint map<int,int>
#define mall map<ll,ll>
#define ciN cin
#define gu(a,s) get<a>(s)
#define tin tuple<ll,ll,ll>
#define ter(x,y,z) ((x)?y:z)
#define ul ll
/////////////
 
const ll maxn = 2e5 + 5;
const ll max_val = 2e5 + 10;
ll mod = 1e9 + 7;
const ll bits = 20;
ll caseNumber = 1;
////////////////////////////////////////////////////////////////
 
void solve() {
	ll n; cin >> n;
	vll v(n);
	ll ans = 0;
	for (int i = 0; i < n; i++) {
		cin >> v[i];
		if (v[i] >= 0)ans++;
	}
	vll pref(n);
	ll sum = 0;
	set <pair<ll, ll>>s;
	for (int i = 0; i < n; i++) {
		if (v[i] >= 0)
			sum += v[i];
		pref[i] = sum;
		if (v[i] < 0) {
			s.insert(mp(-v[i], i));
		}
	}
	for (auto x : s) {
		bool flag = 1;
		for (int j = x.S; j < n; j++) {
			if (pref[j] < x.F) {
				flag = 0; break;
			}
		}
		if (flag) {
			for (int j = x.S; j < n; j++) {
				pref[j] -= x.F;
			}
			ans++;
		}
	}
	cout << ans << endl;
}
 
 
 
bool TestCase = 0;
bool isGoogles = 0;
 
 
 
//////////////////////////////////////////////////////////////////
 
 
 
 
//////////////////////////////////////////////////////////
 
int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);
 
	ll t;
	t = 1;
	if (TestCase) {
		cin >> t;
	}
	while (t--) {
		if (isGoogles) {cout << "Case #" << caseNumber << ": ";} caseNumber++;
		solve();
 
	}
	return 0;
}
