//Het Patel
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
#define mxn 50002

int dp[mxn][7];

void solve()
{

    int m, n;
    cin >> m >> n;
    int t[m + 1][n + 1];

    for (int i = 1; i <= m; i++)
    {
        for (int j = 1; j <= n; j++)
        {
            cin >> t[i][j];
        }
    }

    // dp[i][j] states that how much time needed to work ith paint by jth worker

    for (int j = 1; j <= n; j++)
    {
        int free_at_time = 0; // initialize it with zero
        for (int i = 1; i <= m; i++)
        {
            int start_time = max(free_at_time, dp[i][j - 1]); // it will store the time which j-1th painter  will work for till i paint ,after that time jth painter will do that ith paint
            dp[i][j] = start_time + t[i][j];                  // keep  time(free time) needed stored to do ith paint and add t[i][j] to this
            free_at_time = dp[i][j];                          // now after doing ith paint jth painter will be free i mean after dp[i][j] time ith paint can be done by jth painter
        }
    }

    for (int i = 1; i <= m; i++)
        cout << dp[i][n] << " ";
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