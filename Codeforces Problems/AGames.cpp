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

int main(){
    vp v;
    int n,a,b;
    cin>>n;
    for(int i = 0 ; i < n ; i++){
        cin>>a>>b;
        v.pb(mp(a,b));
    }

    int cn =0;
    for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j < n ; j++){
            if(v[i].F == v[j].S){
                cn++;
            }
        }
    }
    cout<<cn;
}