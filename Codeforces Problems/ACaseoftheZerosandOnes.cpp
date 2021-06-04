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

string str;

void solve()
{
    for (int i = 0; i < str.size() - 1; i++)
    {
        if (str.at(i) == str.at(i + 1))
        {
            // cout << " " << str.at(i) << " ";
        }
        else
        {
            if (str == "10" || str == "01")
            {
                str = "";
                return;
            }
            str = str.substr(0, i) + str.substr(i + 2, str.size() - (i + 2));
            // cout << end << str;
            i = i - 1;
        }
    }
}

int main()
{
    int n;
    cin >> n;
    cin >> str;
    solve();
    if (str == "10" || str == "01")
    {
        str = "";
    }
    cout << str.size();
}