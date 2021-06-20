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
 
char helper(string s){
    int p = s.find('-');
    string l = s.substr(0, p);
    string r = s.substr(p + 1);
    int ml = r.find('-');
    string m = r.substr(0, ml);
    r = r.substr(ml+1);

    if(l[0] == l[1] && m[0] == m[1] && r[0] == r[1] && l[1] == m[0] && m[1] == r[0]){
        return 't';
    }
    else{
        if(l[0] > l[1] && m[0] > m[1] && r[0] > r[1] && l[1] > m[0] && m[1] > r[0]){
            return 'p';
        }
        else{
            return 'g';
        }
    }
} 
void solve(){
    int n,j;
    string s,str;
    cin>>n;
    vector<pair<string, tup> > v;

    for(int i = 0 ; i < n ; i++){
        cin>>j;
        cin>>s;
        ll taxi = 0, pizza = 0, girl = 0;
        while(j--){
            cin>>str;
            if(helper(str) == 't')
                taxi++;
            else if(helper(str) == 'p')
                pizza++;
            else if(helper(str) == 'g')
                girl++;
        }
            v.pb(mp(s,mt(taxi, pizza, girl)));
    }

    int max1 = INT_MIN ,max2 = INT_MIN ,max3 = INT_MIN;
    
    for(int i = 0 ; i < v.size() ; i++){
        tuple<ll,ll,ll> temp = v[i].second ;
        if(get<0>(temp) > max1){
            max1 = get<0>(temp);
        }
        if(get<1>(temp) > max2){
            max2 = get<1>(temp);
        }
        if(get<2>(temp) > max3){
            max3 = get<2>(temp);
        }
    }

    vector<string> arr1, arr2, arr3;
    string ss1 = "If you want to call a taxi, you should call: ";
    string ss2 = "If you want to order a pizza, you should call: ";
    string ss3 = "If you want to go to a cafe with a wonderful girl, you should call: ";
    for(int i = 0 ; i < v.size() ; i++){
        tuple<ll,ll,ll> temp = v[i].second ;
        if(get<0>(temp) == max1){
            ss1.append((v[i].first));  
            ss1.append(", ");       
        }
        if(get<1>(temp) == max2){
            ss2.append((v[i].first));  
            ss2.append(", "); 
        }
        if(get<2>(temp) == max3){
            ss3.append((v[i].first));  
            ss3.append(", ");
        }
    }

    cout<< ss1.substr(0,ss1.size() - 2) + "." << endl;
    cout<< ss2.substr(0,ss2.size() - 2) + "." << endl;
    cout<< ss3.substr(0,ss3.size() - 2) + "." << endl;
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