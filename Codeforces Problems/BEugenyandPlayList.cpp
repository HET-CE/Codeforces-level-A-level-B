//Classic
// //g++ -std=c++17 -O2 -Wall a.cpp -o test
// _()_
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
//#define endl "\n"
#define debug2(x, y) cout << "This side ----> " << #x << " -> " << x << " | " << #y << " -> " << y << endl;
#define debug(x) cout << "This side    ----> " << #x << " -> " << x << endl
#define all(x) x.begin(), x.end()
#define rall(x) x.rbegin(), x.rend()
#define mint map<int, int>
#define mall map<ll, ll>
#define ciN cin
#define gu(a, s) get<a>(s)
#define tup tuple<ll, ll, ll>
#define vt vector<tup>
#define ter(x, y, z) ((x) ? y : z)
#define ul ll
/////////////

const ll maxn = 2e5 + 5;
const ll max_val = 2e5 + 10;
ll mod = 1e9 + 7;
const ll bits = 20;
ll caseNumber = 1;
////////////////////////////////////////////////////////////////
       

int dp[100001];

void solve()
{
    dp[0] = 0;
    int n, m, t1, t2;
    cin >> n >> m;
   
    for (int i = 1; i <= n; i++)
    {
        cin >> t1 >> t2;
            dp[i] = dp[i-1] + t1*t2;
            // cout << "  " << dp[j]<< " "<< j<<" "<< cn<<endl;
    }
    int song = 1;
    int temp;
    for (int i = 0; i < m; i++)
    {
        cin >> temp;
        while (temp > dp[song])
        {
            song += 1;
        }
        cout<<song<<endl;
    }
}


bool TestCase = 0;
bool isGoogles = 0;

//////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////

int main()
{
    // freopen("input.txt", "r", stdin);
    // freopen("output.txt", "w", stdout);
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

    ll t;
    t = 1;
    if (TestCase)
    {
        cin >> t;
    }
    while (t--)
    {
        if (isGoogles)
        {
            cout << "\nCase #" << caseNumber << ": ";
        }
        caseNumber++;
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