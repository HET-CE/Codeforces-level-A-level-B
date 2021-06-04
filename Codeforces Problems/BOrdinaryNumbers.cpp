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
// #define debug2(x,y) cout<<"This side ----> "<<#x<<" -> "<<x<<" | "<<#y<<" -> "<<y<<endl;
// #define debug(x) cout<<"This side    ----> "<<#x<<" -> "<<x<<endl
#define all(x) x.begin(),x.end()
#define rall(x) x.rbegin(), x.rend()
#define mint map<int,int>
#define mall map<ll,ll>
// #define ciN cin
// #define gu(a,s) get<a>(s)
#define tin tuple<ll,ll,ll>
#define ter(x,y,z) ((x)?y:z)
// #define ul ll

void solve(){
    int n;
    cin>>n;
    int cn = 0;
    for(int i = 1 ; i <= n ; i++) {
        string str = to_string(i);
        bool flag = true;
    
        for(int i = 0; i < str.size() - 1 ; i++){
            if(str.at(i) != str.at(i+1)){
                flag = false;
                break;
            }
        }
        if(flag == true)
            cn++;
    }
    cout<<cn<<endl;
}

int main(){
    int t;
    cin>>t;
    while(t--){
        solve();
    }
}