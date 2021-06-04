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

string solve(int n){
    if(n == 0)
        return "zero";
    else if(n == 1)
        return "one";
    else if(n == 2)
        return "two";
    else if(n == 3)
        return "three";
    else if(n == 4)
        return "four";
    else if(n == 5)
        return "five";
    else if(n == 6)
        return "six";
    else if(n == 7)
        return "seven";
    else if(n == 8)
        return "eight";
    else if(n == 9)
        return "nine";
    else if(n == 10)
        return "ten";
    else if(n == 11)
        return "eleven";
     else if(n == 12)
        return "twelve";
    else if(n == 13)
        return "thirteen";
    else if(n == 14)
        return "fourteen";
    else if(n == 15)
        return "fifteen";
    else if(n == 16)
        return "sixteen";
    else if(n == 17)
        return "seventeen";
    else if(n == 18)
        return "eighteen";
    else if(n == 19)
        return "nineteen";
    else if(n == 20)
        return "twenty";
    else if(n == 30)
        return "thirty";
    else if(n == 40)
        return "forty";
    else if(n == 50)
        return "fifty";
    else if(n == 60)
        return "sixty";
    else if(n == 70)
        return "seventy";
    else if(n == 80)
        return "eighty";
    else if(n == 90)
        return "ninety";
    else if(n >= 21 && n <= 29){
        return solve(20) +  "-" + solve(n%10);
    }   
    else if(n >= 31 && n <= 39){
        return solve(30) +  "-" + solve(n%10);
    }
    else if(n >= 41 && n <= 49){
        return solve(40) +  "-" + solve(n%10);
    }
    else if(n >= 51 && n <= 59){
        return solve(50) +  "-" + solve(n%10);
    }
    else if(n >= 61 && n <= 69){
        return solve(60) +  "-" + solve(n%10);
    }
    else if(n >= 71 && n <= 79){
        return solve(70) + "-" +  solve(n%10);
    }
    else if(n >= 81 && n <= 89){
        return solve(80) + "-" +  solve(n%10);
    }
    else if(n >= 91 && n <= 99){
        return solve(90) + "-" + solve(n%10);
    }
    return "";
}

int main(){
    int n;
    cin>>n;
    cout<<solve(n);
}