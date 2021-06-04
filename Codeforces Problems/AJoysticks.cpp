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

int cn = 0 ;
void solve(int a1,int a2){
    if(a1 <= 1 && a2 <= 1){
        cout<<"0";
        return;
    }
    while(true){
        if(a1 <= a2){
            a2-=2;
            a1++;
            cn++;
            if(a1 == 0 || a2 == 0){
                cout<<cn;
                return;
            }
        }
        else{
            a1-=2;
            a2++;
            cn++;
            if(a1 == 0 || a2 == 0){
                cout<<cn;
                return;
            }
        }
        if(a1 <= 2 && a2 <= 2){
            cn++;
            break;
        }
    }
    cout<<cn;
}

int main(){
    int a1,a2;
    cin>>a1>>a2;
    solve(a1,a2);
}