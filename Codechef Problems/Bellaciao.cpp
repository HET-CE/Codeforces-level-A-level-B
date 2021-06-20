//Classic
// //g++ -std=c++17 -O2 -Wall a.cpp -o test
// _()_
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
 
void solve(){
    ll D,d,p,q, cn = 0 , x,y;
    cin>>D>>d>>p>>q;
    x = D/d;

    if(x%2 == 0){
        cn += d * ((x / 2) * (2 * p + (x -1) * q));
    }
    else{
        cn += d * (x * (p + ((x - 1) / 2) * q )); 
    }
    cn += (D %d) * (p + (x) * q);
    
    cout<<cn<<endl;
} 








bool TestCase = 1;
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

// int cn = 0,sum = 0;
//     while(D--){
//         cn++;
//         sum += p;
//         if(cn == d){
//             p = p + q;
//             cn = 0;
//         }
//     }
//     cout<<sum<<endl;