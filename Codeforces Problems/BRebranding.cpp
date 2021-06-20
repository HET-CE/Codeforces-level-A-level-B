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

void solve()
{
    int n, m;

    cin >> n >> m;
    string s;

    cin >> s;
    int a[1000];
    for (int i = 97; i <= 122; i++)
    {
        a[i] = i;
    }

    char x, y;
    for (int i = 0; i < m; i++)
    {
        cin >> x >> y;
        for (int j = 97; j <= 122; j++)
        {
            if (a[j] == x)
                a[j] = y;
            else if (a[j] == y)
                a[j] = x;
        }
    }
    for (int i = 0; i < s.size(); i++)
    {
        s[i] = a[s[i]];
        cout << s[i];
    }
    cout << endl;

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