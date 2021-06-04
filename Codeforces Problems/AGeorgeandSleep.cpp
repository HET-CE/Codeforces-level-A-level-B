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
    string s1,s2;
    cin>>s1>>s2;
    stringstream obj1(s1.substr(0,2));
    stringstream obj2(s2.substr(0,2));
    int xH = 0, yH = 0;
    obj1 >> xH;
    obj2 >> yH;
    string resStr;
    if((xH - yH) < 0){
        int res = 24 - abs(xH - yH);
        string temp = to_string(res);
        if(res >= 0 && res <= 9){
            resStr = "0" + temp;
        }
        else{
            resStr = temp;
        }
    }
    else if((xH - yH) == 0){
        resStr = "00";
    }
    else{
       int res = xH - yH;
        string temp = to_string(res);
        if(res >= 0 && res <= 9){
            resStr = "0" + temp;
        }
        else{
            resStr = temp;
        } 
    }

    resStr += ":";

    stringstream obj3(s1.substr(3,2));
    stringstream obj4(s2.substr(3,2));
    int xM = 0, yM = 0;
    obj3 >> xM;
    obj4 >> yM;
    // string resStr;
    if((xM - yM) < 0){
        int res = 60 - abs(xM - yM);
        string temp = to_string(res);
        if(res >= 0 && res <= 9){
            resStr += "0" + temp;
        }
        else{
            resStr += temp;
        }
    }
    else if((xM - yM) == 0){
        resStr += "00";
    }
    else{
       int res = xM - yM;
        string temp = to_string(res);
        if(res >= 0 && res <= 9){
            resStr += "0" + temp;
        }
        else{
            resStr += temp;
        } 
    }
    cout<<resStr;
}