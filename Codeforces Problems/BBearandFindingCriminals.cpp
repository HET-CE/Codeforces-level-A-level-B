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
    int n,a;
    cin>>n>>a;
    vi v;
    int temp;
    for(int i = 0 ; i < n ; i++){
        cin>>temp;
        v.pb(temp);
    }
    int fronttrack = a-1,endtrack=a-1;
    int res = 0;
    
    if(v[fronttrack] == 1){
        res++;
        v[fronttrack] = 0;
    }
    if(fronttrack != 0)
        fronttrack--;
    if(endtrack != n)
        endtrack++;
    while(true){
        if(fronttrack == 0 && endtrack == n)
            break;

        if(v[fronttrack] == 1 && v[endtrack] == 1){
            res += 2;
            v[fronttrack] = 0;
            v[endtrack] = 0;
        }
        else if(fronttrack == 0 && endtrack != n){
            if(v[endtrack] == 1){
                res++;
                v[endtrack] = 0;
            }
        }
        else if(fronttrack != 0 && endtrack == n){
            if(v[fronttrack] == 1){
                res++;
                v[fronttrack] = 0;
            }
        }
        if(fronttrack != 0)
            fronttrack--;
        if(endtrack != n)
            endtrack++;
    }
    cout<<res;
}