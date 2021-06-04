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

int main()
{
    string s;
    cin >> s;

    stringstream obj(s.substr(0, 2));
    int x = 0;
    obj >> x;

    while (true)
    {
        string res;
        if (x >= 0 && x <= 9)
        {
            res = "0" + to_string(x);
        }
        else
        {
            res = to_string(x);
        }
        string min = res;
        char tempp = min.at(0);
        min[0] = min[1];
        min[1] = tempp;
        res += ":";
        stringstream obj2(min);
        int temp;
        obj2 >> temp;

        if (temp <= 59 && temp > x)
        {
            res += min;
            cout << res;
            break;
        }
        else
        {
            if (x == 23)
                x = 0;
            else if (x >= 15 && x <= 19)
                x = 20;
            else
                x++;
        }
    }
}