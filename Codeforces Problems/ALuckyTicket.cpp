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

ll n;
string str;
ll cn = 0;

ll helper(ll num)
{
    ll sum = 0;
    while (num > 0)
    {
        sum = sum + (num % 10);
        num = num / 10;
    }
    cout << sum << endl;
    return sum;
}

void solve()
{
    string s1 = "";
    string s2 = "";
    for (ll i = 0; i < n; i++)
    {
        if (str.at(i) != '4' && str.at(i) != '7')
        {
            cout << "NO";
            return;
        }
    }
    for (ll i = 0; i < n / 2; i++)
    {
        s1 = s1 + str.at(i);
    }
    cout << s1 << " " << s1.size() << " ";
    for (ll i = (n / 2); i < n; i++)
    {
        s2 = s2 + str.at(i);
    }
    cout << s2 << " " << s2.size() << endl;
    stringstream obj1(s1);
    ll temp = 0;
    obj1 >> temp;

    stringstream obj2(s2);
    ll temp2;
    obj2 >> temp2;
    if (helper(temp) == helper(temp2))
    {
        cout << "YES";
    }
    else
    {
        cout << "NO";
    }

    return;
}

int main()
{
    cin >> n >> str;
    solve();
}