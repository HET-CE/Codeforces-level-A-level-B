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

int solve(char n){
    if(n == 'q' or n == 'Q'){
        return 9 ;
    }
    else if(n == 'r' or n == 'R'){
        return 5;
    }
    else if(n == 'b' or n == 'B'){
        return 3;
    }
    else if(n == 'n' or n == 'N'){
        return 3;
    }
    else if(n == 'p' or n == 'P'){
        return 1;
    }
    else if(n == 'k' or n == 'K'){
        return 0;
    }
}
int main(){
    string str[8];
    for(int i = 0 ; i < 8 ; i++){
        cin>>str[i];
    }
    int cn1 = 0, cn2 = 0;
    for(int i = 0 ; i < 8 ; i++){
        for(int j = 0 ; j < 8 ; j++){
            if(str[i].at[j] > 'A' && str[i].at[j] < 'Z'){
                cn1 += solve(str[i].at[j]);
            }
            else
                cn2 += solve(str[i].at[j]);
        }
    }
}