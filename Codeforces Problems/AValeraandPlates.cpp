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

int n, m, k;
int temp, cn = 0;
void solve()
{
    cin >> temp;
    if (temp == 1)
    {
        if (m == 0)
        {
            cn++;
            // m = 1;
        }
        else
            m--;
    }
    else
    {
        if (k == 0)
        {
            if (m != 0)
            {
                m--;
            }
            else if (m == 0)
            {
                cn++;
            }
        }
        else    
            k--;
    }
    // cout<<cn<<" "<<m<<" "<<k<<endl;
}

int main()
{
    cin >> n >> m >> k;
    for (int i = 0; i < n; i++)
        solve();

    // cout<<endl;    
    cout << cn;
}