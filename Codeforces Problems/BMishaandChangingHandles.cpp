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
#define gu(a,s) get<a>(s)
#define tup tuple<ll,ll,ll>
#define vt vector<tup>
#define ter(x,y,z) ((x)?y:z)
#define ul ll
/////////////
 
const ll maxn = 2e5 + 5;
const ll max_val = 2e5 + 10;
ll mod = 1e9 + 7;
const ll bits = 20;
ll caseNumber = 1;
////////////////////////////////////////////////////////////////
 
vector<pair<string, string> > v;

int check(string str, int j){
    for(int i = 0 ; i < j ; i++){
        if(str == v[i].second){
            return i;
        }
    }
    return -1;
}

void solve(){
    int q; 
    cin>>q;
    // string str1,str2;
    // for(int i = 0 ; i < q ; i++){
    //     cin>>str1>>str2;
    //     if(check(str1,i) != -1){
    //         int index = check(str1,i);
    //         v[index].second = str2;
    //     }
    //     else{
    //         v.pb({str1, str2});
    //     }
    // }
    // cout<<v.size()<<endl;
    // for(int i = 0 ; i < v.size() ; i++){
    //     cout<<v[i].first<<" "<<v[i].second<<endl;
    // }

//  OR 

    string x,y;
    int i;
     while(q--)
        {
            cin>>x>>y;
            for(i=0; i<v.size(); i++)
            {
                if(v[i].second==x)
                {
                    v[i].second=y;
                    break;
                }

            }
            if(i==v.size())
                v.push_back(make_pair(x,y));

        }
        cout<<v.size()<<endl;
        for(i=0; i<v.size(); i++)
        {
            cout<<v[i].first<<" "<<v[i].second<<"\n";
        }
} 








bool TestCase = 0;
bool isGoogles = 0;
 
 
 
//////////////////////////////////////////////////////////////////
 
 


//////////////////////////////////////////////////////////
 
int main() {
	// freopen("input.txt", "r", stdin);
	// freopen("output.txt", "w", stdout);
	ios::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);
 
	ll t;
	t = 1;
	if (TestCase) {
		cin >> t;
	}
	while (t--) {
		if (isGoogles) {cout << "\nCase #" << caseNumber << ": ";} caseNumber++;
		solve();
 
	}
	return 0;
}

/* stuff you should look for
	* int overflow, array bounds
	* choose data type according to range don't go for int directly.
	* special cases (n=1?)
	* do smth instead of nothing and stay organized
	* WRITE STUFF DOWN
	* DON'T GET STUCK ON ONE APPROACH
 
*/