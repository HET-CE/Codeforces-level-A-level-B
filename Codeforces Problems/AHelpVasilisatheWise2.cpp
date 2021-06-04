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

bool solve(int i, int r1, int r2,int c1,int c2, int d1, int d2){
    int a = i;
    int b = r1 - i;
    int c = c1 - i;
    int d = d1 - i;

    if((a == b || a == c || a == d || b == c || b == d || c == d) || a >= 10 || a <= 0 || b >= 10 || b <= 0 || c >= 10 || c <= 0 || d >= 10 || d <= 0)
        return false;
    if(a + b == r1 && c + d == r2 && a + c == c1 && b + d == c2 && a + d == d1 && b + c == d2){
        return true;
    }
    return false;
}

int main(){
    int r1,r2,c1,c2,d1,d2;
    cin>>r1>>r2>>c1>>c2>>d1>>d2;
    bool flag = true;
    for(int i = 1 ; i < r1 ; i++){
        if(solve(i,r1,r2,c1,c2,d1,d2)){
            cout<<i<<" "<<(r1 - i)<<endl;
            cout<<(c1-i)<<" "<<(d1-i)<<endl;
            flag = false;
        }
    }
    if(flag)
        cout<<"-1";
}