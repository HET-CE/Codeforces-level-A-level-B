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

int main(){
    int n;
    cin>>n;
    string man[n], womanAndChild[n], rat[n],captain[n];
    int m=0,wc=0,r=0,c=0;
    string s1,s2;
    for(int i = 0 ; i < n ; i++){
        cin>>s1;
        cin>>s2;
        if(s2 == "man"){
            man[m]=s1;
            m++;
        }
        else if(s2 == "woman" || s2 == "child"){
            womanAndChild[wc] = s1;
            wc++;
        }
        else if(s2 == "rat"){
            rat[r] = s1;
            r++;
        }
        else{
            captain[c] = s1;
            c++;
        }
    }
      for(int i = 0 ; i < r ; i++){
            cout<<rat[i]<<endl;
        }
        for(int i = 0 ; i < wc ; i++){
            cout<<womanAndChild[i]<<endl;
        }
        for(int i = 0 ; i < m ; i++){
            cout<<man[i]<<endl;
        }
        for(int i = 0 ; i < c ; i++){
            cout<<captain[i]<<endl;
        }   
}